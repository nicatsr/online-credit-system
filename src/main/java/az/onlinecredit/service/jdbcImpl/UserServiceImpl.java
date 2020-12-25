package az.onlinecredit.service.jdbcImpl;

import az.onlinecredit.model.Role;
import az.onlinecredit.model.database.User;
import az.onlinecredit.model.database.UserRole;
import az.onlinecredit.model.dto.UserDto;
import az.onlinecredit.repository.UserRepository;
import az.onlinecredit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean emailExist(String email) {
        return userRepository.checkEmailExist(email);
    }

    @Override
    @Transactional
    public void addUser(UserDto userDto) {
        User user = new User();
        user.setFullName(userDto.getFullName());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        user.setRegistrationDate(Date.valueOf(LocalDate.now()));
        userRepository.addUser(user);

        Optional<User> optionalUserFromDb = userRepository.getUserByEmail(user.getEmail());
        User userFromDb = null;
        if (optionalUserFromDb.isPresent()){
            userFromDb = optionalUserFromDb.get();
        }
        UserRole userRole = new UserRole();
        userRole.setUserId(userFromDb.getId());
        userRole.setRoleId(Role.CUSTOMER.getValue());
        userRepository.addUserRole(userRole);

    }
}
