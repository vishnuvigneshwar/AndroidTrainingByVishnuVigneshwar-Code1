
package com.sguit.trainingapp1.rest.data.login;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Parking {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("company_id")
    @Expose
    private Integer companyId;
    @SerializedName("parking_title")
    @Expose
    private String parkingTitle;
    @SerializedName("total_area")
    @Expose
    private Object totalArea;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("parking_lat")
    @Expose
    private String parkingLat;
    @SerializedName("parking_lon")
    @Expose
    private String parkingLon;
    @SerializedName("is_active")
    @Expose
    private Integer isActive;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("parking_vehicle_types")
    @Expose
    private List<ParkingVehicleType> parkingVehicleTypes = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getParkingTitle() {
        return parkingTitle;
    }

    public void setParkingTitle(String parkingTitle) {
        this.parkingTitle = parkingTitle;
    }

    public Object getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(Object totalArea) {
        this.totalArea = totalArea;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getParkingLat() {
        return parkingLat;
    }

    public void setParkingLat(String parkingLat) {
        this.parkingLat = parkingLat;
    }

    public String getParkingLon() {
        return parkingLon;
    }

    public void setParkingLon(String parkingLon) {
        this.parkingLon = parkingLon;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public List<ParkingVehicleType> getParkingVehicleTypes() {
        return parkingVehicleTypes;
    }

    public void setParkingVehicleTypes(List<ParkingVehicleType> parkingVehicleTypes) {
        this.parkingVehicleTypes = parkingVehicleTypes;
    }

}
