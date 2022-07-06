package com.softcup.domain;

import org.springframework.stereotype.Component;

import java.math.BigInteger;

@Component
public class CommonDomain {
    private Integer sequenceNo;         //'主键',
    private String carrier;             //'航班承运人',
    private String flightNo;            //'航班号',
    private String cabin;               //'舱位',
    private Integer amount;             //'票价',
    private String departure;           //'起飞城市',
    private String arrival;             //'到达城市',
    private BigInteger departureDate;  //'起飞日期',
    private Integer departureTime;  //'起飞时间',
    private String duration;            //'路程时间',
    private Integer surcharge;          //'额外费用百分比',
    private String nextCarrier;         //'后序衔接航空公司',
    private String seatNum;             //'舱位余座',

    @Override
    public String toString() {
        return "CommonDomain{" +
                "sequenceNo=" + sequenceNo +
                ", carrier='" + carrier + '\'' +
                ", flightNo='" + flightNo + '\'' +
                ", cabin='" + cabin + '\'' +
                ", amount=" + amount +
                ", departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                ", departureDate=" + departureDate +
                ", departureTime=" + departureTime +
                ", duration='" + duration + '\'' +
                ", surcharge=" + surcharge +
                ", nextCarrier='" + nextCarrier + '\'' +
                ", seatNum='" + seatNum + '\'' +
                '}';
    }

    public Integer getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(Integer sequenceNo) {
        this.sequenceNo = sequenceNo;
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

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public BigInteger getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(BigInteger departureDate) {
        this.departureDate = departureDate;
    }

    public Integer getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Integer departureTime) {
        this.departureTime = departureTime;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Integer getSurcharge() {
        return surcharge;
    }

    public void setSurcharge(Integer surcharge) {
        this.surcharge = surcharge;
    }

    public String getNextCarrier() {
        return nextCarrier;
    }

    public void setNextCarrier(String nextCarrier) {
        this.nextCarrier = nextCarrier;
    }

    public String getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(String seatNum) {
        this.seatNum = seatNum;
    }
}

