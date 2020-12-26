//package az.onlinecredit.configuration;
//
//import az.onlinecredit.model.Role;
//import az.onlinecredit.model.database.User;
//import az.onlinecredit.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class OnlineCreditUserDetailsService implements UserDetailsService {
//
//    @Autowired
//    private UserRepository userRepository;
//
//
//    @Override
//    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//        UserPrincipal principal = null;
//        Optional<User> userOptional = userRepository.getUserByEmail(email);
//        if(userOptional.isPresent()) {
//            User user = userOptional.get();
//            List<Role> roles = userRepository.getUserRoles(user.getId());
//            user.setRoleList(roles);
//            roles.forEach(System.out::println);
//            principal = new UserPrincipal(user);
//        } else {
//            throw new UsernameNotFoundException("User " + email + " not found!");
//        }
//        return principal;
//    }
//}
