package com.springSecurity.api.Auth.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springSecurity.api.Auth.Entity.AuthResponse;
import com.springSecurity.api.Auth.Entity.LoginRequest;
import com.springSecurity.api.Auth.Entity.RegisterRequest;
import com.springSecurity.api.Auth.Service.AuthService;

import lombok.RequiredArgsConstructor;

/**
 *
 * @author carubio
 */
@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request) {
        return ResponseEntity.ok(authService.login(request));
    }

    @PostMapping("/register")
    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest request) {
        return ResponseEntity.ok(authService.register(request));
    }
}
