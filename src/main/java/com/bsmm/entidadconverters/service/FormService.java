package com.bsmm.entidadconverters.service;

import com.bsmm.entidadconverters.domain.FormDTO;

import java.util.List;

public interface FormService {
    FormDTO create(FormDTO data);

    List<FormDTO> getAll();
}
