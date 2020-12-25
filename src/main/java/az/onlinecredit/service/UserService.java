package az.onlinecredit.service;

import az.onlinecredit.model.dto.UserDto;

public interface UserService {
    boolean emailExist(String email);

    void addUser(UserDto userDto);
}
