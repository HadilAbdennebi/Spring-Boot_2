package com.hadil.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hadil.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
