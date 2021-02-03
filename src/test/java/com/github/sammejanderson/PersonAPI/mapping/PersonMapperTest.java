package com.github.sammejanderson.PersonAPI.mapping;

import com.github.sammejanderson.PersonAPI.dto.request.PersonDTO;
import com.github.sammejanderson.PersonAPI.entity.Address;
import com.github.sammejanderson.PersonAPI.entity.Person;
import com.github.sammejanderson.PersonAPI.entity.Phone;
import com.github.sammejanderson.PersonAPI.enums.PhoneType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class PersonMapperTest {

    @Test
    @DisplayName("Successfully Mapped entity to DTO")
    public void ShouldMapPersonToPersonDTO() {
        //Given
        Person person = new Person(1L, "Samme Janderson", 27, "22.639.037-8", "212.771.610-89",
                new Address(1L, "Rua Qualquer", 123, "casa 01", 06112010),
                List.of(new Phone(1L, 953958789, PhoneType.MOBILE)));

        //When
        PersonDTO personDTO = PersonMapper.INSTANCE.toDTO(person);

        //Then
        assertThat(personDTO).isNotNull();
        assertThat(personDTO.getName()).isEqualTo("Samme Janderson");
        assertThat(personDTO.getAge()).isEqualTo(27);
        assertThat(personDTO.getRg()).isEqualTo("22.639.037-8");
        assertThat(personDTO.getCpf()).isEqualTo("212.771.610-89");

    }


}