package jf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = "jf.dao")//扫描mapper
public class ComebackServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComebackServiceApplication.class, args);
	}
}
