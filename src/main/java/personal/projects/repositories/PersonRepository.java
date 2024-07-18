package personal.projects.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import personal.projects.models.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
