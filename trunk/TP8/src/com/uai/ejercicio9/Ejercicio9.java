package com.uai.ejercicio9;

public class Ejercicio9 {
	public static void main(String[] args) {
		
		/*Ticket ticket = new Ticket();
		ticket.setLocalidad(tipoLocalidad.Atras);
		System.out.println(ticket.toString());*/
		
		Teatro teatro = new Teatro();
		teatro.CrearTicket(tipoLocalidad.Adelante);
		
		teatro.ImprimirLocalidades();

		
	}
}
