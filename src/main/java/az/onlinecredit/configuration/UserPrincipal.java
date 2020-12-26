//package az.onlinecredit.configuration;
//
//import az.onlinecredit.model.database.User;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//
//public class UserPrincipal implements UserDetails {
//
//    private User user;
//
//    public UserPrincipal(User user) {
//        System.out.println("User principal was called");
//        this.user = user;
//    }
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        System.out.println("get authorities");
//        List<GrantedAuthority> authorities = new ArrayList<>();
//
//        user.getRoleList().forEach(role -> {
//            SimpleGrantedAuthority authority = new SimpleGrantedAuthority("ROLE_" + role.name());
//            System.out.println(authority);
//            authorities.add(authority);
//        });
//
//        return authorities;
//    }
//
//    @Override
//    public String getUsername() {
//        return user.getEmail();
//    }
//
//    @Override
//    public String getPassword() {
//        return user.getPassword();
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//}
