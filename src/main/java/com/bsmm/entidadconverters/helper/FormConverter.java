package com.bsmm.entidadconverters.helper;

import com.bsmm.entidadconverters.domain.DetailDTO;
import com.bsmm.entidadconverters.util.Mapper;
import com.fasterxml.jackson.core.JsonProcessingException;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class FormConverter implements AttributeConverter<DetailDTO, String> {
    @Override
    public String convertToDatabaseColumn(DetailDTO dto) {
        String cad;
        try {
            cad = Mapper.objectMapper().writeValueAsString(dto);
        } catch (JsonProcessingException e) {
            cad = null;
        }
        return cad;
    }

    @Override
    public DetailDTO convertToEntityAttribute(String dbData) {
        DetailDTO dto;
        try {
            dto = Mapper.objectMapper().readValue(dbData, DetailDTO.class);
        } catch (JsonProcessingException e) {
            dto = null;
        }
        return dto;
    }
}
