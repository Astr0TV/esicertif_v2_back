package fr.projet.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.projet.entities.User;
import fr.projet.repository.UserRepository;



@RestController @CrossOrigin("*")
public class UserRest {
	
	@Autowired
	private UserRepository userreop;
	
	@PostMapping("/user")
	public User saveUser(@RequestBody User u) {
		return userreop.save(u);
	}
	
	@GetMapping("/alluser")
	public Iterable<User> getAllUser(){
		return userreop.findAll();
	}
	
	@PostMapping("/connexion")
	public Optional<User> connexion(@RequestBody User u){
		return userreop.findByEmailAndMdp(u.getEmail(), u.getMdp());
	}

}
