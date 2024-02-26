package com.example.demo.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Usuario;



@Repository
public interface RepositorioUsuario extends JpaRepository<Usuario, Long>{

	/*public Usuario findByEmail(String email);
	public List<Usuario> findByNombre(String nombre);
	public List<Usuario> findByApellido(String apellido);
*/

}
