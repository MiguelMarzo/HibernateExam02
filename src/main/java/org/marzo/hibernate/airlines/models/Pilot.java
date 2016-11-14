package org.marzo.hibernate.airlines.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
public class Pilot {

	@Id
	@GeneratedValue(generator = "gen")
	@GenericGenerator(name = "gen", strategy = "foreign", parameters = @Parameter(name = "property", value = "aircraft"))
	private long id;
	private String name;
	private Integer license;
	@OneToOne(cascade = { CascadeType.MERGE })
	@PrimaryKeyJoinColumn
	private Aircraft aircraft;

	public Pilot() {

	}

	public Pilot(long id, String name, Integer license, Aircraft aircraft) {
		this.id = id;
		this.name = name;
		this.license = license;
		this.aircraft = aircraft;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getLicense() {
		return license;
	}

	public void setLicense(Integer license) {
		this.license = license;
	}

	public Aircraft getAircraft() {
		return aircraft;
	}

	public void setAircraft(Aircraft aircraft) {
		this.aircraft = aircraft;
	}

	@Override
	public String toString() {
		return "Pilot [id=" + id + ", name=" + name + ", license=" + license + ", aircraft=" + aircraft + "]";
	}
	
	

}
