package com.example.instagram.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
    //이메일이 중복되면 회원가입을 막는 로직 생성
}