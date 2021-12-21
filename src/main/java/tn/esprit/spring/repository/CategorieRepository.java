package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entity.Categorie;

public interface CategorieRepository extends CrudRepository<Categorie, Long>{
	@Query("SELECT c.nomcat FROM Categorie c")
	public List<String> getAllCategories();
}
