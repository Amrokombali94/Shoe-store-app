package com.amroForShoes.shoesStore;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class ShoesStoreApplication {




	public static void main(String[] args) throws Exception {
		SpringApplication.run(ShoesStoreApplication.class, args);

	}

}
