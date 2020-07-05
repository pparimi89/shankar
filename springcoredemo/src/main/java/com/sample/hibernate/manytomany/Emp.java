package com.sample.hibernate.manytomany;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="emp")
public class Emp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="eid")
    private Integer eid;

    @Column(name="name")
    private String name;

    @Column(name="edept")
    private String edept;

    @ManyToMany(mappedBy = "empls", cascade = CascadeType.ALL)
    private List<Meeting> meetings;

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEdept() {
        return edept;
    }

    public void setEdept(String edept) {
        this.edept = edept;
    }

    public List<Meeting> getMeetings() {
        return meetings;
    }

    public void setMeetings(List<Meeting> meetings) {
        this.meetings = meetings;
    }
}
