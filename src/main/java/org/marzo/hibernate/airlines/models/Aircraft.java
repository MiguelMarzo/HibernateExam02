package org.marzo.hibernate.airlines.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Aircraft {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String modelo;
	private float autonomy;

	public Aircraft() {

	}

	public Aircraft(long id, String modelo, float autonomy, Pilot pilot) {
		this.id = id;
		this.modelo = modelo;
		this.autonomy = autonomy;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getAutonomy() {
		return autonomy;
	}

	public void setAutonomy(float autonomy) {
		this.autonomy = autonomy;
	}


	@Override
	public String toString() {
		return "Aircraft [id=" + id + ", modelo=" + modelo + ", autonomy=" + autonomy + "]";
	}
	
	

}
