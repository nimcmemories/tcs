package hibernate.bean;
// Generated 7 Oct, 2014 5:35:30 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * CustomerRegistration generated by hbm2java
 */
public class CustomerRegistration  extends BaseBean {


     private Integer customerRegistrationId;
     private String firstName;
     private String lastName;
     private String email;
     private String mobileNo;
     private String password;
     private Set busTransactions = new HashSet(0);
     private Set airportTransactions = new HashSet(0);
     private Set ptopTransactions = new HashSet(0);
     private Set caronrentTransactions = new HashSet(0);
     private Set outstationTransactions = new HashSet(0);
     private Set partnerRatingDetailses = new HashSet(0);
     private Set moversTransactions = new HashSet(0);
     private Set customerLoginDetailses = new HashSet(0);
     private Set bikeTransactions = new HashSet(0);
     private Set shippingTransactions = new HashSet(0);

    public CustomerRegistration() {
    }

	
    public CustomerRegistration(String firstName, String lastName, String email, String mobileNo, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobileNo = mobileNo;
        this.password = password;
    }
    public CustomerRegistration(String firstName, String lastName, String email, String mobileNo, String password, Set busTransactions, Set airportTransactions, Set ptopTransactions, Set caronrentTransactions, Set outstationTransactions, Set partnerRatingDetailses, Set moversTransactions, Set customerLoginDetailses, Set bikeTransactions, Set shippingTransactions) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.email = email;
       this.mobileNo = mobileNo;
       this.password = password;
       this.busTransactions = busTransactions;
       this.airportTransactions = airportTransactions;
       this.ptopTransactions = ptopTransactions;
       this.caronrentTransactions = caronrentTransactions;
       this.outstationTransactions = outstationTransactions;
       this.partnerRatingDetailses = partnerRatingDetailses;
       this.moversTransactions = moversTransactions;
       this.customerLoginDetailses = customerLoginDetailses;
       this.bikeTransactions = bikeTransactions;
       this.shippingTransactions = shippingTransactions;
    }
   
    public Integer getCustomerRegistrationId() {
        return this.customerRegistrationId;
    }
    
    public void setCustomerRegistrationId(Integer customerRegistrationId) {
        this.customerRegistrationId = customerRegistrationId;
    }
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getMobileNo() {
        return this.mobileNo;
    }
    
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public Set getBusTransactions() {
        return this.busTransactions;
    }
    
    public void setBusTransactions(Set busTransactions) {
        this.busTransactions = busTransactions;
    }
    public Set getAirportTransactions() {
        return this.airportTransactions;
    }
    
    public void setAirportTransactions(Set airportTransactions) {
        this.airportTransactions = airportTransactions;
    }
    public Set getPtopTransactions() {
        return this.ptopTransactions;
    }
    
    public void setPtopTransactions(Set ptopTransactions) {
        this.ptopTransactions = ptopTransactions;
    }
    public Set getCaronrentTransactions() {
        return this.caronrentTransactions;
    }
    
    public void setCaronrentTransactions(Set caronrentTransactions) {
        this.caronrentTransactions = caronrentTransactions;
    }
    public Set getOutstationTransactions() {
        return this.outstationTransactions;
    }
    
    public void setOutstationTransactions(Set outstationTransactions) {
        this.outstationTransactions = outstationTransactions;
    }
    public Set getPartnerRatingDetailses() {
        return this.partnerRatingDetailses;
    }
    
    public void setPartnerRatingDetailses(Set partnerRatingDetailses) {
        this.partnerRatingDetailses = partnerRatingDetailses;
    }
    public Set getMoversTransactions() {
        return this.moversTransactions;
    }
    
    public void setMoversTransactions(Set moversTransactions) {
        this.moversTransactions = moversTransactions;
    }
    public Set getCustomerLoginDetailses() {
        return this.customerLoginDetailses;
    }
    
    public void setCustomerLoginDetailses(Set customerLoginDetailses) {
        this.customerLoginDetailses = customerLoginDetailses;
    }
    public Set getBikeTransactions() {
        return this.bikeTransactions;
    }
    
    public void setBikeTransactions(Set bikeTransactions) {
        this.bikeTransactions = bikeTransactions;
    }
    public Set getShippingTransactions() {
        return this.shippingTransactions;
    }
    
    public void setShippingTransactions(Set shippingTransactions) {
        this.shippingTransactions = shippingTransactions;
    }


	@Override
	public boolean validateBean(StringBuffer messageOfValidation) {
		// TODO Auto-generated method stub
		return false;
	}




}


