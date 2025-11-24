package com.mx.Entity;

import java.sql.Date;

public class Creditos {

	/*
	 * ORM - Object Relational Mapping: Mapeo de un objeto relacional desde una
	 * clase en java
	 * 
	 * CREATE TABLE CREDITOS ( ID NUMBER PRIMARY KEY, NOMBRE_CLIENTE NVARCHAR2(50),
	 * APP NVARCHAR2(50), FECHA_NACIMIENTO DATE, EDAD NUMBER, TIPO_PRESTAMO
	 * NVARCHAR2(50), -- NOMINA FECHA_PRESTAMO DATE, -- HOY MONTO_PRESTAMO NUMBER,
	 * -- 10000 NO_ABONOS NUMBER, -- 0 MONTO_ABONOS NUMBER, ADEUDO NUMBER -- 10000
	 * );
	 * 
	 */

	int id;
	String nombreCliente;
	String app;
	Date fechaNacimiento;
	int edad;
	String tipoPrestamo;
	Date fechaPrestamo;
	double montoPrestamo;
	int noAbonos;
	double montoAbonos;
	double adeudo;

	public Creditos() {

	}

	public Creditos(int id) {
		this.id = id;
	}

	public Creditos(String nombreCliente, String app, Date fechaNacimiento, int edad, String tipoPrestamo,
			Date fechaPrestamo, double montoPrestamo, int noAbonos, double montoAbonos, double adeudo) {
		this.nombreCliente = nombreCliente;
		this.app = app;
		this.fechaNacimiento = fechaNacimiento;
		this.edad = edad;
		this.tipoPrestamo = tipoPrestamo;
		this.fechaPrestamo = fechaPrestamo;
		this.montoPrestamo = montoPrestamo;
		this.noAbonos = noAbonos;
		this.montoAbonos = montoAbonos;
		this.adeudo = adeudo;
	}

	@Override
	public String toString() {
		return "Creditos [id=" + id + ", nombreCliente=" + nombreCliente + ", app=" + app + ", fechaNacimiento="
				+ fechaNacimiento + ", edad=" + edad + ", tipoPrestamo=" + tipoPrestamo + ", fechaPrestamo="
				+ fechaPrestamo + ", montoPrestamo=" + montoPrestamo + ", noAbonos=" + noAbonos + ", montoAbonos="
				+ montoAbonos + ", adeudo=" + adeudo + "]\n";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getTipoPrestamo() {
		return tipoPrestamo;
	}

	public void setTipoPrestamo(String tipoPrestamo) {
		this.tipoPrestamo = tipoPrestamo;
	}

	public Date getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(Date fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public double getMontoPrestamo() {
		return montoPrestamo;
	}

	public void setMontoPrestamo(double montoPrestamo) {
		this.montoPrestamo = montoPrestamo;
	}

	public int getNoAbonos() {
		return noAbonos;
	}

	public void setNoAbonos(int noAbonos) {
		this.noAbonos = noAbonos;
	}

	public double getMontoAbonos() {
		return montoAbonos;
	}

	public void setMontoAbonos(double montoAbonos) {
		this.montoAbonos = montoAbonos;
	}

	public double getAdeudo() {
		return adeudo;
	}

	public void setAdeudo(double adeudo) {
		this.adeudo = adeudo;
	}

}
