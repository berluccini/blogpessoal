package com.generation.blogpessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.blogpessoal.Model.Postagem;

public interface PostagemRepository extends JpaRepository<Postagem,Long> {

	
}
