package com.github.sammejanderson.PersonAPI.controller;

import com.github.sammejanderson.PersonAPI.dto.request.PersonDTO;
import com.github.sammejanderson.PersonAPI.dto.response.ResponseMessageDTO;
import com.github.sammejanderson.PersonAPI.exception.PersonNotFoundException;
import com.github.sammejanderson.PersonAPI.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/person")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PersonController {
    private PersonService personService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseMessageDTO createNewPerson(@RequestBody @Valid PersonDTO personDTO) {
        return personService.createNewPerson(personDTO);
    }

    @GetMapping
    public List<PersonDTO> listAllPeople() {
        return personService.listAllPeople();
    }

    @GetMapping("/{id}")
    public PersonDTO findPersonById(@PathVariable Long id) throws PersonNotFoundException {
        return personService.findPersonById(id);
    }

    @PutMapping("/{id}")
    public ResponseMessageDTO updatePersonById(@PathVariable Long id, @RequestBody PersonDTO personDTO) throws PersonNotFoundException {
        return personService.updatePersonById(id, personDTO);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePersonById(@PathVariable Long id) throws PersonNotFoundException {
        personService.deletePersonById(id);
    }


}
