package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue
    private Long portfolioId;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    private String portfolioName;

    @OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL)
    private List<Security> securities;

    protected Portfolio() {
        // Required by JPA
    }

    public Portfolio(Client client, String portfolioName) {
        this.client = client;
        this.portfolioName = portfolioName;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getPortfolioName() {
        return portfolioName;
    }

    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    public List<Security> getSecurities() {
        return securities;
    }

    public void setSecurities(List<Security> securities) {
        this.securities = securities;
    }
}
