package com.raullalves.forum.dtos.user;

import com.raullalves.forum.model.User;

public record UserDto(Long id,
                      String name,
                      String email,
                      String password) {

    public UserDto(User user) {
        this(user.getId(),
                user.getUsername(),
                user.getEmail(),
                user.getPassword());
    }

}
