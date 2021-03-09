package com.jayson.spring;

import com.jayson.spring.model.User;
import com.jayson.spring.repository.UserRepository;
import org.springframework.web.filter.CorsFilter;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.Ordered;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import javax.servlet.FilterRegistration;
import java.util.Collections;
import java.util.stream.Stream;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	/*@Bean
	ApplicationRunner init(UserRepository userRepository){
		ApplicationRunner applicationRunner = args -> {
			Stream.of("Aditya","Girija","Jayson","Ammara","Binisha")
					.forEach(name->{
						User user = new User();
						user.setName(name);
						userRepository.save(user);
					});
			userRepository.findAll();
		};
		return applicationRunner;
	}*/

	@Bean
	public FilterRegistrationBean<CorsFilter> simpleCorsFilter(){
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		CorsConfiguration config = new CorsConfiguration();
		config.setAllowCredentials(true);
		config.setAllowedOrigins(Collections.singletonList("http://localhost:4200"));
		config.setAllowedMethods(Collections.singletonList("*"));
		config.setAllowedHeaders(Collections.singletonList("*"));
		source.registerCorsConfiguration("/**", config);
		FilterRegistrationBean<CorsFilter> bean = new FilterRegistrationBean<>(new CorsFilter(source));
		bean.setOrder(Ordered.HIGHEST_PRECEDENCE);
		return bean;
	}
}
