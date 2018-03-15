package com.ipartek.videoclub.domain;



import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int idcliente;
	
	@Column
	private String nombre;
	
	@Column
	private String apellidos;
	
	@Column
	private String direccion;
	
	@Column
	private String email;
	
	@Column
	private String telefono;
	
	@Column
	private String numseguridadsocial;
	
	@Column
	private String contrasena;
	
	@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable
    private Set<Pelicula> Peliculas;
	
	public Cliente(){}
	
	

	
	public Cliente(int idcliente, String nombre, String apellidos, String direccion, String email, String telefono,
			String numseguridadsocial, String contrasena) {
		super();
		setIdcliente(idcliente);
		setNombre(nombre);
		setApellidos(apellidos);
		setDirecion(direccion);
		setEmail(email);
		setTelefono(telefono);
		setnumseguridadsocial(numseguridadsocial);
		setContrasena(contrasena);
	}



	public int getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDirecion() {
		return direccion;
	}

	public void setDirecion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getnumseguridadsocial() {
		return numseguridadsocial;
	}

	public void setnumseguridadsocial(String numseguridadsocial) {
		this.numseguridadsocial = numseguridadsocial;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	
}
