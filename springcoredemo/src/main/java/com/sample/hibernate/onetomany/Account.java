package com.sample.hibernate.onetomany;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="aid")
    private Integer aid;

    @Column(name="acct_name")
    private String accountName;

    @Column(name="acct_code")
    private String accountCode;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="account_id")
    private List<Customer> customers;


    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
