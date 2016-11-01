package com.idea4j;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import static javafx.scene.input.KeyCode.M;

@MapperScan("com.idea4j.mapper")
@SpringBootApplication
@ServletComponentScan
public class SpringbootApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
}
