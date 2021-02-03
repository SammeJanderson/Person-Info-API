package com.github.sammejanderson.PersonAPI.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddressDTO {
    private Long id;

    @NotEmpty
    @Size(min = 5, max = 100)
    private String street;

    @NotEmpty
    private Integer number;

    private String complement;

    @NotEmpty
    private Integer cep;


}
