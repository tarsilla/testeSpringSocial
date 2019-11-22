package edu.ifrn.teste.SpringSocial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import edu.ifrn.teste.SpringSocial.model.User;
import edu.ifrn.teste.SpringSocial.repository.UserRepository;

@Service
public class UserService implements UserDetailsService{

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findOne(Long id) {
		return repository.getOne(id);
	}
	
	public User save(User usuario) {
		return repository.saveAndFlush(usuario);
	}
	
	public User findByName(String name){
		return repository.findByName(name);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
}
