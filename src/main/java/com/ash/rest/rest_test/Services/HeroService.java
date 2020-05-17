package com.ash.rest.rest_test.Services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.glassfish.jersey.internal.util.collection.Values;

import com.ash.rest.rest_test.Database.Database;
import com.ash.rest.rest_test.Models.Heros;

public class HeroService {
	public HeroService(){
		heros.put(1L, new Heros(1,"Uranus","Tank","Mega Heal",1000,2000,400,500,1500));
		heros.put(2L, new Heros(2,"Alpha","Fighter","Ultimate Weapon",1000,2000,400,500,1500));
	}
	Map<Long, Heros> heros = Database.getHeros();
	public List<Heros> GetAllHeros(){
		//Heros h1=new Heros(1,"Uranus","Tank","Mega Heal",1000,2000,400,500,1500);
		//Heros h2=new Heros(2,"Alpha","Fighter","Ultimate Weapon",1000,2000,400,500,1500);
		
		return new ArrayList<Heros>(heros.values());
	}
	
	public Heros GetHero(long id){
		return heros.get(id);
	}
	
	public void DeleteHero(long id){
		heros.remove(id);
	}
	
	public Heros addHero(Heros h1){
		h1.setID(heros.size()+1);
		heros.put(h1.getID(), h1);
		return h1;
	}
	
	public Heros updateHero(Heros h1){
		if(h1.getID()<=0)	return null;
		heros.put(h1.getID(), h1);
		return h1;
		
	}
}
	
