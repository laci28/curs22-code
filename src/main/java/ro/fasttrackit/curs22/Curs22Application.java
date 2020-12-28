package ro.fasttrackit.curs22;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.fasttrackit.curs22.model.Transaction;
import ro.fasttrackit.curs22.model.Type;

import java.util.List;

@SpringBootApplication
public class Curs22Application {

    public static void main(String[] args) {
        SpringApplication.run(Curs22Application.class, args);
    }

    @Bean
    CommandLineRunner atStartup(TransactionRepository repo) {
        return args -> repo.saveAll(List.of(
                new Transaction("bread", Type.BUY, 10),
                new Transaction("car", Type.SELL, 12000),
                new Transaction("laptop", Type.SELL, 1200),
                new Transaction("phone", Type.BUY, 300)
        ));
    }
}
