package com.ash.rest.rest_test.Database;

import java.util.HashMap;
import java.util.Map;

import com.ash.rest.rest_test.Models.Heros;

public class Database {
	
	
	private static Map<Long, Heros> heromap = new HashMap<>();
	
	public static Map<Long, Heros> getHeros(){
		return heromap;
	}

}
