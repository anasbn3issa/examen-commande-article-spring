package tn.esprit.spring.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Categorie {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idCategorie;
	private String nomcat;
	@OneToMany(cascade = CascadeType.ALL, mappedBy="categorie")
	@JsonIgnore
	private Set<Article> articles;
}
