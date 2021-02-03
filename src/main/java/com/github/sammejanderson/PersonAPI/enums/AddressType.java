package com.github.sammejanderson.PersonAPI.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AddressType {
    HOME("home"),
    WORK("work"),
    OTHER("other");

    private final String description;
}
