
package com.sguit.trainingapp1.rest.data.login;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CompanyAssigned {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("company_id")
    @Expose
    private Integer companyId;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("designation")
    @Expose
    private String designation;
    @SerializedName("is_active")
    @Expose
    private Integer isActive;
    @SerializedName("can_access_android")
    @Expose
    private Integer canAccessAndroid;
    @SerializedName("can_access_web_admin")
    @Expose
    private Integer canAccessWebAdmin;
    @SerializedName("can_access_web_user")
    @Expose
    private Integer canAccessWebUser;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("company")
    @Expose
    private Company company;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public Integer getCanAccessAndroid() {
        return canAccessAndroid;
    }

    public void setCanAccessAndroid(Integer canAccessAndroid) {
        this.canAccessAndroid = canAccessAndroid;
    }

    public Integer getCanAccessWebAdmin() {
        return canAccessWebAdmin;
    }

    public void setCanAccessWebAdmin(Integer canAccessWebAdmin) {
        this.canAccessWebAdmin = canAccessWebAdmin;
    }

    public Integer getCanAccessWebUser() {
        return canAccessWebUser;
    }

    public void setCanAccessWebUser(Integer canAccessWebUser) {
        this.canAccessWebUser = canAccessWebUser;
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

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

}
