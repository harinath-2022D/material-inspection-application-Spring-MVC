package com.zettamine.mi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "insp_actu")
@Data
public class InspectionActuals {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer actualId;
	
	@ManyToOne
    private InspectionLot inspectionLot;
	
	@ManyToOne
	private MaterialInspectionCharacteristics materialInspectionCharacteristics;
	
	private Double maximumMeasurement;
	
	private Double minimumMeasurement;
	
	transient
	private String requiredLot;

}
