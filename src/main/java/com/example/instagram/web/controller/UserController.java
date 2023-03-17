package com.example.instagram.web.controller;

import com.example.instagram.config.auth.PrincipleDetail;
import com.example.instagram.domain.user.User;
import com.example.instagram.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@RequiredArgsConstructor
@Controller
public class UserController {

    private final UserService userService;


    @GetMapping("/story")
    public String story(@AuthenticationPrincipal PrincipleDetail principalDetails , Model model){
        User user = userService.getUserByEmail(principalDetails.getUser().getEmail());
        model.addAttribute("user",user);
        return "post/story";
    }
}
