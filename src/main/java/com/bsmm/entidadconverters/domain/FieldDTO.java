package com.bsmm.entidadconverters.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class FieldDTO implements Serializable {
    String formkit;
    String name;
    String appLabel;
    String id;
    String value;
    String showClear;
    String filter;
    String help;
    String clase;
    List<@Valid FieldDTO> children = new ArrayList<>();
    RuleDTO rules;
}