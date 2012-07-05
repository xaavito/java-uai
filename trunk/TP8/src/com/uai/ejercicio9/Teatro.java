package com.uai.ejercicio9;

import java.util.ArrayList;
import java.util.List;

public class Teatro {

	List<Ticket> tickets = new ArrayList<Ticket>();
	
	void CrearTicket(tipoLocalidad localidad)
	{
		Ticket ticket = new Ticket();
		ticket.setLocalidad(localidad);
		tickets.add(ticket);
		System.out.println("Ticket creado => " + ticket.toString());
	}
	void ImprimirLocalidades()
	{
		for (tipoLocalidad tipo : tipoLocalidad.values()) {
			System.out.println(tipo);
		}
		
	}
	
}
