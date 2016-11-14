package org.marzo.hibernate.airlines.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.marzo.hibernate.airlines.HibernateSession;
import org.marzo.hibernate.airlines.models.Aircraft;

public class AircraftDAO implements AircraftDAOInterface {

	/* 
	 * selects one aircraft by Id
	 * @param id
	 * @return aircraft
	 */
	public Aircraft selectById(Long id) {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	 
	    Aircraft aircraft = (Aircraft) session.get(Aircraft.class, id);
	    
	    session.close();
	    return aircraft;
	}
	public void showAll() {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	 
	    List<Aircraft> aircrafts = session.createQuery("from Aircraft").list();
	    
	    session.close();
	    for (Aircraft airc: aircrafts) {
	    	System.out.println(airc.toString());
	    }
	}

	/*
	 * retrieves all aircraft from db
	 * @return List of aircraft
	 */
	public List<Aircraft> selectAll() {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	 
	    List<Aircraft> aircrafts = session.createQuery("from Aircraft").list();
	    
	    session.close();
	    return aircrafts;
	}

	/*
	 * inserts a new aircraft in database
	 * retrieves generated id and sets to aircraft instance
	 * @param new Address
	 */
	public void insert(Aircraft aircraft) {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	
	    session.persist(aircraft);
	         
	    session.getTransaction().commit();
	    session.close();

	}

	/*
	 * updates aircraft
	 * @param aircraft to update
	 */
	public void update(Aircraft aircraft) {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		    Session session = sessionFactory.openSession();	 
		    session.beginTransaction();
		 
		    session.merge(aircraft);
		 
		    session.getTransaction().commit();
		    session.close();
	}

	/*
	 * delete given aircraft
	 * @param aircraft to delete
	 */
	public void delete(Aircraft aircraft) {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();	    
	    session.beginTransaction();
	    
	    session.delete(aircraft);
	 
	    session.getTransaction().commit();
	    session.close();
	}

}
