package com.bsmm.entidadconverters.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@NoArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class FieldDTO implements Serializable {
    String name;
    String value;
    Boolean isActive;
}