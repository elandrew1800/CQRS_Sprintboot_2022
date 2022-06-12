package com.example.msscolaritecommand;

import com.example.coreapi.AxonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({AxonConfig.class})
public class MsScolariteCommandApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsScolariteCommandApplication.class, args);
    }

}
