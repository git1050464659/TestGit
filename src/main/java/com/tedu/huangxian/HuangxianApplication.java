package com.tedu.huangxian;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.tedu.huangxian.mapper")
@SpringBootApplication
public class HuangxianApplication {

	public static void main(String[] args) {
		SpringApplication.run(HuangxianApplication.class, args);
	}

}
