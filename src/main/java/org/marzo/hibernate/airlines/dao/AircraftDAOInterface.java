package org.marzo.hibernate.airlines.dao;

import java.util.List;

import org.marzo.hibernate.airlines.models.Aircraft;

public interface AircraftDAOInterface {
	
	public Aircraft selectById(Long id);
	public List<Aircraft> selectAll ();
	public void insert (Aircraft aircraft);
	public void update (Aircraft aircraft);
	public void delete (Aircraft aircraft);

}
