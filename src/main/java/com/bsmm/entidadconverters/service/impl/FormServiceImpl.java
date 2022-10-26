package com.bsmm.entidadconverters.service.impl;

import com.bsmm.entidadconverters.domain.FormDTO;
import com.bsmm.entidadconverters.domain.FormEntity;
import com.bsmm.entidadconverters.repository.FormRepository;
import com.bsmm.entidadconverters.service.FormService;
import com.bsmm.entidadconverters.util.Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FormServiceImpl implements FormService {
    private final FormRepository formRepository;

    @Override
    public FormDTO create(FormDTO data) {
        FormEntity entity = Mapper.modelMapper().map(data, FormEntity.class);
        return this.toDto(this.formRepository.save(entity));
    }

    @Override
    public List<FormDTO> getAll() {
        return this.formRepository.findAll().stream().map(this::toDto).toList();
    }

    private FormDTO toDto(FormEntity entity) {
        return Mapper.modelMapper().map(entity, FormDTO.class);
    }
}
