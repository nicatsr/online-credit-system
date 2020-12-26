//package az.onlinecredit.service.jdbcImpl;
//
//
//import az.onlinecredit.service.PasswordService;
//import org.springframework.security.crypto.bcrypt.BCrypt;
//import org.springframework.stereotype.Service;
//
//@Service
//public class PasswordServiceImpl implements PasswordService {
//
//    @Override
//    public String hashPassword(String plainPassword) {
//        return BCrypt.hashpw(plainPassword, BCrypt.gensalt());
//    }
//
//    @Override
//    public boolean passwordsMatch(String plainPassword, String hashedPassword) {
//        return BCrypt.checkpw(plainPassword, hashedPassword);
//    }
//}
