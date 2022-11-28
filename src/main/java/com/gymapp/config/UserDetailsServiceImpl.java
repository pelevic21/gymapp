package com.gymapp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gymapp.model.User;
import com.gymapp.repository.UserRepository;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
	
    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) {
    	
    	String lowercaseLogin = username.toLowerCase(Locale.ENGLISH);
        User user = userRepository.findByUsername(username);
        if (user == null) throw new UsernameNotFoundException(username);
        
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
		if (user != null && user.getEnabled() != null && user.getEnabled() == true) {
			
			
			GrantedAuthority a = new SimpleGrantedAuthority("ROLE_ADMIN");
			grantedAuthorities.add(a);
			return new org.springframework.security.core.userdetails.User(lowercaseLogin,
					user.getPassword(), grantedAuthorities);
			
		
		} else {
			throw new RuntimeException("Korisnik " + lowercaseLogin + " nije pronadjen " + "u bazi");
		}
    }
}