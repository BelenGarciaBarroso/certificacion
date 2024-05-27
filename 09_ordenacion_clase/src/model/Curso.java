package model;

import java.time.LocalDate;
import java.util.Comparator;

public class Curso {
	
	private String nombre;
	private int duracion;
	private LocalDate fechaInicio;
	
	public Curso(String nombre, int duracion,LocalDate fechaInicio) {
		super();
		this.nombre = nombre;
		this.duracion = duracion;
		this.fechaInicio=fechaInicio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	
	

}
//	