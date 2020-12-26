package az.onlinecredit.repository;

import az.onlinecredit.model.Role;
import az.onlinecredit.model.database.User;
import az.onlinecredit.model.database.UserRole;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    boolean checkEmailExist(String email);

    void addUser(User user);

    void addUserRole(UserRole userRole);

    Optional<User> getUserByEmail(String email);

    List<Role> getUserRoles(long id);
}
