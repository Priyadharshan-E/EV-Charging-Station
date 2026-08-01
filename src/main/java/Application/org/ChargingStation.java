package Application.org;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class ChargingStation {
	
	@Id
	@Column(name = "Station_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int StationID;
	
	@Column(name = "Station_Name",nullable = false)
	private String StationName;
	
	@Column( nullable = false)
	private String location;
	
	@Column(name ="Total_Slots")
	private int TotalSlots;
	
	@Column(name="Available_Slots")
	private int AvailableSlots;

	@OneToMany(mappedBy="ChargingStation")
	private List<Booking> bookings;
	
	
public ChargingStation() {
}
   public ChargingStation(String SationName, String location, int TotalSlots, int AvailableSlots) {
   this.StationName = SationName;
   this.location = location;
   this.TotalSlots = TotalSlots;
   this.AvailableSlots= AvailableSlots;
	 
	
}
   public int getStationID() {
	return StationID;
   }
   public void setStationID(int stationID) {
	StationID = stationID;
   }
   public String getStationName() {
	return StationName;
   }
   public void setStationName(String stationName) {
	StationName = stationName;
   }
   public String getLocation() {
	return location;
   }
   public void setLocation(String location) {
	this.location = location;
   }
   public int getTotalSlots() {
	return TotalSlots;
   }
   public void setTotalSlots(int totalSlots) {
	TotalSlots = totalSlots;
   }
   public int getAvailableSlots() {
	return AvailableSlots;
   }
   public void setAvailableSlots(int availableSlots) {
	AvailableSlots = availableSlots;
   }
   public List<Booking> getBookings() {
	return bookings;
   }
   public void setBookings(List<Booking> bookings) {
	this.bookings = bookings;
   }
}
