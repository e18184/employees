package com.example.demo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter 
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity 
@Table(name="employees")
public class Employee {
	@Id 
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	@Column(name="first_name", nullable=false)
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	private String email;
	
}
