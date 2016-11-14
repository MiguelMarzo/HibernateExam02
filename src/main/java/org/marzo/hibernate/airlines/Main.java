package org.marzo.hibernate.airlines;

import org.marzo.hibernate.airlines.dao.AircraftDAO;
import org.marzo.hibernate.airlines.dao.PilotDAO;
import org.marzo.hibernate.airlines.models.Aircraft;
import org.marzo.hibernate.airlines.models.Pilot;

public class Main {

	public static void main(String[] args) {
		Aircraft aircraft1 = new Aircraft();
		aircraft1.setModelo("Air 1");
		aircraft1.setAutonomy(2345);

		Aircraft aircraft2 = new Aircraft();
		aircraft2.setModelo("Air 2");
		aircraft2.setAutonomy(54321);
		
		Pilot pilot1 = new Pilot();
		pilot1.setName("P1");
		pilot1.setLicense(8787);

		Pilot pilot2 = new Pilot();
		pilot2.setName("P2");
		pilot2.setLicense(1233);
		
		pilot1.setAircraft(aircraft1);
		pilot2.setAircraft(aircraft2);


		AircraftDAO aircraftDAO = new AircraftDAO();
		PilotDAO pilotDAO = new PilotDAO();

		aircraftDAO.insert(aircraft1);
		aircraftDAO.insert(aircraft2);
		
		pilotDAO.insert(pilot1);
		pilotDAO.insert(pilot2);
		
		aircraftDAO.showAll();
		System.out.println("End");
		
		

	}

}
