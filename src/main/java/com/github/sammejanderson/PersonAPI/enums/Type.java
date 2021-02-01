package com.github.sammejanderson.PersonAPI.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Type {
    COMMERCIAL("comercial"),
    RESIDENTIAL("residencial"),
    MOBILE("mobile");

    private final String description;
}
