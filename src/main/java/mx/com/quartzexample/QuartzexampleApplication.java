package mx.com.quartzexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Import;



@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@Import({ SchedulerConfig.class })
@ComponentScan

public class QuartzexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuartzexampleApplication.class, args);
	}
}
