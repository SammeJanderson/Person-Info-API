package com.github.sammejanderson.PersonAPI.dto.request;

import com.github.sammejanderson.PersonAPI.enums.PhoneType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PhoneDTO {

    private Long id;

    @Size(min = 13, max = 14)
    private String number;

    @Enumerated(EnumType.STRING)
    private PhoneType type;

}
