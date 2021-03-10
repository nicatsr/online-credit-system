package az.onlinecredit.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    private OnlineCreditUserDetailsService userDetailsService;

    @Autowired
    private OnlineCreditSuccessHandler successHandler;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
//                http.csrf().disable()
//                    .authorizeRequests()
//                    .antMatchers("/adminUser/**").hasRole("ADMIN")
//                    .antMatchers("/customer/**").hasAnyRole("CUSTOMER", "ADMIN")
//                    .antMatchers("/")
//                    .permitAll()
//                     .and()
//                     .formLogin()
//                        .loginPage("/login")
//                        .permitAll()
//                        .loginProcessingUrl("/credit_sign_in")
//                        .successHandler(successHandler);
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and().httpBasic()
                .and().authorizeRequests()
                .antMatchers(HttpMethod.GET ,"/result/list").permitAll()
                .antMatchers(HttpMethod.GET ,"debtorResult/**").permitAll()
                .antMatchers(HttpMethod.GET ,"creditResult/**").permitAll();
    }


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authenticationProvider());
    }

    @Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
        authenticationProvider.setUserDetailsService(userDetailsService);
        authenticationProvider.setPasswordEncoder(getPasswordEncoder());
        return authenticationProvider;
    }

    @Bean
    public PasswordEncoder getPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}