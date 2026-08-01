package Application.org;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
@Entity
public class Vechicle {
	
	@OneToMany(mappedBy="Customer")
	public List<Vechicle>Vechicles;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Vechicle_ID")
    private int VechicleID;
	
	@Column(name="Vechicle_Number",unique = true,nullable = false)
	private String VechicleNumber;
	
	@Column(name="Vechile_Model",nullable=false)
	private String VechicleModel;
	
	@Column(name="Battery_Capacity",nullable=false)
	private int BatteryCapacity;
	
	@ManyToOne
	@Column(name="Customer_ID")
	private Customer Cust;
	
	
	public Vechicle() {
		
	}
	public Vechicle( String VechicleNumber,String VechicleModel,int BatteryCapacity){
		this.VechicleNumber = VechicleNumber;
		this.VechicleModel = VechicleModel;
		this.BatteryCapacity = BatteryCapacity;
		
	}
	
	public List<Vechicle> getVechicles() {
		return Vechicles;
	}

	public void setVechicles(List<Vechicle> vechicles) {
		Vechicles = vechicles;
	}
	

	public int getVechicleID() {
		return VechicleID;
	}

	public void setVechicleID(int vechicleID) {
		VechicleID = vechicleID;
	}

	public String getVechicleNumber() {
		return VechicleNumber;
	}

	public void setVechicleNumber(String vechicleNumber) {
		VechicleNumber = vechicleNumber;
	}

	public String getVechicleModel() {
		return VechicleModel;
	}

	public void setVechicleModel(String vechicleModel) {
		VechicleModel = vechicleModel;
	}

	public int getBatteryCapacity() {
		return BatteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		BatteryCapacity = batteryCapacity;
	}

	


}
