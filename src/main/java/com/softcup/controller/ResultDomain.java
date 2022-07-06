package com.softcup.controller;


public class ResultDomain {
    private String carrier;
    private String flightNo;
    private String cabin;
    private String departureTime;
    private String arrivalDateTime;
    private Integer amount;

    @Override
    public String toString() {
        return "ResultDomain{" +
                "carrier='" + carrier + '\'' +
                ", flightNo='" + flightNo + '\'' +
                ", cabin='" + cabin + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", arrivalDateTime='" + arrivalDateTime + '\'' +
                ", amount=" + amount +
                '}';
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getCabin() {
        return cabin;
    }

    public void setCabin(String cabin) {
        this.cabin = cabin;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
