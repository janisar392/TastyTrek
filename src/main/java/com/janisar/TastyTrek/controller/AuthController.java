package com.janisar.TastyTrek.controller;

import com.janisar.TastyTrek.io.AuthenticationRequest;
import com.janisar.TastyTrek.io.AuthenticationResponse;
import com.janisar.TastyTrek.service.AppUserDetailsService;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class AuthController {

    private final AuthenticationManager authenticationManager;
    private final AppUserDetailsService userDetailsService;

    @PostMapping("/login")
    public AuthenticationResponse login(@RequestBody AuthenticationRequest request){
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getEmail(),request.getPassword()));
        final UserDetails userDetails =userDetailsService.loadUserByUsername(request.getEmail());
        final String jwtToken = generateToken(userDetails);
        return new AuthenticationResponse(request.getEmail(), jwtToken);

    }
}
