package com.example.applicationEmail.resource;

import com.example.applicationEmail.domain.HttpReponse;
import com.example.applicationEmail.domain.User;
import com.example.applicationEmail.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.time.LocalDateTime;
import java.util.Map;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserResource {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<HttpReponse> createUser(@RequestBody User user){
        User newUser = userService.saveUser(user);

        return ResponseEntity.created(URI.create("")).body(
                HttpReponse.builder()
                        .timeStamp(LocalDateTime.now().toString())
                        .data(Map.of("user" , newUser))
                        .message("User created")
                        .status(HttpStatus.CREATED)
                        .statusCode(HttpStatus.CREATED.value())
                        .build()
        );
    }

    @GetMapping
    public ResponseEntity<HttpReponse> confirmUserAccount(@RequestParam("token") String token){
        Boolean isSuccess = userService.verifyToken(token);

        return ResponseEntity.ok().body(
                HttpReponse.builder()
                        .timeStamp(LocalDateTime.now().toString())
                        .data(Map.of("Success" , isSuccess))
                        .message("Account Verified")
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .build()
        );
    }
}
