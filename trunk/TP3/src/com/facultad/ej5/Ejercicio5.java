package com.facultad.ej5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Ejercicio5 {

	public static ArrayList<Persona> familia = new ArrayList<Persona>();
	static String path="";
	public static void main(String args[]) throws IOException {
		path = new File("").getCanonicalPath(); 
		try {
			String[] consulta;
			createFamilyList();
			
			String frase = JOptionPane.showInputDialog("Ingrese Consulta...");
			consulta = frase.split("\\(");
			String[] consultandoFamilia = consulta[1].split("\\,");
			String nombre2 = consultandoFamilia[1].substring(0, consultandoFamilia[1].length() -1);
			switch (consulta[0]) {
				case "esHermano": {
					checkHermano(consultandoFamilia[0], nombre2);
					break;
				}
				case "esAbuelo": {
					checkAbuelo(consultandoFamilia[0], nombre2);
					break;
				}
				default: {
					System.out.println("No deberia estar pasando...");
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static void createFamilyList() throws FileNotFoundException,IOException {
		
	
		BufferedReader bufferedReader = new BufferedReader(new FileReader(path+"\\src\\com\\facultad\\ej5\\familia.txt"));
		String line = bufferedReader.readLine();
		String[] parseandoLinea;
		String[] parseandoFamilia;
		String nombreHijo;
		Persona unidadPaternal;
		Persona hijo;
		while (line != null) {
			//System.out.println(line);
			parseandoLinea = line.split("\\(");
			
			parseandoFamilia = parseandoLinea[1].split("\\,");
			//Se agrega el padre solo si no esta
			unidadPaternal = checkPersona(parseandoFamilia[0]);
			if (unidadPaternal == null) {
				unidadPaternal = Persona.getInstance(parseandoFamilia[0]);
				familia.add(unidadPaternal);
			}
			//nombre del metodo
			nombreHijo = parseandoFamilia[1].substring(0, parseandoFamilia[1].length() -1);
			hijo = checkPersona(nombreHijo);
			
			switch(parseandoLinea[0]){
				case "padre": {
					if (hijo == null) {
						familia.add(Persona.getInstanceAsFather(nombreHijo,unidadPaternal));
					}
					else {
						hijo.setPadre(unidadPaternal);
					}
					break;
				}
				case "madre": {
					if (hijo == null) {
						familia.add(Persona.getInstanceAsMother(nombreHijo,unidadPaternal));
					}
					else {
						hijo.setMadre(unidadPaternal);
					}
					break;
				}
				default: {
					System.out.println("Esto no deberia estar pasando");
					break;
				}
			}
			
			line = bufferedReader.readLine();
		}
	}
	
	public static Persona checkPersona(String nombre){
		for (Persona iterable_element : familia) {
			if (iterable_element.getNombre().equalsIgnoreCase(nombre)) {
				return iterable_element;
			}
		}
		return null;
	}
	
	public static void checkHermano(String nombreHermano1, String nombreHermano2) {
		Persona hermano1 = findPersona(nombreHermano1);
		Persona hermano2 = findPersona(nombreHermano2);
		if ((hermano1 != null && hermano2 != null)) {
			if(hermano1.getNombrePadre().equalsIgnoreCase(hermano2.getNombrePadre()) ||
				hermano1.getNombreMadre().equalsIgnoreCase(hermano2.getNombreMadre())) {
				System.out.println("Si");
				return;
			}
		}
		System.out.println("No");
//		for (Persona hermano1 : familia) {
//			if (hermano1.getNombre().equalsIgnoreCase(nombreHermano1)) {
//				if (hermano1.getPadre() != null) {
//					for (Persona hermano2 : familia) {
//						if (hermano2.getNombre().equalsIgnoreCase(nombreHermano2)) {
//							if (hermano2.getPadre() != null) {
//								if(hermano1.getPadre().getNombre().equalsIgnoreCase(hermano2.getPadre().getNombre())){
//									System.out.println("Si");
//									return;
//								}
//							}
//						}
//					}
//				}
//				else {
//					if (hermano1.getMadre() != null) {
//						for (Persona hermano2 : familia) {
//							if (hermano2.getNombre().equalsIgnoreCase(nombreHermano2)) {
//								if (hermano2.getMadre() != null) {
//									if(hermano1.getMadre().getNombre().equalsIgnoreCase(hermano2.getMadre().getNombre())){
//										System.out.println("Si");
//										return;
//									}
//								}
//							}
//						}
//					}
//				}
//			}
//		}
//		System.out.println("No");
	}
	
	public static void checkAbuelo(String nombreAbuelo,String nombreNieto){
		Persona abuelo = findPersona(nombreAbuelo);
		Persona nieto = findPersona(nombreNieto);
		if ((nieto != null && abuelo != null)) {
			Persona padreGenerico;
			Persona abueloGenerico;
			for (int i = 0; i < 2; i++) {
				padreGenerico = nieto.getUnidadPaternalGenerica(i);			
				if (padreGenerico != null) {
					for (int j = 0; j < 2; j++) {
						abueloGenerico = padreGenerico.getUnidadPaternalGenerica(i);
						if (abueloGenerico != null && abueloGenerico.getNombre().equalsIgnoreCase(abuelo.getNombre())){
							System.out.println("Si");
							return;
						}
					}
				}
			}
		}
		System.out.println("No!");
//		for (Persona nieto : familia) {
//			if (nieto.getNombre().equalsIgnoreCase(nombreNieto)) {
//				if(nieto.getPadre() != null ){
//					if(nieto.getPadre().getPadre() != null){
//						if(nieto.getPadre().getPadre().getNombre().equalsIgnoreCase(nombreAbuelo)) {
//							System.out.println("Si");
//							return;
//						}
//					}else{
//						if(nieto.getPadre().getMadre().getNombre().equalsIgnoreCase(nombreAbuelo)) {
//							System.out.println("Si");
//							return;
//						}
//					}
//				}
//				else {
//					if(nieto.getMadre() != null ){
//						if(nieto.getMadre().getPadre() != null){
//							if(nieto.getPadre().getPadre().getNombre().equalsIgnoreCase(nombreAbuelo)) {
//								System.out.println("Si");
//								return;
//							}
//						}else{
//							if(nieto.getMadre().getMadre() != null){
//								if(nieto.getMadre().getMadre().getNombre().equalsIgnoreCase(nombreAbuelo)) {
//									System.out.println("Si");
//									return;
//								}
//							}
//						}
//					}
//				}
//				
//			}
//		}
//		System.out.println("No");
	}
	
	public static Persona findPersona(String nombrePersona) {
		for (Persona iterable : familia) {
			if(iterable.getNombre().equalsIgnoreCase(nombrePersona)) {
				return iterable;
			}
		}
		return null;
	}
}
