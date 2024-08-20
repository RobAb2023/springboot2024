package br.gov.sp.fatec.springboot2024.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import br.gov.sp.fatec.springboot2024.entity.Usuario;
import br.gov.sp.fatec.springboot2024.repository.UsuarioRepository;
import jakarta.transaction.Transactional;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    private UsuarioRepository repo;

    public UsuarioServiceImpl(UsuarioRepository repo) {
        this.repo = repo;
    }

    @Override
    @Transactional
    public Usuario novoUsuario(Usuario usuario) {
        if(usuario == null ||
                usuario.getNome() == null ||
                usuario.getSenha() == null ||
                usuario.getNome().isBlank() ||
                usuario.getSenha().isBlank()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST ,"Nome ou senha inválidos!");
        }
        return repo.save(usuario);
    }

    @Override
    public List<Usuario> todosUsuarios() {
        List<Usuario> usuarios = new ArrayList<Usuario>();
        for(Usuario usuario: repo.findAll()) {
            usuarios.add(usuario);
        }
        return usuarios;
    }

    @Override
    public Usuario buscarPeloId(Long id) {
        Optional<Usuario> usuarioOp = repo.findById(id);
        if(usuarioOp.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuário não encontrado");
        }
        return usuarioOp.get();
    }
    
}