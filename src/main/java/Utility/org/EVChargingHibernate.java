package Utility.org;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Application.org.Booking;
import Application.org.ChargingSession;
import Application.org.ChargingStation;
import Application.org.Customer;
import Application.org.Vechicle;

public class EVChargingHibernate {
	public static void main(String[] args) {
		
		
		Configuration con=new Configuration();
		con.configure()
		.addAnnotatedClass(Booking.class)
		.addAnnotatedClass(ChargingSession.class)
		.addAnnotatedClass(ChargingStation.class)
		.addAnnotatedClass(Customer.class)
		.addAnnotatedClass( Vechicle.class);
		
		SessionFactory sf =con.buildSessionFactory();
		 Session s= sf.openSession();
		Transaction t =s.beginTransaction();
		
		
	}
}
