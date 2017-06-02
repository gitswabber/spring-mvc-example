package com.swabber.springmvc.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="COUNTRY")
public class Country {
	int id;
	
	String countryName;
	
	long population;
	
}
