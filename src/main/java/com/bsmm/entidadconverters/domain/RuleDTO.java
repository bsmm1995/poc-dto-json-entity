package com.bsmm.entidadconverters.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@NoArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RuleDTO implements Serializable {
    @NotBlank String ordinaryRules;
    @NotBlank String maxLength;
    @NotBlank String minLength;
}
