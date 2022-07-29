package com.lti.beans;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="TICKETS")
public class Ticket {
	
	@Id
	@Column(name="TICKET_ID")
	private int ticketId;
	
	@Column(name="TOTALPASSENGER")
	private int totalPassengers;
	
	@Column(name="BOOKINGDATE")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date bookingDate;
	
	@Column(name="GATENO")
	private int gateNo;
	
	@OneToOne //(cascade = {CascadeType.ALL})
	@JoinColumn(name = "FLIGHT_ID")
	Flight flight;
	
	public Ticket(int ticketId, int totalPassengers, Date bookingDate, int gateNo, Flight flight) {
		super();
		this.ticketId = ticketId;
		this.totalPassengers = totalPassengers;
		this.bookingDate = bookingDate;
		this.gateNo = gateNo;
		this.flight = flight;
	}

	public Ticket() {
		super();
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public int getTotalPassengers() {
		return totalPassengers;
	}

	public void setTotalPassengers(int totalPassengers) {
		this.totalPassengers = totalPassengers;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public int getGateNo() {
		return gateNo;
	}

	public void setGateNo(int gateNo) {
		this.gateNo = gateNo;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", totalPassengers=" + totalPassengers + ", bookingDate=" + bookingDate
				+ ", gateNo=" + gateNo + ", flight=" + flight + "]";
	}

	
}
