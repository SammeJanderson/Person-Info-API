package com.github.sammejanderson.PersonAPI.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class PersonDTO {

    private Long id;

    @Size(min = 2, max = 100)
    private String name;

    private Integer age;

    private String rg;

    @CPF
    @NotEmpty
    private String cpf;

    @Valid
    @NotEmpty
    private List<AddressDTO> addresses;

    @Valid
    @NotEmpty
    private List<PhoneDTO> phones;


}
