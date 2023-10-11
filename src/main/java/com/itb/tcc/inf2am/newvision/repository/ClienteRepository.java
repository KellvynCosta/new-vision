package com.itb.tcc.inf2am.newvision.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.itb.tcc.inf2am.newvision.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    @Query(value = "select * from clientes where email = :email and senha = :senha", nativeQuery = true)
    public Cliente acessar(String email, String senha);

}
