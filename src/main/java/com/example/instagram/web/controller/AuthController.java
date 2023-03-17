package com.example.instagram.web.controller;

import com.example.instagram.domain.user.User;
import com.example.instagram.service.AuthService;
import com.example.instagram.web.dto.UserLoginDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class AuthController {
    private final AuthService authService;

    @GetMapping({"/login" , "/"})
    public String LoginForm(){
        return "login";
    }

    @GetMapping("/signup")
    public String SignupForm(){
        return "signup";
    }

    @PostMapping("/signup")
    public String Signup(UserLoginDto userLoginDto){

        User userEntity = authService.signup(userLoginDto);
        if(userEntity == null){
            return "redirect:/signup?error";
        }
        return "redirect:/login";
    }
}
