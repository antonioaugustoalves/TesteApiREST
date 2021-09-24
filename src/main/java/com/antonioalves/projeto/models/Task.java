package com.antonioalves.projeto.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Task {
	@Id
	@GeneratedValue
	@Column(updatable = false, nullable = false)
	private Long id;
	@Column
	private String title;
	@Column
	private String description;
	@Column
	private Status status;
	@CreationTimestamp
	private Timestamp dateCreation;
	@UpdateTimestamp
	private Timestamp lastModification;
	
	
}
