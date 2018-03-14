package com.ipartek.videoclub.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="proveedor")
public class Proveedor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idporveedor")
	private int idproveedor;
	
	@Column
	private String nombre;
	
	@Column
	private String direccion;
	
	@Column
	private String webProveedor;
	
	@Column
	private String cuenta_bancaria;

	public int getIdproveedor() {
		return idproveedor;
	}

	public void setIdproveedor(int idproveedor) {
		this.idproveedor = idproveedor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getWebProveedor() {
		return webProveedor;
	}

	public void setWebProveedor(String webProveedor) {
		this.webProveedor = webProveedor;
	}

	public String getCuenta_bancaria() {
		return cuenta_bancaria;
	}

	public void setCuenta_bancaria(String cuenta_bancaria) {
		this.cuenta_bancaria = cuenta_bancaria;
	}
	
}