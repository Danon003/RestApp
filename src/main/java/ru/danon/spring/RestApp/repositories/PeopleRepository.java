package ru.danon.spring.RestApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.danon.spring.RestApp.models.Person;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {

}