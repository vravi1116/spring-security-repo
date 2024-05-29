package com.owndevz.spring.security.configuration;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class SpringSecurityConfigurationEnabling{

  /*@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests((authz) -> authz
                .anyRequest().authenticated()
            )
            .httpBasic(withDefaults());
    }

}
//instead of below logic/
   */
  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http.authorizeHttpRequests((authz) -> authz
            .requestMatchers("/basic","/welcome").authenticated()
        )
        .httpBasic(withDefaults());

   /* http.authorizeRequests()
        .antMatchers("/basic")
        .hasAnyRole("BASIC", "ADMIN")
        .antMatchers("/admin")
        .hasRole("ADMIN")
        .antMatchers("/")
        .permitAll()
        .anyRequest()
        .authenticated()
        .and()
        .formLogin()
        .permitAll()
        .loginPage("/login")
        .usernameParameter("username")
        .and()
        .logout()
        .logoutRequestMatcher(
            new AntPathRequestMatcher("/logout"))
        .permitAll();*/

    return http.build();
  }


  /*
  @Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(WebSecurity web) {
        web.ignoring().antMatchers("/ignore1", "/ignore2");
    }

}
  * */

 /* @Bean
  public WebSecurityCustomizer webSecurityCustomizer() {
    return (web) -> web.ignoring().requestMatchers("/ignore1", "/ignore2");
  }*/
}
