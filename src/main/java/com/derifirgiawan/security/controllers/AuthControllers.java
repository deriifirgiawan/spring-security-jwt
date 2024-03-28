package com.derifirgiawan.security.controllers;

import com.derifirgiawan.security.models.AuthenticationResponse;
import com.derifirgiawan.security.models.LoginRequest;
import com.derifirgiawan.security.models.RegisterRequest;
import com.derifirgiawan.security.services.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthControllers {
    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody RegisterRequest request
    ) {
        return ResponseEntity.ok(authService.register(request));
    }
    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> login(
            @RequestBody LoginRequest request
    ) {

        return ResponseEntity.ok(authService.login(request));
    }
}
