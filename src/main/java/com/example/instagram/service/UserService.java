package com.example.instagram.service;


import com.example.instagram.domain.user.User;
import com.example.instagram.domain.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private  final UserRepository userRepository;

    public User getUserByEmail(String email){
        User user = userRepository.findByEmail(email);
        return user;
    }
}
