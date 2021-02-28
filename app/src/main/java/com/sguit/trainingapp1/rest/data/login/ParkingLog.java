package com.sguit.trainingapp1.rest.data.login;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ParkingLog {
    @SerializedName("request_type")
    @Expose
    private String requestType;
    @SerializedName("qr_code")
    @Expose
    private String qrCode;
    @SerializedName("company_id")
    @Expose
    private Integer companyId;
    @SerializedName("parking_id")
    @Expose
    private Integer parkingId;
    @SerializedName("parking_vehicle_type_id")
    @Expose
    private Integer parkingVehicleTypeId;
    @SerializedName("parking_vehicle_type")
    @Expose
    private String parkingVehicleType;
    @SerializedName("vehicle_number")
    @Expose
    private String vehicleNumber;
    @SerializedName("from_village")
    @Expose
    private String fromVillage;
    @SerializedName("from_city")
    @Expose
    private String fromCity;
    @SerializedName("from_state")
    @Expose
    private String fromState;
    @SerializedName("driver_contact_number")
    @Expose
    private String driverContactNumber;
    @SerializedName("driver_name")
    @Expose
    private String driverName;
    @SerializedName("incharge_name")
    @Expose
    private String inchargeName;
    @SerializedName("incharge_contact_number")
    @Expose
    private String inchargeContactNumber;
    @SerializedName("checkin_time")
    @Expose
    private String checkinTime;
    @SerializedName("checkout_time")
    @Expose
    private String checkoutTime;
    @SerializedName("checkin_by")
    @Expose
    private Integer checkinBy;
    @SerializedName("checkin_status")
    @Expose
    private Integer checkinStatus;
    @SerializedName("checkout_status")
    @Expose
    private Integer checkoutStatus;
    @SerializedName("is_active_inside")
    @Expose
    private Boolean isActiveInside;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("is_qr_scan")
    @Expose
    private Boolean is_qr_scan;

    @SerializedName("errore")
    @Expose
    private Object errore;


    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
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

    public Integer getParkingVehicleTypeId() {
        return parkingVehicleTypeId;
    }

    public void setParkingVehicleTypeId(Integer parkingVehicleTypeId) {
        this.parkingVehicleTypeId = parkingVehicleTypeId;
    }

    public String getParkingVehicleType() {
        return parkingVehicleType;
    }

    public void setParkingVehicleType(String parkingVehicleType) {
        this.parkingVehicleType = parkingVehicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getFromVillage() {
        return fromVillage;
    }

    public void setFromVillage(String fromVillage) {
        this.fromVillage = fromVillage;
    }

    public String getFromCity() {
        return fromCity;
    }

    public void setFromCity(String fromCity) {
        this.fromCity = fromCity;
    }

    public String getFromState() {
        return fromState;
    }

    public void setFromState(String fromState) {
        this.fromState = fromState;
    }

    public String getDriverContactNumber() {
        return driverContactNumber;
    }

    public void setDriverContactNumber(String driverContactNumber) {
        this.driverContactNumber = driverContactNumber;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getInchargeName() {
        return inchargeName;
    }

    public void setInchargeName(String inchargeName) {
        this.inchargeName = inchargeName;
    }

    public String getInchargeContactNumber() {
        return inchargeContactNumber;
    }

    public void setInchargeContactNumber(String inchargeContactNumber) {
        this.inchargeContactNumber = inchargeContactNumber;
    }

    public String getCheckinTime() {
        return checkinTime;
    }

    public void setCheckinTime(String checkinTime) {
        this.checkinTime = checkinTime;
    }

    public String getCheckoutTime() {
        return checkoutTime;
    }

    public void setCheckoutTime(String checkoutTime) {
        this.checkoutTime = checkoutTime;
    }

    public Integer getCheckinBy() {
        return checkinBy;
    }

    public void setCheckinBy(Integer checkinBy) {
        this.checkinBy = checkinBy;
    }

    public Integer getCheckinStatus() {
        return checkinStatus;
    }

    public void setCheckinStatus(Integer checkinStatus) {
        this.checkinStatus = checkinStatus;
    }

    public Integer getCheckoutStatus() {
        return checkoutStatus;
    }

    public void setCheckoutStatus(Integer checkoutStatus) {
        this.checkoutStatus = checkoutStatus;
    }

    public Boolean getIsActiveInside() {
        return isActiveInside;
    }

    public void setIsActiveInside(Boolean isActiveInside) {
        this.isActiveInside = isActiveInside;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getActiveInside() {
        return isActiveInside;
    }

    public void setActiveInside(Boolean activeInside) {
        isActiveInside = activeInside;
    }

    public Boolean getIs_qr_scan() {
        return is_qr_scan;
    }

    public void setIs_qr_scan(Boolean is_qr_scan) {
        this.is_qr_scan = is_qr_scan;
    }

}
