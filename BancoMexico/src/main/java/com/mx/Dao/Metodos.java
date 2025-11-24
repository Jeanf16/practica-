package com.mx.Dao;

import java.util.List;

import com.mx.Entity.Creditos;

public interface Metodos {

	/*
	 * --> Interface orientada a objetos de java para SQL --> Interfaces genéricas
	 * --> objetivo es dividir el objeto de su implementacion
	 * 
	 */

	public String save(Creditos credito);
	public String update(Creditos credito);
	public String deleteById(int id);
	public Object findById(int id);
	public List<Creditos> findAll();

}
