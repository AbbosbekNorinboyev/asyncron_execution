package uz.pdp.asyncronExecution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class AsyncronExecutionApplication {

    public static void main(String[] args) {
        SpringApplication.run(AsyncronExecutionApplication.class, args);
    }

}
