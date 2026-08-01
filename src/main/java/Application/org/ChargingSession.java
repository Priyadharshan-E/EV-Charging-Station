package Application.org;

import java.time.LocalDateTime;
import jakarta.persistence.*;

@Entity
public class ChargingSession {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Session_ID")
	private int SessionID;
	
	@Column(name="Stating_Time")
	private LocalDateTime StartingTime;
	
	@Column(name="Ending_Time")
	private LocalDateTime EndingTime;
	
	@Column(name="Units_Consumed")
	private float UnitConsumed;
	
	@Column(name="Status")
	private String Status;
	
	
	@OneToOne
	@JoinColumn(name="Booking_ID")
	private Booking Bookings;

	
public ChargingSession(){
	
}
   public ChargingSession(LocalDateTime StartingTime,LocalDateTime EndingTime,float UnitConsumed,String Status) {
	   this.StartingTime=StartingTime;
	   this.EndingTime=EndingTime;
	   this.UnitConsumed=UnitConsumed;
	   this.Status=Status;
   }
   public int getSessionID() {
	return SessionID;
   }
   public void setSessionID(int sessionID) {
	SessionID = sessionID;
   }
   public LocalDateTime getStartingTime() {
	return StartingTime;
   }
   public void setStartingTime(LocalDateTime startingTime) {
	StartingTime = startingTime;
   }
   public LocalDateTime getEndingTime() {
	return EndingTime;
   }
   public void setEndingTime(LocalDateTime endingTime) {
	EndingTime = endingTime;
   }
   public float getUnitConsumed() {
	return UnitConsumed;
   }
   public void setUnitConsumed(float unitConsumed) {
	UnitConsumed = unitConsumed;
   }
   public String getStatus() {
	return Status;
   }
   public void setStatus(String status) {
	Status = status;
   }
   public Booking getBookings() {
	return Bookings;
   }
   public void setBookings(Booking bookings) {
	Bookings = bookings;
   }
   
   

}
