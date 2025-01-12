package com.javaprojet.webapp.repository;

import com.javaprojet.webapp.model.Responsable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository pour gérer les opérations CRUD sur les responsables.
 *
 * Cette interface étend {@link JpaRepository} et fournit des méthodes pour accéder et manipuler les données des responsables.
 * Elle inclut une méthode personnalisée pour rechercher un responsable par son prénom et son nom.
 *
 * @author Sahkana
 */
public interface ResponsableRepository extends JpaRepository<Responsable, Long> {

    /**
     * Recherche un responsable par son prénom et son nom.
     *
     * Cette méthode permet de trouver un responsable spécifique en fonction de son prénom et de son nom.
     *
     * @param prenom Le prénom du responsable à rechercher.
     * @param nom Le nom du responsable à rechercher.
     * @return Le responsable correspondant aux critères, ou null si aucun responsable n'est trouvé.
     */
    Responsable findByPrenomAndNom(String prenom, String nom);
}
