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
public class PropsDTO implements Serializable {
    @NotBlank String id;
    @NotBlank String formSubmitted;
    @NotBlank String validationScope;
}
