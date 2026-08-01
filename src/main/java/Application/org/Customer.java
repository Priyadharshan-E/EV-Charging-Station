package Application.org;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Customer_ID")
	private int CustomerID;
	
	@Column(name="Customer_Name",nullable=false)
	private String customerName;
	@Column(nullable=false,unique = true)
	private String emailID;
	
	@Column(nullable=false,unique = true)
	private String phone;
	
	@OneToMany(mappedBy ="Customer")
	private List<Booking>bookings;
	
public List<Booking> getBookings() {
		return bookings;
	}
	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}
	
       public Customer(String CustomerName,String emailID,String Phone) {
		this.customerName=CustomerName;
		this.emailID=emailID;
		this.phone=Phone;
}
	   public int getCustomerID() {
		   return CustomerID;
	   }
	   public String getCustomerName() {
		   return customerName;
	   }
	   public void setCustomerName(String customerName) {
		   this.customerName = customerName;
	   }
	   
	   public String getEmailID() {
		   return emailID;
	   }
	   public void setEmailID(String emailID) {
		   this.emailID = emailID;
	   }
	   public String getPhone() {
		   return phone;
	   }
	   public void setPhone(String phone) {
		   this.phone = phone;
	   }
       

}
