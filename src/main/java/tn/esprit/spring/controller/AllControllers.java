package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.service.IAllServices;

import io.swagger.annotations.Api;
import tn.esprit.spring.entity.Article;
import tn.esprit.spring.entity.Categorie;
import tn.esprit.spring.entity.Commande;

@RestController
@RequestMapping("/springexam")
@Api(tags= "All controllers")
public class AllControllers {
	@Autowired
	IAllServices service;
	@PostMapping("/add-categorie")
	@ResponseBody
	public void ajouterCategorie(@RequestBody Categorie cat) {
		service.ajouterCategorie(cat);
	}
	
	@PostMapping("/add-article")
	@ResponseBody
	public void ajouterArticle(@RequestBody Article article) {
		service.ajouterArticle(article);
	}
	@PostMapping("/add-commande")
	@ResponseBody
	public void ajouterCommande(@RequestBody Commande c) {
		service.ajouterCommande(c);
	}
	
	@PutMapping("/affect-art-cat")
	@ResponseBody
	public void affecteArtCat(int idcat, int idart) {
		service.affecteArtCat(idcat, idart);
	}
	
	@PutMapping("/affect-art-cmd")
	@ResponseBody
	public void affecterArtCmd(int idcmd, int idart) {
		service.affecterArtCmd(idcmd, idart);
	}
	
	@GetMapping("/get-articles/{idmacategorie}")
	@ResponseBody
	public List<String> getAllArticleNamesByCategorie(@PathVariable("idmacategorie") long idmacategorie) {
		return service.getAllArticleNamesByCategorie(idmacategorie);
	}
	
	@GetMapping("get-all-categories")
	@ResponseBody
	public List<String> getAllCategories() {
		return service.getAllCategories();
	}

}
