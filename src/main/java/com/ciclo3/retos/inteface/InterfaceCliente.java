package com.ciclo3.retos.inteface;

import com.ciclo3.retos.modelo.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface InterfaceCliente extends CrudRepository<Cliente,Integer> {


}
