package hibernate.bean;
// Generated 7 Oct, 2014 5:35:30 PM by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * DeviceLocation generated by hbm2java
 */
public class DeviceLocation  extends BaseBean {


     private Integer deviceLocationId;
     private Date timestamp;
     private DeviceDetails deviceDetails;
     private String longitude;
     private String latitude;

    public DeviceLocation() {
    }

    public DeviceLocation(DeviceDetails deviceDetails, String longitude, String latitude) {
       this.deviceDetails = deviceDetails;
       this.longitude = longitude;
       this.latitude = latitude;
    }
   
    public Integer getDeviceLocationId() {
        return this.deviceLocationId;
    }
    
    public void setDeviceLocationId(Integer deviceLocationId) {
        this.deviceLocationId = deviceLocationId;
    }
    public Date getTimestamp() {
        return this.timestamp;
    }
    
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
    public DeviceDetails getDeviceDetails() {
        return this.deviceDetails;
    }
    
    public void setDeviceDetails(DeviceDetails deviceDetails) {
        this.deviceDetails = deviceDetails;
    }
    public String getLongitude() {
        return this.longitude;
    }
    
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
    public String getLatitude() {
        return this.latitude;
    }
    
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

	@Override
	public boolean validateBean(StringBuffer messageOfValidation) {
		// TODO Auto-generated method stub
		return false;
	}




}


