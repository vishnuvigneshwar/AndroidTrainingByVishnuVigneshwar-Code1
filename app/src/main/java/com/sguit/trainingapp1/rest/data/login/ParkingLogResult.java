package com.sguit.trainingapp1.rest.data.login;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ParkingLogResult {
    @SerializedName("status")
    @Expose
    private Boolean status;
    @SerializedName("message")
    @Expose
    private String message;
//    @SerializedName("data")
//    @Expose
//    private ParkingLog data;
//
//    @SerializedName("errore")
//    @Expose
//    private Object errore;

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

//    public ParkingLog getData() {
//        return data;
//    }
//
//    public void setData(ParkingLog data) {
//        this.data = data;
//    }
//
//    public Object getErrore() {
//        return errore;
//    }
//
//    public void setErrore(Object errore) {
//        this.errore = errore;
//    }
}
