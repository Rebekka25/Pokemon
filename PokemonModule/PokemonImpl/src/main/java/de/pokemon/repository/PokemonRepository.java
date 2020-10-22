package de.pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import de.pokemon.entity.Pokemon;

public interface PokemonRepository  extends JpaRepository<Pokemon, Long>{

}
