package com.sample.hibernate.onetoone;

import javax.persistence.*;

@Entity
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="eid")
    private Integer eid;

    @Column(name="ename")
    private String ename;

    @Column(name="esal")
    private Integer esal;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "addr_id")
    private Address address;

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getEsal() {
        return esal;
    }

    public void setEsal(Integer esal) {
        this.esal = esal;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", esal=" + esal +
                ", address=" + address +
                '}';
    }
}
