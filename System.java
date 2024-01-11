package com.wellsfargo.counselor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class System {

    @Id
    @GeneratedValue
    private Long systemId;

    private double uptime;

    private String dashboard;

    protected System() {
        // Required by JPA
    }

    public System(double uptime, String dashboard) {
        this.uptime = uptime;
        this.dashboard = dashboard;
    }

    public Long getSystemId() {
        return systemId;
    }

    public double getUptime() {
        return uptime;
    }

    public void setUptime(double uptime) {
        this.uptime = uptime;
    }

    public String getDashboard() {
        return dashboard;
    }

    public void setDashboard(String dashboard) {
        this.dashboard = dashboard;
    }
}
