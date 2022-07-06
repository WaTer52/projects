package com.softcup.controller;

import java.io.Serializable;
import java.util.List;

public class Request implements Serializable {
    private String oneWayOrMultiWay;
    private List<String> departure;
    private List<String> arrival;
    private String departureDate;
    private List<String> proxies;
    private Integer needs;
    private Integer requestNum;

    @Override
    public String toString() {
        return "Request{" +
                "oneWayOrMultiWay='" + oneWayOrMultiWay + '\'' +
                ", departure=" + departure +
                ", arrival=" + arrival +
                ", departureDate='" + departureDate + '\'' +
                ", proxies=" + proxies +
                ", needs=" + needs +
                ", requestNum=" + requestNum +
                '}';
    }
    public String getOneWayOrMultiWay() {
        return oneWayOrMultiWay;
    }

    public void setOneWayOrMultiWay(String oneWayOrMultiWay) {
        this.oneWayOrMultiWay = oneWayOrMultiWay;
    }

    public List<String> getDeparture() {
        return departure;
    }

    public void setDeparture(List<String> departure) {
        this.departure = departure;
    }

    public List<String> getArrival() {
        return arrival;
    }

    public void setArrival(List<String> arrival) {
        this.arrival = arrival;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public List<String> getProxies() {
        return proxies;
    }

    public void setProxies(List<String> proxies) {
        this.proxies = proxies;
    }

    public Integer getNeeds() {
        return needs;
    }

    public void setNeeds(Integer needs) {
        this.needs = needs;
    }

    public Integer getRequestNum() {
        return requestNum;
    }

    public void setRequestNum(Integer requestNum) {
        this.requestNum = requestNum;
    }
}
