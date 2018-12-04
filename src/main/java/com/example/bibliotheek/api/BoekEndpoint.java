package com.example.bibliotheek.api;

import java.util.Optional;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.bibliotheek.controller.BoekService;
import com.example.bibliotheek.domain.Boek;


@Path("boek")
@Component
public class BoekEndpoint {
	
	
	@Autowired
	private BoekService boekService;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response listGroep(){
		Iterable <Boek> boeken = boekService.vindAlleBoeken();
		return Response.ok(boeken).build();
	}
		
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response listGroep(Boek boek){
		Boek boekResult = boekService.maakNieuwBoek(boek);
		return Response.ok(boekResult).build();
	}
	
	@Path("{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response listGroup(@PathParam("id") Long id) {
		Optional<Boek> boek = boekService.boekVindMetId(id);
		return Response.ok(boek).build();
	}
	
	@Path("titel")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response listGroup() {
		Iterable <Boek> titelBoeken = boekService.vindAlleTitels();
		return Response.ok(titelBoeken).build();
	}

}