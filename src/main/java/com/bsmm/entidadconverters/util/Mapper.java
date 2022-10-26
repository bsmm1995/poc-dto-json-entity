package com.bsmm.entidadconverters.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.modelmapper.ModelMapper;

public class Mapper {
    private Mapper() {
        throw new IllegalStateException("Utility class");
    }

    public static ModelMapper modelMapper() {
        return new ModelMapper();
    }

    public static ObjectMapper objectMapper() {
        return new ObjectMapper();
    }
}