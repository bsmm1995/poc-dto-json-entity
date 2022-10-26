package com.bsmm.entidadconverters.repository;

import com.bsmm.entidadconverters.domain.FormEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormRepository extends JpaRepository<FormEntity, Long> {
}
