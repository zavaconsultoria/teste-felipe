package br.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.model.Usuario;



@Service
public class UsuarioService {

	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	public void testeSenha(Usuario user) {
		String encoderpassword = encoder.encode(user.getSenha());
	
		System.out.println(encoderpassword);
	}
}
