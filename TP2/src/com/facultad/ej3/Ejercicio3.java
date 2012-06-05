package com.facultad.ej3;

import javax.management.timer.Timer;


public class Ejercicio3 {

	public static void main(String args[]) {
		double start = System.currentTimeMillis();
		javax.management.timer.Timer reloj = new Timer();
		reloj.start();
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				for(int k=0;k<10;k++){
					for(int l=0;l<10;l++){
						if(((i*1000)+(j*100)+(k*10)+l) == (Math.pow(i,j)*(Math.pow(k,l)))){
							System.out.println("Combo Ganador: " + i + " " + j + " " + k + " " + l );
						}
					}
				}
			}
		}
		double stop = System.currentTimeMillis();
		System.out.println(" " + (stop-start) + " Milisegundos");
	}
}
