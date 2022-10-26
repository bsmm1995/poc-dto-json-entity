package com.bsmm.entidadconverters.controller;

import com.bsmm.entidadconverters.domain.FormDTO;
import com.bsmm.entidadconverters.service.FormService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/persons")
@RequiredArgsConstructor
public class FormController {
    private final FormService formService;

    @GetMapping
    public ResponseEntity<List<FormDTO>> getAll() {
        return ResponseEntity.ok(formService.getAll());
    }

    @PostMapping
    public ResponseEntity<FormDTO> create(@RequestBody @Valid FormDTO data) {
        return new ResponseEntity<>(formService.create(data), HttpStatus.CREATED);
    }
}
