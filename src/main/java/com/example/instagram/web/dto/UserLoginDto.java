package com.example.instagram.web.dto;

import com.example.instagram.domain.user.GENDER;
import lombok.*;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class UserLoginDto {
    private String email;
    private String password;
    private String phone;
    private String name;
    private GENDER gender;



}
