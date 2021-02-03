package com.github.sammejanderson.PersonAPI.service;

import com.github.sammejanderson.PersonAPI.dto.request.PersonDTO;
import com.github.sammejanderson.PersonAPI.dto.response.ResponseMessageDTO;
import com.github.sammejanderson.PersonAPI.entity.Person;
import com.github.sammejanderson.PersonAPI.exception.PersonNotFoundException;
import com.github.sammejanderson.PersonAPI.mapping.PersonMapper;
import com.github.sammejanderson.PersonAPI.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PersonService {

    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    private PersonRepository personRepository;


    public ResponseMessageDTO createNewPerson(PersonDTO personDTO) {
        Person personToSave = personMapper.toModel(personDTO);

        Person savedPerson = personRepository.save(personToSave);
        return CreateResponseMessage(savedPerson.getId(), "Created Person with ID: ");
    }


    public List<PersonDTO> listAllPeople() {
        List<Person> allPeople = personRepository.findAll();
        return allPeople.stream().map(personMapper::toDTO).collect(Collectors.toList());
    }


    public PersonDTO findPersonById(long id) throws PersonNotFoundException {
        Person person = verifyIfPersonExist(id);
        return personMapper.toDTO(person);
    }

    public void deletePersonById(long id) throws PersonNotFoundException {
        verifyIfPersonExist(id);
        personRepository.deleteById(id);
    }

    public ResponseMessageDTO updatePersonById(Long id, PersonDTO personDTO) throws PersonNotFoundException {
        verifyIfPersonExist(id);
        Person personToUpdate = personMapper.toModel(personDTO);

        Person updatedPerson = personRepository.save(personToUpdate);
        return CreateResponseMessage(updatedPerson.getId(), "Updated Person With Id: ");
    }

    private Person verifyIfPersonExist(long id) throws PersonNotFoundException {
        return personRepository.findById(id).orElseThrow(() -> new PersonNotFoundException(id));
    }


    private ResponseMessageDTO CreateResponseMessage(Long id, String message) {
        return ResponseMessageDTO.builder().message(message + id).build();
    }


}
