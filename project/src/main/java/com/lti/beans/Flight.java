package com.lti.beans;

import java.sql.Time;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="FLIGHT")
public class Flight {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FLIGHTSEQ")
	@SequenceGenerator(name = "FLIGHTSEQ", sequenceName = "flightseq", allocationSize = 1)
	@Column(name="FLIGHT_ID")
	private int flightId;
	
	@Column(name = "SOURCE")
	private String source;
	
	@Column(name = "DESTINATION")
	@DateTimeFormat(pattern = "hh:mm:ss")
	private String destination;
	
	@Column(name = "DEPARTURE_TIME")
	@DateTimeFormat(pattern = "hh:mm:ss")
	private Time departureTime;
	
	@Column(name = "ARRIVAL_TIME")
	private Time arrivalTime;
	
	@Column(name = "SEATS")
	private int seatAvailable;
	
	@Column(name = "JOURNEY_DATE")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date journeyDate;
	
	@Column(name = "COST")
	private double cost;
	
	//constructor
	public Flight(int flightId, String source, String destination, Time departureTime, Time arrivalTime,
			int seatAvailable, Date journeyDate, double cost) {
		super();
		this.flightId = flightId;
		this.source = source;
		this.destination = destination;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.seatAvailable = seatAvailable;
		this.journeyDate = journeyDate;
		this.cost = cost;
	}

	public Flight() {
		super();
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Time getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Time departureTime) {
		this.departureTime = departureTime;
	}

	public Time getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Time arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public int getSeatAvailable() {
		return seatAvailable;
	}

	public void setSeatAvailable(int seatAvailable) {
		this.seatAvailable = seatAvailable;
	}

	public Date getJourneyDate() {
		return journeyDate;
	}

	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", source=" + source + ", destination=" + destination
				+ ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime + ", seatAvailable="
				+ seatAvailable + ", journeyDate=" + journeyDate + ", cost=" + cost + "]";
	}
	
	
	
}