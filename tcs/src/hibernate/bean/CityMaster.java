package hibernate.bean;
// Generated 7 Oct, 2014 5:35:30 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * CityMaster generated by hbm2java
 */
public class CityMaster  extends BaseBean {


     private Integer cityMasterId;
     private StateMaster stateMaster;
     private String cityName;
     private String latitude;
     private String longitute;
     private Set taxiTicketTransactionsForEndCityMasterId = new HashSet(0);
     private Set taxiTicketTransactionsForStartCityMasterId = new HashSet(0);
     private Set moversTransactionsForStartCityId = new HashSet(0);
     private Set moversTransactionsForEndCityId = new HashSet(0);
     private Set bikeTransactions = new HashSet(0);
     private Set shippingTransactionsForEndCityId = new HashSet(0);
     private Set shippingTransactionsForStartCityId = new HashSet(0);
     private Set busTransactionsForSouceCityId = new HashSet(0);
     private Set outstationTransactionsForEndCityMasterId = new HashSet(0);
     private Set outstationTransactionsForStartCityMasterId = new HashSet(0);
     private Set busTransactionsForDestinationCityId = new HashSet(0);
     private Set placeMasters = new HashSet(0);
     private Set areaMasters = new HashSet(0);

    public CityMaster() {
    }

	
    public CityMaster(StateMaster stateMaster, String cityName, String latitude, String longitute) {
        this.stateMaster = stateMaster;
        this.cityName = cityName;
        this.latitude = latitude;
        this.longitute = longitute;
    }
    public CityMaster(StateMaster stateMaster, String cityName, String latitude, String longitute, Set taxiTicketTransactionsForEndCityMasterId, Set taxiTicketTransactionsForStartCityMasterId, Set moversTransactionsForStartCityId, Set moversTransactionsForEndCityId, Set bikeTransactions, Set shippingTransactionsForEndCityId, Set shippingTransactionsForStartCityId, Set busTransactionsForSouceCityId, Set outstationTransactionsForEndCityMasterId, Set outstationTransactionsForStartCityMasterId, Set busTransactionsForDestinationCityId, Set placeMasters, Set areaMasters) {
       this.stateMaster = stateMaster;
       this.cityName = cityName;
       this.latitude = latitude;
       this.longitute = longitute;
       this.taxiTicketTransactionsForEndCityMasterId = taxiTicketTransactionsForEndCityMasterId;
       this.taxiTicketTransactionsForStartCityMasterId = taxiTicketTransactionsForStartCityMasterId;
       this.moversTransactionsForStartCityId = moversTransactionsForStartCityId;
       this.moversTransactionsForEndCityId = moversTransactionsForEndCityId;
       this.bikeTransactions = bikeTransactions;
       this.shippingTransactionsForEndCityId = shippingTransactionsForEndCityId;
       this.shippingTransactionsForStartCityId = shippingTransactionsForStartCityId;
       this.busTransactionsForSouceCityId = busTransactionsForSouceCityId;
       this.outstationTransactionsForEndCityMasterId = outstationTransactionsForEndCityMasterId;
       this.outstationTransactionsForStartCityMasterId = outstationTransactionsForStartCityMasterId;
       this.busTransactionsForDestinationCityId = busTransactionsForDestinationCityId;
       this.placeMasters = placeMasters;
       this.areaMasters = areaMasters;
    }
   
    public Integer getCityMasterId() {
        return this.cityMasterId;
    }
    
    public void setCityMasterId(Integer cityMasterId) {
        this.cityMasterId = cityMasterId;
    }
    public StateMaster getStateMaster() {
        return this.stateMaster;
    }
    
    public void setStateMaster(StateMaster stateMaster) {
        this.stateMaster = stateMaster;
    }
    public String getCityName() {
        return this.cityName;
    }
    
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    public String getLatitude() {
        return this.latitude;
    }
    
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
    public String getLongitute() {
        return this.longitute;
    }
    
