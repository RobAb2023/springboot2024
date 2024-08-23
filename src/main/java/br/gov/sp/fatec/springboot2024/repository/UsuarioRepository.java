package br.gov.sp.fatec.springboot2024.repository;

import org.springframework.data.repository.CrudRepository;

import br.gov.sp.fatec.springboot2024.entity.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario,Long>{

    
} 