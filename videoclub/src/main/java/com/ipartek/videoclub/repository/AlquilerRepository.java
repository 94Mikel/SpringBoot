package com.ipartek.videoclub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ipartek.videoclub.domain.Alquiler;

public interface AlquilerRepository extends JpaRepository<Alquiler, Integer>{
	//Alquiler findByIdCliente(int idcliente);
}
