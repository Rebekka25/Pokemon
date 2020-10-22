package de.pokemon.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.pokemon.repository.PokemonRepository;

@Component
public class PokemonEntityLogic {
	@Autowired
	private PokemonRepository PokemonRepository;
	public List<Pokemon> createPokemons() {
		
		  List<Pokemon> PokemonList = new ArrayList<Pokemon>();
		  Pokemon Pokemon = new Pokemon();
		  Pokemon.setNr(1);
		  Pokemon.setName("Bisasam    ");
		  Pokemon.setSize(34534);
		  Pokemon.setImagePath("../../assets/img/Pokemons/Bisasam.PNG");
		  PokemonList.add(Pokemon);
		  
		  PokemonRepository.save(Pokemon);
		  
		  Pokemon Pokemon2 = new Pokemon();
		  Pokemon.setNr(2);
		  Pokemon.setName("Bisaknosp");
		  Pokemon.setSize(34534);
		  Pokemon.setImagePath("../../assets/img/Pokemons/Bisaknosp.PNG");
		  PokemonList.add(Pokemon);
		  
		  PokemonRepository.save(Pokemon);
		  
		  Pokemon Pokemon3 = new Pokemon();
		  Pokemon3.setNr(3);
		  Pokemon3.setName("Bisasaflor ");
		  Pokemon3.setSize(34534);
		  Pokemon3.setImagePath("../../assets/img/Pokemons/Bisaflor.PNG");
		  PokemonList.add(Pokemon3);
		  
		  PokemonRepository.save(Pokemon3);
		  
		  Pokemon Pokemon4 = new Pokemon();
		  Pokemon4.setNr(4);
		  Pokemon4.setName("Schiggy    ");
		  Pokemon4.setSize(34534);
		  Pokemon4.setImagePath("../../assets/img/Pokemons/Schiggy.PNG");
		  PokemonList.add(Pokemon4);
		  
		  PokemonRepository.save(Pokemon4);
		  
		  Pokemon Pokemon5 = new Pokemon();
		  Pokemon5.setNr(5);
		  Pokemon5.setName("Schillok   ");
		  Pokemon5.setSize(34534);
		  Pokemon5.setImagePath("../../assets/img/Pokemons/Schillock.PNG");
		  PokemonList.add(Pokemon5);
		  
		  PokemonRepository.save(Pokemon5);
		  
		  Pokemon Pokemon6 = new Pokemon();
		  Pokemon6.setNr(6);
		  Pokemon6.setName("Turtok     ");
		  Pokemon6.setSize(34534);
		  Pokemon6.setImagePath("../../assets/img/Pokemons/Turtok.PNG");
		  PokemonList.add(Pokemon6);
		  
		  PokemonRepository.save(Pokemon6);
		  
		  Pokemon Pokemon7 = new Pokemon();
		  Pokemon7.setNr(7);
		  Pokemon7.setName("Glumanda   ");
		  Pokemon7.setSize(34534);
		  Pokemon7.setImagePath("../../assets/img/Pokemons/Glumanda.PNG");
		  PokemonList.add(Pokemon7);
		  
		  PokemonRepository.save(Pokemon7);
		  
		  
		  Pokemon Pokemon8 = new Pokemon();
		  Pokemon8.setNr(8);
		  Pokemon8.setName("Glutexo    ");
		  Pokemon8.setSize(34534);
		  Pokemon8.setImagePath("../../assets/img/Pokemons/Glutexo.PNG");
		  PokemonList.add(Pokemon8);
		  
		  PokemonRepository.save(Pokemon8);
		  
		  Pokemon Pokemon9 = new Pokemon();
		  Pokemon9.setNr(9);
		  Pokemon9.setName("Glurak     ");
		  Pokemon9.setSize(34534);
		  Pokemon9.setImagePath("../../assets/img/Pokemons/Glurak.PNG");
		  PokemonList.add(Pokemon9);
		  
		  PokemonRepository.save(Pokemon9);
		  
		  return PokemonList;
		
	}
}
