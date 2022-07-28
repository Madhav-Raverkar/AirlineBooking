package com.lti.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="PASSENGERS")
public class Passenger {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PASSENGERSEQ")
	@SequenceGenerator(name = "PASSENGERSEQ", sequenceName = "passengerseq", allocationSize = 1)
	@Column(name="PASSENGER_ID")
	private int passengerId;
	
	@Column(name = "NAME")
	private String passengerName;
	
	@Column(name = "AGE")
	private int passengerAge;
	
	@Column(name = "SEAT")
	private String seat;
	
	@Column(name = "GENDER")
	private String gender;
	
	@ManyToOne //(cascade = {CascadeType.ALL})
	@JoinColumn(name="TICKET_ID")
	Ticket ticket;
	

	public Passenger(int passengerId, String passengerName, int passengerAge, String seat, String gender,
			Ticket ticket) {
		super();
		this.passengerId = passengerId;
		this.passengerName = passengerName;
		this.passengerAge = passengerAge;
		this.seat = seat;
		this.gender = gender;
		this.ticket = ticket;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public Passenger(int passengerId, String passengerName, int passengerAge, String seat, String gender) {
		super();
		this.passengerId = passengerId;
		this.passengerName = passengerName;
		this.passengerAge = passengerAge;
		this.seat = seat;
		this.gender = gender;
	}

	public Passenger() {
		super();
	}

	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public int getPassengerAge() {
		return passengerAge;
	}

	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Passenger [passengerId=" + passengerId + ", passengerName=" + passengerName + ", passengerAge="
				+ passengerAge + ", seat=" + seat + ", gender=" + gender + "]";
	}
		
	
}