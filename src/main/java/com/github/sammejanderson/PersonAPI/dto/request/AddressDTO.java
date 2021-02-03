package com.github.sammejanderson.PersonAPI.dto.request;

import com.github.sammejanderson.PersonAPI.enums.AddressType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
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

    @NotNull
    private Integer number;

    private String complement;

    @NotEmpty
    private String cep;

    @Enumerated(EnumType.STRING)
    private AddressType addressType;


}
