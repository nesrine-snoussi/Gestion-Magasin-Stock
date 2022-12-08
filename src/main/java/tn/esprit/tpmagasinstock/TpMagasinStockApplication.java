package tn.esprit.tpmagasinstock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class TpMagasinStockApplication {

    public static void main(String[] args) {
        SpringApplication.run(TpMagasinStockApplication.class, args);
    }

}
