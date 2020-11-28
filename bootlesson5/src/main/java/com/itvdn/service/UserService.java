package com.itvdn.service;

import com.itvdn.dto.UserDto;
import com.itvdn.repository.UserStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserStorage userStorage;

    public void addUser(UserDto user) {
        userStorage.connect();
        userStorage.addUser(user);
    }

    public UserDto getUser(long id) {
        userStorage.connect();
        return userStorage.getUser((int)id);
    }
}
