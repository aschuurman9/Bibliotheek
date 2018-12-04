package com.example.bibliotheek.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.example.bibliotheek.api.BibliotheekLidEndpoint;
import com.example.bibliotheek.api.BoekEndpoint;



@Component
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig(){
		register(BoekEndpoint.class);
		register(BibliotheekLidEndpoint.class);
	}
}