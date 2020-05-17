package com.ash.rest.rest_test.Resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ash.rest.rest_test.Models.Heros;
import com.ash.rest.rest_test.Services.HeroService;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("heros")
public class MyResource {
	
    @GET
    @Produces(MediaType.APPLICATION_XML )
    public List<Heros> GetHerosInfo(){
        System.out.println("ooo");
        HeroService hService = new HeroService();

        return hService.GetAllHeros();

    }
    @Path("/{id}")
    @GET
    @Produces(MediaType.APPLICATION_XML )
    public Heros GetHeroinfo(@PathParam("id")Long id){
    	HeroService hService = new HeroService();
    	return hService.GetHero(id);
    }
}
