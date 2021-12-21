package tn.esprit.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table( name = "Article")
public class Article {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idArticle;
	private String nom;
	private int prix;
	private String image;
	@ManyToOne
	@Fetch(value=FetchMode.SELECT)
	@JoinColumn(name="idCategorie")
    private Categorie categorie;
	
	@ManyToOne
	@Fetch(value=FetchMode.SELECT)
	@JoinColumn(name="idCommande")
    private Commande commande;
}
