package com.uep.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "material")

public class Material {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String title;
	private String description;
	private String fileUrl;

	@ManyToOne
	@JoinColumn(name = "uploaded_by")
	private User uploadedBy;

	@ManyToOne
	@JoinColumn(name = "subject_id")
	private Subject subject;

	@OneToMany(mappedBy = "material")
	private List<Comment> comments = new ArrayList<>();
}
