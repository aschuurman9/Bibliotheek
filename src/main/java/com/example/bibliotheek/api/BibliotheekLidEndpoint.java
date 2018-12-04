package com.example.bibliotheek.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.bibliotheek.controller.BibliotheekLidService;
import com.example.bibliotheek.domain.BibliotheekLid;


@Path("bibliotheeklid")
@Component
public class BibliotheekLidEndpoint {
	
	@Autowired
	private BibliotheekLidService bibliotheekLidService;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response listGroep(){
		Iterable <BibliotheekLid> leden = bibliotheekLidService.vindAlleLeden();
		return Response.ok(leden).build();
	}
		
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response listGroep(BibliotheekLid lid){
		BibliotheekLid leden = bibliotheekLidService.maakNieuwLid(lid);
		return Response.ok(leden.getId()).build();
	}

}