package com.itvdn.repository;

import com.itvdn.dto.UserDto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserStorage {

    private List<UserDto> users;

    public void initUsers() {
        users = new ArrayList<>();
        users.add(new UserDto(1, "Sergio", "Pirelli", "spirelli", "1", "spirelli@mail.com"));
    }

    private boolean connectionEstablished = false;

    public void connect() {
        if(!connectionEstablished) {
            initUsers();
            connectionEstablished = true;
        }
    }

    public void addUser(UserDto user) {
        users.add(user);
    }

    public UserDto getUser(long id) {
        return users.stream().filter(user -> user.getId() == id).findAny().orElseThrow();
    }
}