package com.shubham.SMA.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@ToString
@Getter
@Setter
public class StudentDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long studentID;
	
	@NotBlank(message = "Name is mandatory")
	private String name;
	
	@NotBlank(message = "Email is mandatory")
	@Email
	private String email;
	
	@NotBlank(message = "course is mandatory")
	private String course;
	
	@NotNull(message = "age is mandatory")
	private Integer age;
}
