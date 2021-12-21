package tn.esprit.spring.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import tn.esprit.spring.entity.Article;
import tn.esprit.spring.entity.Categorie;
import tn.esprit.spring.entity.Commande;

public interface IAllServices {

	public void ajouterArticle(Article article);
	public void ajouterCommande(Commande c);
	public void ajouterCategorie(Categorie cat);
	public void affecteArtCat(int idcat,int idart);
	public void affecterArtCmd(int idcmd,int idart);
	public List<String> getAllArticleNamesByCategorie(long idmacategorie);
	public List<String> getAllCategories();
}
