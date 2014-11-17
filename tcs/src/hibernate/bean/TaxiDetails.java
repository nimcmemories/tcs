package hibernate.bean;
// Generated 7 Oct, 2014 5:35:30 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * TaxiDetails generated by hbm2java
 */
public class TaxiDetails  extends BaseBean {


     private Integer taxiDetailsId;
     private TaxiType taxiType;
     private PartnerDetails partnerDetails;
     private String taxiName;
     private String taxiNumber;
     private String note;
     private String imgPath;
     private boolean enableForTicket;
     private Set taxiTicketTransactions = new HashSet(0);
     private Set ptopTransactions = new HashSet(0);
     private Set outstationTransactions = new HashSet(0);
     private Set taxiAmenitieses = new HashSet(0);
     private Set taxiAvailabilities = new HashSet(0);
     private Set airportTransactions = new HashSet(0);
     private Set perDayRates = new HashSet(0);
     private Set perHourRates = new HashSet(0);
     private Set deviceDetailses = new HashSet(0);
     private Set caronrentTransactions = new HashSet(0);
     private Set perKmRates = new HashSet(0);

    public TaxiDetails() {
    }

	
    public TaxiDetails(TaxiType taxiType, PartnerDetails partnerDetails, String taxiName, String taxiNumber, boolean enableForTicket) {
        this.taxiType = taxiType;
        this.partnerDetails = partnerDetails;
        this.taxiName = taxiName;
        this.taxiNumber = taxiNumber;
        this.enableForTicket = enableForTicket;
    }
    public TaxiDetails(TaxiType taxiType, PartnerDetails partnerDetails, String taxiName, String taxiNumber, String note, String imgPath, boolean enableForTicket, Set taxiTicketTransactions, Set ptopTransactions, Set outstationTransactions, Set taxiAmenitieses, Set taxiAvailabilities, Set airportTransactions, Set perDayRates, Set perHourRates, Set deviceDetailses, Set caronrentTransactions, Set perKmRates) {
       this.taxiType = taxiType;
       this.partnerDetails = partnerDetails;
       this.taxiName = taxiName;
       this.taxiNumber = taxiNumber;
       this.note = note;
       this.imgPath = imgPath;
       this.enableForTicket = enableForTicket;
       this.taxiTicketTransactions = taxiTicketTransactions;
       this.ptopTransactions = ptopTransactions;
       this.outstationTransactions = outstationTransactions;
       this.taxiAmenitieses = taxiAmenitieses;
       this.taxiAvailabilities = taxiAvailabilities;
       this.airportTransactions = airportTransactions;
       this.perDayRates = perDayRates;
       this.perHourRates = perHourRates;
       this.deviceDetailses = deviceDetailses;
       this.caronrentTransactions = caronrentTransactions;
       this.perKmRates = perKmRates;
    }
   
    public Integer getTaxiDetailsId() {
        return this.taxiDetailsId;
    }
    
    public void setTaxiDetailsId(Integer taxiDetailsId) {
        this.taxiDetailsId = taxiDetailsId;
    }
    public TaxiType getTaxiType() {
        return this.taxiType;
    }
    
    public void setTaxiType(TaxiType taxiType) {
        this.taxiType = taxiType;
    }
    public PartnerDetails getPartnerDetails() {
        return this.partnerDetails;
    }
    
    public void setPartnerDetails(PartnerDetails partnerDetails) {
        this.partnerDetails = partnerDetails;
    }
    public String getTaxiName() {
        return this.taxiName;
    }
    
    public void setTaxiName(String taxiName) {
        this.taxiName = taxiName;
    }
    public String getTaxiNumber() {
        return this.taxiNumber;
    }
    
    public void setTaxiNumber(String taxiNumber) {
        this.taxiNumber = taxiNumber;
    }
    public String getNote() {
        return this.note;
    }
    
    public void setNote(String note) {
        this.note = note;
    }
    public String getImgPath() {
        return this.imgPath;
    }
    
    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }
    public boolean isEnableForTicket() {
        return this.enableForTicket;
    }
    
    public void setEnableForTicket(boolean enableForTicket) {
        this.enableForTicket = enableForTicket;
    }
    public Set getTaxiTicketTransactions() {
        return this.taxiTicketTransactions;
    }
    
    public void setTaxiTicketTransactions(Set taxiTicketTransactions) {
        this.taxiTicketTransactions = taxiTicketTransactions;
    }
    public Set getPtopTransactions() {
        return this.ptopTransactions;
    }
    
    public void setPtopTransactions(Set ptopTransactions) {
        this.ptopTransactions = ptopTransactions;
    }
    public Set getOutstationTransactions() {
        return this.outstationTransactions;
    }
    
    public void setOutstationTransactions(Set outstationTransactions) {
        this.outstationTransactions = outstationTransactions;
    }
    public Set getTaxiAmenitieses() {
        return this.taxiAmenitieses;
    }
    
    public void setTaxiAmenitieses(Set taxiAmenitieses) {
        this.taxiAmenitieses = taxiAmenitieses;
    }
    public Set getTaxiAvailabilities() {
        return this.taxiAvailabilities;
    }
    
    public void setTaxiAvailabilities(Set taxiAvailabilities) {
        this.taxiAvailabilities = taxiAvailabilities;
    }
    public Set getAirportTransactions() {
        return this.airportTransactions;
    }
    
    public void setAirportTransactions(Set airportTransactions) {
        this.airportTransactions = airportTransactions;
    }
    public Set getPerDayRates() {
        return this.perDayRates;
    }
    
    public void setPerDayRates(Set perDayRates) {
        this.perDayRates = perDayRates;
    }
    public Set getPerHourRates() {
        return this.perHourRates;
    }
    
    public void setPerHourRates(Set perHourRates) {
        this.perHourRates = perHourRates;
    }
    public Set getDeviceDetailses() {
        return this.deviceDetailses;
    }
    
    public void setDeviceDetailses(Set deviceDetailses) {
        this.deviceDetailses = deviceDetailses;
    }
    public Set getCaronrentTransactions() {
        return this.caronrentTransactions;
    }
    
    public void setCaronrentTransactions(Set caronrentTransactions) {
        this.caronrentTransactions = caronrentTransactions;
    }
    public Set getPerKmRates() {
        return this.perKmRates;
    }
    
    public void setPerKmRates(Set perKmRates) {
        this.perKmRates = perKmRates;
    }


	@Override
	public boolean validateBean(StringBuffer messageOfValidation) {
		// TODO Auto-generated method stub
		return false;
	}




}

