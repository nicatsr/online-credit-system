package az.onlinecredit.configuration;

import az.onlinecredit.model.Role;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class OnlineCreditSuccessHandler implements AuthenticationSuccessHandler {
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        UserPrincipal userPrincipal = (UserPrincipal) authentication.getPrincipal();

        Role role = userPrincipal.getUser().getRoleList().get(0);
        if (role.getValue() == 1){
            response.sendRedirect(request.getContextPath() + "/adminUser/");
        }else if (role.getValue() == 2){
            response.sendRedirect(request.getContextPath() + "/customer/");
        }
    }
}
