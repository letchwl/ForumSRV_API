package com.raullalves.forum.dto;

import com.raullalves.forum.model.User;

public record UserDto(Long id,
                      String name,
                      String email,
                      String password) {

    public UserDto(User user) {
        this(user.getId(),
                user.getName(),
                user.getEmail(),
                user.getPassword());
    }

}
