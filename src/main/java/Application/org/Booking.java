package Application.org;

import java.time.LocalDate;
import java.time.LocalTime;


import jakarta.persistence.*;

@Entity
public class Booking {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Booking_ID")
	private int BookingID;
	
	@Column(name = "Booking_Date",nullable = false)
	private LocalDate BookingDate;
	
	@Column(name = "Booking_Time",nullable = false)
	private LocalTime BookingTime;
	
	@Column(name ="Booking_Status")
	private String Status;
	
	@OneToMany
	@JoinColumn(name ="Customer_ID")
	private Customer customer;
	
	@ManyToOne
	@JoinColumn(name="Station_ID")
	private ChargingStation chargingstation;
	
	@OneToOne(mappedBy="Booking")
	private ChargingSession chargingsession;
	
	
	public ChargingSession getChargingsession() {
		return chargingsession;
	}
	public void setChargingsession(ChargingSession chargingsession) {
		this.chargingsession = chargingsession;
	}
	public Booking() {
		
	}
	public Booking(LocalDate BookingDate,LocalTime BookingTime,String Status) {
		this.BookingDate=BookingDate;
		this.BookingTime=BookingTime;
		this.Status=Status;
	}
	public int getBookingID() {
		return BookingID;
	}
	public void setBookingID(int bookingID) {
		BookingID = bookingID;
	}
	public LocalDate getBookingDate() {
		return BookingDate;
	}
	public void setBookingDate(LocalDate bookingDate) {
		BookingDate = bookingDate;
	}
	public LocalTime getBookingTime() {
		return BookingTime;
	}
	public void setBookingTime(LocalTime bookingTime) {
		BookingTime = bookingTime;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public ChargingStation getChargingstation() {
		return chargingstation;
	}
	public void setChargingstation(ChargingStation chargingstation) {
		this.chargingstation = chargingstation;
	}
	
	

}
