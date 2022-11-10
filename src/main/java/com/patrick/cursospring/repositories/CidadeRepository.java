package com.patrick.cursospring.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.patrick.cursospring.domain.Cidade;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade,Integer>{

}
