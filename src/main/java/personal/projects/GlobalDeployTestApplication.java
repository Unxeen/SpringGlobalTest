package personal.projects;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import personal.projects.models.Person;
import personal.projects.repositories.PersonRepository;

@SpringBootApplication
public class GlobalDeployTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(GlobalDeployTestApplication.class, args);
    }

    @Bean
    public CommandLineRunner init(PersonRepository personRepository){

        return args -> {


           personRepository.save(
                   Person
                          .builder()
                          .firstname("Ayoub")
                          .lastname("Elghazi")
                          .username("Unxeen")
                          .build()
           );


            personRepository.save(
                    Person
                            .builder()
                            .firstname("Nabil")
                            .lastname("Elghazi")
                            .username("Yo9anbil")
                            .build()
            );

            personRepository.save(
                    Person
                            .builder()
                            .firstname("Omar")
                            .lastname("Elghazi")
                            .username("Yo3ammir")
                            .build()
            );
        };
    }
}
