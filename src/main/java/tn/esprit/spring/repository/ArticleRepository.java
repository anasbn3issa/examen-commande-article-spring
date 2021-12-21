package tn.esprit.spring.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entity.Article;


public interface ArticleRepository extends CrudRepository<Article, Long> {

	@Query("SELECT a.nom FROM Article a WHERE a.categorie.idCategorie = ?1")
	List<String> retrieveArticleNamesByCategorie(long idmacategorie);

}
