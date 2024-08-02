package org.example.spring_hw;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.Instant;

@Entity
public class Subscriber {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String subscName;
    private String subscSurname;
    private String msisdn;
    private int tariffId;
    private long startDate = Instant.now().getEpochSecond();

    protected Subscriber() {}

    public Subscriber(String subscName, String subscSurname, String msisdn, int tariffId) {
        this.subscName = subscName;
        this.subscSurname = subscSurname;
        this.msisdn = msisdn;
        this.tariffId = tariffId;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "id=" + id +
                ", subscName='" + subscName + '\'' +
                ", subscSurname='" + subscSurname + '\'' +
                ", msisdn='" + msisdn + '\'' +
                ", tariffId=" + tariffId +
                ", startDate=" + startDate +
                '}';
    }

    public String getSubscName() {
        return subscName;
    }

    public String getSubscSurname() {
        return subscSurname;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public int getTariffId() {
        return tariffId;
    }

    public long getStartDate() {
        return startDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setSubscName(String subscName) {
        this.subscName = subscName;
    }

    public void setSubscSurname(String subscSurname) {
        this.subscSurname = subscSurname;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public void setTariffId(int tariffId) {
        this.tariffId = tariffId;
    }

    public void setStartDate(long startDate) {
        this.startDate = startDate;
    }
}
