
package com.sguit.trainingapp1.rest.data.login;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ProfileData {

    @SerializedName("status")
    @Expose
    private Boolean status;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("user")
    @Expose
    private User user;
    @SerializedName("access_token")
    @Expose
    private String accessToken;
    @SerializedName("companiesOwned")
    @Expose
    private List<CompanyAssigned> companiesOwned = null;
    @SerializedName("companyAssigned")
    @Expose
    private List<CompanyAssigned> companyAssigned = null;
    @SerializedName("androidCompanies")
    @Expose
    private List<AndroidCompany> androidCompanies = null;
    @SerializedName("administration")
    @Expose
    private Boolean administration;
    @SerializedName("client")
    @Expose
    private Boolean client;
    @SerializedName("client_can_req")
    @Expose
    private Boolean clientCanReq;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public List<CompanyAssigned> getCompaniesOwned() {
        return companiesOwned;
    }

    public void setCompaniesOwned(List<CompanyAssigned> companiesOwned) {
        this.companiesOwned = companiesOwned;
    }

    public List<CompanyAssigned> getCompanyAssigned() {
        return companyAssigned;
    }

    public void setCompanyAssigned(List<CompanyAssigned> companyAssigned) {
        this.companyAssigned = companyAssigned;
    }

    public List<AndroidCompany> getAndroidCompanies() {
        return androidCompanies;
    }

    public void setAndroidCompanies(List<AndroidCompany> androidCompanies) {
        this.androidCompanies = androidCompanies;
    }

    public Boolean getAdministration() {
        return administration;
    }

    public void setAdministration(Boolean administration) {
        this.administration = administration;
    }

    public Boolean getClient() {
        return client;
    }

    public void setClient(Boolean client) {
        this.client = client;
    }

    public Boolean getClientCanReq() {
        return clientCanReq;
    }

    public void setClientCanReq(Boolean clientCanReq) {
        this.clientCanReq = clientCanReq;
    }

}
