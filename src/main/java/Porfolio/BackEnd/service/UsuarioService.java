package Porfolio.BackEnd.service;

import Porfolio.BackEnd.exception.UserNotFoundException;
import Porfolio.BackEnd.model.Educacion;
import Porfolio.BackEnd.model.Usuario;
import Porfolio.BackEnd.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }


    public Usuario addUser(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
    public List<Usuario> buscarUsuario(){
        return usuarioRepository.findAll();
    }
    public Usuario editarUsuario (Usuario usuario){
        return usuarioRepository.save(usuario);
    }
    public void borrarUsuario (Long id){
        usuarioRepository.deleteById(id);
    }

    public  Usuario buscarUsuarioPorId (Long id){
        return usuarioRepository.findById(id).orElseThrow(() -> new UserNotFoundException("Usuario no encontrado"));
    }
}


