package com.kakao.pay.leekt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.kakao.pay.leekt")
public class LeektApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeektApplication.class, args);
	}

}
