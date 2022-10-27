package com.bsmm.entidadconverters.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@NoArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class FormDTO implements Serializable {
    Long id;
    @NotBlank
    String names;
    @NotBlank
    String version;
    @NotNull
    DetailDTO detail;
}
