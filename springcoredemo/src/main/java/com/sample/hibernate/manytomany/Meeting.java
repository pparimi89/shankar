package com.sample.hibernate.manytomany;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="meeting")
public class Meeting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="mid")
    private Integer mid;

    @Column(name="mdate")
    private String mDate;

    @ManyToMany(targetEntity = Emp.class,cascade = CascadeType.ALL)
    @JoinTable(name="emp_meeting", joinColumns = @JoinColumn(name="emp_id"),
                inverseJoinColumns = @JoinColumn(name="meet_id"))
    private List<Emp> empls;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getmDate() {
        return mDate;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }

    public List<Emp> getEmpls() {
        return empls;
    }

    public void setEmpls(List<Emp> empls) {
        this.empls = empls;
    }
}
