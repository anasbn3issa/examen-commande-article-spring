package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entity.Commande;

public interface CommandeRepository extends CrudRepository<Commande, Long>{

}
