package com.ipartek.videoclub.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pelicula")
public class Pelicula {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int idpelicula;
	
	@Column
	private String titulo;
	
	@Column
	private String director;
	
	@Column
	private Date fecha_estreno;
	
	@Column
	private String descripcion;
	
	@Column
	private boolean disponibilidad;
	
	@Column
	private double precio_alquiler;
	
	@Column
	private int proveedor_idproveedor;

	public Pelicula(){}
	
	public Pelicula(int idpelicula, String titulo, String director, Date fecha_estreno, String descripcion,
			boolean disponibilidad, double precio_alquiler, int proveedor_idproveedor) {
		super();
		setIdpelicula(idpelicula);
		setTitulo(titulo);
		setDirector(director);
		setFecha_estreno(fecha_estreno);
		setDescripcion(descripcion);
		setDisponibilidad(disponibilidad);
		setPrecio_alquiler(precio_alquiler);
		setProveedor_idproveedor(proveedor_idproveedor);
	}

	public int getIdpelicula() {
		return idpelicula;
	}

	public void setIdpelicula(int idpelicula) {
		this.idpelicula = idpelicula;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public Date getFecha_estreno() {
		return fecha_estreno;
	}

	public void setFecha_estreno(Date fecha_estreno) {
		this.fecha_estreno = fecha_estreno;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public double getPrecio_alquiler() {
		return precio_alquiler;
	}

	public void setPrecio_alquiler(double precio_alquiler) {
		this.precio_alquiler = precio_alquiler;
	}

	public int getProveedor_idproveedor() {
		return proveedor_idproveedor;
	}

	public void setProveedor_idproveedor(int proveedor_idproveedor) {
		this.proveedor_idproveedor = proveedor_idproveedor;
	}
	
	
}
