package personal.projects.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import personal.projects.models.Person;
import personal.projects.repositories.PersonRepository;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin
public class Home {

    private PersonRepository personRepository;

    @GetMapping("/")
    public String getHome(){

        return "Welcome home my brother";
    }


    @GetMapping("/all")
    public List<Person> getAll(){

        return personRepository.findAll();
    }


    @GetMapping("/person/{id}")
    public Person getById(@PathVariable Long id){

        return personRepository.findById(id).get();
    }

}
