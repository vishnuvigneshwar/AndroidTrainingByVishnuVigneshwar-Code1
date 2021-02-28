
package com.sguit.trainingapp1.rest.data.login;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ParkingVehicleType {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("company_id")
    @Expose
    private Integer companyId;
    @SerializedName("parking_id")
    @Expose
    private Integer parkingId;
    @SerializedName("vehicle_type")
    @Expose
    private String vehicleType = "";
    @SerializedName("slots_allocated")
    @Expose
    private Integer slotsAllocated;
    @SerializedName("max_slots_allowed")
    @Expose
    private Integer maxSlotsAllowed;
    @SerializedName("perslot_area")
    @Expose
    private String perslotArea;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("min_capacity")
    @Expose
    private String minCapacity;
    @SerializedName("max_capacity")
    @Expose
    private String maxCapacity;
    @SerializedName("parking_cost")
    @Expose
    private String parkingCost;
    @SerializedName("parking_cost_currency")
    @Expose
    private String parkingCostCurrency;
    @SerializedName("parking_cost_duration")
    @Expose
    private String parkingCostDuration;
    @SerializedName("is_fixed_cost")
    @Expose
    private Integer isFixedCost;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;

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

    public Integer getParkingId() {
        return parkingId;
    }

    public void setParkingId(Integer parkingId) {
        this.parkingId = parkingId;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Integer getSlotsAllocated() {
        return slotsAllocated;
    }

    public void setSlotsAllocated(Integer slotsAllocated) {
        this.slotsAllocated = slotsAllocated;
    }

    public Integer getMaxSlotsAllowed() {
        return maxSlotsAllowed;
    }

    public void setMaxSlotsAllowed(Integer maxSlotsAllowed) {
        this.maxSlotsAllowed = maxSlotsAllowed;
    }

    public String getPerslotArea() {
        return perslotArea;
    }

    public void setPerslotArea(String perslotArea) {
        this.perslotArea = perslotArea;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMinCapacity() {
        return minCapacity;
    }

    public void setMinCapacity(String minCapacity) {
        this.minCapacity = minCapacity;
    }

    public String getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(String maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public String getParkingCost() {
        return parkingCost;
    }

    public void setParkingCost(String parkingCost) {
        this.parkingCost = parkingCost;
    }

    public String getParkingCostCurrency() {
        return parkingCostCurrency;
    }

    public void setParkingCostCurrency(String parkingCostCurrency) {
        this.parkingCostCurrency = parkingCostCurrency;
    }

    public String getParkingCostDuration() {
        return parkingCostDuration;
    }

    public void setParkingCostDuration(String parkingCostDuration) {
        this.parkingCostDuration = parkingCostDuration;
    }

    public Integer getIsFixedCost() {
        return isFixedCost;
    }

    public void setIsFixedCost(Integer isFixedCost) {
        this.isFixedCost = isFixedCost;
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

}
