package com.github.sammejanderson.PersonAPI.mapping;

import com.github.sammejanderson.PersonAPI.dto.dto.request.PersonDTO;
import com.github.sammejanderson.PersonAPI.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    PersonDTO PersonToPersonDTO(Person person);
}
