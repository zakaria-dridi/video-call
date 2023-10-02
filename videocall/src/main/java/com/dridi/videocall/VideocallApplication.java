package com.dridi.videocall;

import com.dridi.videocall.user.User;
import com.dridi.videocall.user.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VideocallApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideocallApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			UserService userService
	){
		return args -> {
			userService.register(User.builder()
					.username("Zakaria")
					.email("zak@mail.com")
					.password("zzz")
					.build()
			);
			userService.register(User.builder()
					.username("Anes")
					.email("anes@gmail.com")
					.password("aaa")
					.build()
			);
			userService.register(User.builder()
					.username("Ali")
					.email("ali@mail.com")
					.password("aaa")
					.build()
			);
			userService.register(User.builder()
					.username("Samy")
					.email("samy@gmail.com")
					.password("sss")
					.build()
			);
		};
	}
}
