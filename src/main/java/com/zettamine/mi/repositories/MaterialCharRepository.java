package com.zettamine.mi.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zettamine.mi.entities.MaterialInspectionCharacteristics;

@Repository
public interface MaterialCharRepository extends JpaRepository<MaterialInspectionCharacteristics, Serializable> {

}
