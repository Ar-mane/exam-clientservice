package sid.org.clientservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import sid.org.clientservice.Entity.Client;
import sid.org.clientservice.Repositorys.ClientRepository;

@SpringBootApplication
public class ClientServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ClientRepository clientRepository){
        return args -> {
             clientRepository.save(new Client(null,"AKA154","ARACHE","ARACHE@ABDERRAHMLANE"));
             clientRepository.save(new Client(null,"AKA155","ARACHE2","ARACHE2@ABDERRAHMLANE"));
         };
    }
}
