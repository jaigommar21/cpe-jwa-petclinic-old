package com.tecsup.jwa.petclinic.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.tecsup.jwa.petclinic.entity.Owner;

/**
 * 
 * @author jgomezm
 *
 */
@Service
public class OwnerService {

	private static final Logger logger = LoggerFactory.getLogger(OwnerService.class);

	
	public List<Owner>  prepareOwners() {
		
		List<Owner> data = new ArrayList<Owner>();
		
		data.add(new Owner("Juan","Acosta","Av. Chimu","Lima","945945945", new Date(), false));
		data.add(new Owner("Maribel","Garcia","Av. San Borja","Lima","912912912", new Date(), true));
		data.add(new Owner("Marco","Alegria","Av. Junin","Lima","933933933", new Date(), true));
	
		logger.info(data.toString());
		
		return data;
	}



}