package com.sample.hibernate.onetoone;

import javax.persistence.*;

@Entity
@Table(name="address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="aid")
    private Integer aid;

    @Column(name="city")
    private String city;

    @Column(name="state")
    private String state;

    @Column(name="begin_date")
    private String beginDate;

    @Column(name="end_date")
    private String endDate;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
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

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Address{" +
                "aid=" + aid +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", beginDate='" + beginDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
