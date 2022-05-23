package com.sook.mysonge.web.dto.user;

import com.sook.mysonge.domain.user.User;
import lombok.Getter;

@Getter
public class UserResponseDto {
    private Long id;
    private String name;
    private String email;
    private String birthday;

    public UserResponseDto(User entity){
        this.id = entity.getId();
        this.name = entity.getName();
        this.email = entity.getEmail();
        this.birthday = entity.getBirthday();
    }
}
