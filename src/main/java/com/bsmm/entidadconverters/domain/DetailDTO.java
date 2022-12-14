package com.bsmm.entidadconverters.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DetailDTO implements Serializable {
    @NotBlank String cmp;
    @NotBlank PropsDTO props;
    @NotBlank String description;
    List<@Valid FieldDTO> children = new ArrayList<>();
}