    public void setLongitute(String longitute) {
        this.longitute = longitute;
    }
    public Set getTaxiTicketTransactionsForEndCityMasterId() {
        return this.taxiTicketTransactionsForEndCityMasterId;
    }
    
    public void setTaxiTicketTransactionsForEndCityMasterId(Set taxiTicketTransactionsForEndCityMasterId) {
        this.taxiTicketTransactionsForEndCityMasterId = taxiTicketTransactionsForEndCityMasterId;
    }
    public Set getTaxiTicketTransactionsForStartCityMasterId() {
        return this.taxiTicketTransactionsForStartCityMasterId;
    }
    
    public void setTaxiTicketTransactionsForStartCityMasterId(Set taxiTicketTransactionsForStartCityMasterId) {
        this.taxiTicketTransactionsForStartCityMasterId = taxiTicketTransactionsForStartCityMasterId;
    }
    public Set getMoversTransactionsForStartCityId() {
        return this.moversTransactionsForStartCityId;
    }
    
    public void setMoversTransactionsForStartCityId(Set moversTransactionsForStartCityId) {
        this.moversTransactionsForStartCityId = moversTransactionsForStartCityId;
    }
    public Set getMoversTransactionsForEndCityId() {
        return this.moversTransactionsForEndCityId;
    }
    
    public void setMoversTransactionsForEndCityId(Set moversTransactionsForEndCityId) {
        this.moversTransactionsForEndCityId = moversTransactionsForEndCityId;
    }
    public Set getBikeTransactions() {
        return this.bikeTransactions;
    }
    
    public void setBikeTransactions(Set bikeTransactions) {
        this.bikeTransactions = bikeTransactions;
    }
    public Set getShippingTransactionsForEndCityId() {
        return this.shippingTransactionsForEndCityId;
    }
    
    public void setShippingTransactionsForEndCityId(Set shippingTransactionsForEndCityId) {
        this.shippingTransactionsForEndCityId = shippingTransactionsForEndCityId;
    }
    public Set getShippingTransactionsForStartCityId() {
        return this.shippingTransactionsForStartCityId;
    }
    
    public void setShippingTransactionsForStartCityId(Set shippingTransactionsForStartCityId) {
        this.shippingTransactionsForStartCityId = shippingTransactionsForStartCityId;
    }
    public Set getBusTransactionsForSouceCityId() {
        return this.busTransactionsForSouceCityId;
    }
    
    public void setBusTransactionsForSouceCityId(Set busTransactionsForSouceCityId) {
        this.busTransactionsForSouceCityId = busTransactionsForSouceCityId;
    }
    public Set getOutstationTransactionsForEndCityMasterId() {
        return this.outstationTransactionsForEndCityMasterId;
    }
    
    public void setOutstationTransactionsForEndCityMasterId(Set outstationTransactionsForEndCityMasterId) {
        this.outstationTransactionsForEndCityMasterId = outstationTransactionsForEndCityMasterId;
    }
    public Set getOutstationTransactionsForStartCityMasterId() {
        return this.outstationTransactionsForStartCityMasterId;
    }
    
    public void setOutstationTransactionsForStartCityMasterId(Set outstationTransactionsForStartCityMasterId) {
        this.outstationTransactionsForStartCityMasterId = outstationTransactionsForStartCityMasterId;
    }
    public Set getBusTransactionsForDestinationCityId() {
        return this.busTransactionsForDestinationCityId;
    }
    
    public void setBusTransactionsForDestinationCityId(Set busTransactionsForDestinationCityId) {
        this.busTransactionsForDestinationCityId = busTransactionsForDestinationCityId;
    }
    public Set getPlaceMasters() {
        return this.placeMasters;
    }
    
    public void setPlaceMasters(Set placeMasters) {
        this.placeMasters = placeMasters;
    }
    public Set getAreaMasters() {
        return this.areaMasters;
    }
    
    public void setAreaMasters(Set areaMasters) {
        this.areaMasters = areaMasters;
    }


	@Override
	public boolean validateBean(StringBuffer messageOfValidation) {
		// TODO Auto-generated method stub
		return false;
	}




}

