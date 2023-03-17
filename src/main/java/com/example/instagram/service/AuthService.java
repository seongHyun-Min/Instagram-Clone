package com.example.instagram.service;


import com.example.instagram.domain.user.User;
import com.example.instagram.domain.user.UserRepository;
import com.example.instagram.web.dto.UserLoginDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
@Slf4j
public class AuthService {

    //@RequireArgsConstructor를 통해 의존성 주입
    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;



    @Transactional
    public User signup(UserLoginDto userLoginDto){

        if(userRepository.findByEmail(userLoginDto.getEmail()) != null){
            return null;
        }



        //String rawPassword = user.getPassword();
        //String encPassword = bCryptPasswordEncoder.encode(rawPassword);
        //user.setPassword(encPassword);
        log.info("회원가입 테스트 {}" , userLoginDto.getPassword() );


        User userEntity = userRepository.save(User.builder()
                .email(userLoginDto.getEmail())
                .password(bCryptPasswordEncoder.encode(userLoginDto.getPassword()))
                .phone(userLoginDto.getPhone())
                .name(userLoginDto.getName())
                .gender(userLoginDto.getGender())
                .introduction(null)
                .website(null)
                .profileImageUrl("/img/default_profile.png")
                .build());

        return userEntity;
    }
}
