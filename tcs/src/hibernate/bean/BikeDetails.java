package hibernate.bean;
// Generated 7 Oct, 2014 5:35:30 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * BikeDetails generated by hbm2java
 */
public class BikeDetails  extends BaseBean {


     private Integer bikeDetailsId;
     private PartnerDetails partnerDetails;
     private String bikeName;
     private String description;
     private double perHourRate;
     private double perDayRate;
     private double deposite;
     private String bikeImagePath;
     private Set bikeTransactions = new HashSet(0);

    public BikeDetails() {
    }

	
    public BikeDetails(PartnerDetails partnerDetails, String bikeName, String description, double perHourRate, double perDayRate, double deposite, String bikeImagePath) {
        this.partnerDetails = partnerDetails;
        this.bikeName = bikeName;
        this.description = description;
        this.perHourRate = perHourRate;
        this.perDayRate = perDayRate;
        this.deposite = deposite;
        this.bikeImagePath = bikeImagePath;
    }
    public BikeDetails(PartnerDetails partnerDetails, String bikeName, String description, double perHourRate, double perDayRate, double deposite, String bikeImagePath, Set bikeTransactions) {
       this.partnerDetails = partnerDetails;
       this.bikeName = bikeName;
       this.description = description;
       this.perHourRate = perHourRate;
       this.perDayRate = perDayRate;
       this.deposite = deposite;
       this.bikeImagePath = bikeImagePath;
       this.bikeTransactions = bikeTransactions;
    }
   
    public Integer getBikeDetailsId() {
        return this.bikeDetailsId;
    }
    
    public void setBikeDetailsId(Integer bikeDetailsId) {
        this.bikeDetailsId = bikeDetailsId;
    }
    public PartnerDetails getPartnerDetails() {
        return this.partnerDetails;
    }
    
    public void setPartnerDetails(PartnerDetails partnerDetails) {
        this.partnerDetails = partnerDetails;
    }
    public String getBikeName() {
        return this.bikeName;
    }
    
    public void setBikeName(String bikeName) {
        this.bikeName = bikeName;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public double getPerHourRate() {
        return this.perHourRate;
    }
    
    public void setPerHourRate(double perHourRate) {
        this.perHourRate = perHourRate;
    }
    public double getPerDayRate() {
        return this.perDayRate;
    }
    
    public void setPerDayRate(double perDayRate) {
        this.perDayRate = perDayRate;
    }
    public double getDeposite() {
        return this.deposite;
    }
    
    public void setDeposite(double deposite) {
        this.deposite = deposite;
    }
    public String getBikeImagePath() {
        return this.bikeImagePath;
    }
    
    public void setBikeImagePath(String bikeImagePath) {
        this.bikeImagePath = bikeImagePath;
    }
    public Set getBikeTransactions() {
        return this.bikeTransactions;
    }
    
    public void setBikeTransactions(Set bikeTransactions) {
        this.bikeTransactions = bikeTransactions;
    }


	@Override
	public boolean validateBean(StringBuffer messageOfValidation) {
		// TODO Auto-generated method stub
		return false;
	}




}


