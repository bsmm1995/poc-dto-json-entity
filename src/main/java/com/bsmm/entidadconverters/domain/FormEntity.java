package com.bsmm.entidadconverters.domain;

import com.bsmm.entidadconverters.helper.FormConverter;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity(name = "FORM")
@NoArgsConstructor
public class FormEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, unique = true)
    Long id;

    @Column(nullable = false)
    String names;

    @Convert(converter = FormConverter.class)
    @Column(name = "FIELD_JSON", columnDefinition = "TEXT")
    DetailDTO detail;
}
