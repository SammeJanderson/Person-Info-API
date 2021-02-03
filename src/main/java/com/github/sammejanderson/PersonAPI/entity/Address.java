
package com.github.sammejanderson.PersonAPI.entity;


import com.github.sammejanderson.PersonAPI.enums.AddressType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String street;

    @Column(nullable = false)
    private Integer number;

    @Column(nullable = true)
    private String complement;

    @Column(nullable = false)
    private String cep;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private AddressType addressType;

}
