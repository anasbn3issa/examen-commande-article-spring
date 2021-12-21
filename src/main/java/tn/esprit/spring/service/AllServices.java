package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Article;
import tn.esprit.spring.entity.Categorie;
import tn.esprit.spring.entity.Commande;
import tn.esprit.spring.repository.ArticleRepository;
import tn.esprit.spring.repository.CommandeRepository;
import tn.esprit.spring.repository.CategorieRepository;

@Service
public class AllServices implements IAllServices{

	@Autowired
	ArticleRepository articleRepository;
	@Autowired
	CommandeRepository commandeRepository;
	@Autowired
	CategorieRepository categorieRepository;
	@Override
	public void ajouterArticle(Article article) {
		articleRepository.save(article);		
	}

	@Override
	public void ajouterCommande(Commande c) {
		commandeRepository.save(c);
		
	}

	@Override
	public void ajouterCategorie(Categorie cat) {
		categorieRepository.save(cat);		
	}

	@Override
	public void affecteArtCat(int idcat, int idart) {
		Article article= articleRepository.findById((long) idart).orElse(null);
		Categorie categorie = categorieRepository.findById((long) idcat).orElse(null);
		article.setCategorie(categorie);
		articleRepository.save(article);
	}

	@Override
	public void affecterArtCmd(int idcmd, int idart) {
		Article article= articleRepository.findById((long) idart).orElse(null);
		Commande commande = commandeRepository.findById((long) idcmd).orElse(null);
		article.setCommande(commande);
		articleRepository.save(article);

	}

	@Override
	public List<String> getAllArticleNamesByCategorie(long idmacategorie) {
		return articleRepository.retrieveArticleNamesByCategorie(idmacategorie);
	}

	@Override
	public List<String> getAllCategories() {
		return categorieRepository.getAllCategories();
	}

}
