package com.lti.aeroplane;

import java.util.List;

public class Flight {
private int flightId;
private String fromSector;
private String toSector;
private int capacity;
private List<Airline>Airlinelist;
public List<Airline> getAirlinelist() {
	return Airlinelist;
}
public void setAirlinelist(List<Airline> airlinelist) {
	Airlinelist = airlinelist;
}
public int getFlightId() {
	return flightId;
}
public void setFlightId(int flightId) {
	this.flightId = flightId;
}
public String getFromSector() {
	return fromSector;
}
public void setFromSector(String fromSector) {
	this.fromSector = fromSector;
}
public String getToSector() {
	return toSector;
}
public void setToSector(String toSector) {
	this.toSector = toSector;
}
public int getCapacity() {
	return capacity;
}
public void setCapacity(int capacity) {
	this.capacity = capacity;
}
public Flight(int flightId, String fromSector, String toSector, int capacity) {
	super();
	this.flightId = flightId;
	this.fromSector = fromSector;
	this.toSector = toSector;
	this.capacity = capacity;
}
public Flight() {
	super();
	
}
@Override
public String toString() {
	return "Flight [flightId=" + flightId + ", fromSector=" + fromSector + ", toSector=" + toSector + ", capacity="
			+ capacity + "]";
}

}

