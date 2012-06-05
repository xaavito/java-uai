package com.facultad.ej6;

import javax.swing.JOptionPane;

public class Ejercicio6 {
	
	private static int ladoA;
	private static int ladoB;
	private static int ladoC;
	private static int ladoD;

	public static void main(String args[]) {
	
		ladoA = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Figura 1 Lado A"));
		ladoB = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Figura 1 Lado B"));
		ladoC = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Figura 2 Lado C"));
		ladoD = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Figura 2 Lado D"));
		
		if ((ladoA <= ladoC) && (ladoB <= ladoD)) {
			System.out.println("Figura 1 entra en 2 sin rotacion");
		} else {
			if ((ladoA <= ladoD) && (ladoB <= ladoC)) {
				System.out.println("Figura 1 entra en 2 con rotacion");
			}
			else  {
				System.out.println("Figura 1 no entra en 2");
			}
		}
				
		if ((ladoA >= ladoC) && (ladoB >= ladoD)) {
			System.out.println("Figura 2 entra en 1 sin rotacion");
		}
		else {
			if ((ladoA >= ladoD) && (ladoB >= ladoC)) {
				System.out.println("Figura 2 entra en 1 con rotacion");
			}
			else  {
				System.out.println("Figura 2 no entra en 1");
			}
		}
	}
}
