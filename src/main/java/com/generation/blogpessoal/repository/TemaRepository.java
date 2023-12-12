package com.generation.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.blogpessoal.Model.Tema;

@Repository
public interface TemaRepository extends JpaRepository<Tema ,Long>{
	
	List<Tema> findAllByDescricaoContainingIgnoreCase(@Param("descricao")String descricao);

}
