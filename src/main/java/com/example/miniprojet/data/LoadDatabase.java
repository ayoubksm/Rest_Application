package com.example.miniprojet.data;

import com.example.miniprojet.entity.Personne;
import com.example.miniprojet.repository.PersonneRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(PersonneRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Personne(null, "f14522", "Ayoub", "KASMI")));
            log.info("Preloading " + repository.save(new Personne(null, "f47954", "mohammed", "alami")));
            log.info("Preloading " + repository.save(new Personne(null, "f47004", "karim", "alaoui")));
        };
    }
}
