package com.github.sammejanderson.PersonAPI.mapping;

import com.github.sammejanderson.PersonAPI.dto.request.PersonDTO;
import com.github.sammejanderson.PersonAPI.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    Person toModel(PersonDTO personDTO);

    PersonDTO toDTO(Person person);


}
