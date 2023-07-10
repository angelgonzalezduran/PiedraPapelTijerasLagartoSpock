package model;

import lombok.Data;

@Data
public class Jugador {
	private String jugador1;
	private String jugador2;
	private int puntuacion;
	private String nombre;
	
		
	public Jugador() {
	super();
	}
	
	public String getJugador1() {
	return jugador1;
	}
	public void setJugador1(String jugador1) {
	this.jugador1 = jugador1;
	}
	public String getJugador2() {
	return jugador2;
	}
	public void setJugador2(String jugador2) {
	this.jugador2 = jugador2;
	}
	public int getResultado() {
	return puntuacion;
	}
	public void setResultado(int puntuacion) {
	this.puntuacion = puntuacion;
	}
	public String getNombre() {
	return nombre;
	}
	public void setNombre(String nombre) {
	this.nombre = nombre;
	}
	
	public Jugador(String jugador1, String jugador2, int puntuacion, String nombre) {
		super();
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
		this.puntuacion= puntuacion;
		this.nombre = nombre;
		}
}