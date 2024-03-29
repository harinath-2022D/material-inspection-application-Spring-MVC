package com.zettamine.mi.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(uniqueConstraints = @UniqueConstraint(columnNames = { "plantName"}))
public class Plant {
	
	@Id
	private String plantId;
	
	private String plantName;
	
	private String location;
	
	@OneToMany(mappedBy="plant", cascade = CascadeType.ALL)
	private List<InspectionLot> inspectionLot;
	
}
