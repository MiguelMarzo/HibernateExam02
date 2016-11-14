package org.marzo.hibernate.airlines.dao;

import java.util.List;

import org.marzo.hibernate.airlines.models.Pilot;

public interface PilotDAOInterface {
	
	public Pilot selectById(Long id);
	public List<Pilot> selectAll ();
	public void insert (Pilot pilot);
	public void update (Pilot pilot);
	public void delete (Pilot pilot);

}
