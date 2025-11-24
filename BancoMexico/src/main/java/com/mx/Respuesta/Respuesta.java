package com.mx.Respuesta;

public class Respuesta {

	String mensaje;
	String respuesta;
	Object obj;

	public Respuesta() {

	}

	public Respuesta(String mensaje, String respuesta, Object obj) {

		this.mensaje = mensaje;
		this.respuesta = respuesta;
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "Respuesta [mensaje=" + mensaje + ", respuesta=" + respuesta + ", obj=" + obj + "]\n";
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

}
