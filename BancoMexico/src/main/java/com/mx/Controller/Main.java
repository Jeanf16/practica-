package com.mx.Controller;

import java.sql.Date;

import com.mx.Entity.Creditos;
import com.mx.Service.Implementacion;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Implementacion imp = new Implementacion();

		// listar
		System.out.println("Lista: " + imp.findAll());

		// SAVE
		Creditos credito = new Creditos("Diego", "Juarez", Date.valueOf("1988-02-02"), 40, "Nomina",
				Date.valueOf("2025-11-04"), 10000, 0, 0, 10000);
		imp.save(credito);
		System.out.println("Lista de créditos"+imp.findAll());
		
		//FIND
		Creditos creditoBuscar = new Creditos();
		creditoBuscar = imp.findById(3);
		System.out.println("Se encontró el credito: "+ creditoBuscar);
		
		// UPDATE
		creditoBuscar = imp.findById(3);
		System.out.println("Se encontró el credito: "+ creditoBuscar);
		creditoBuscar.setApp("Hernandez");
		imp.update(creditoBuscar);
		System.out.println("Lista de créditos"+imp.findAll());
		
		//DELETE
		imp.deleteById(1);
		System.out.println("Lista de créditos"+imp.findAll());

		
	}

}
