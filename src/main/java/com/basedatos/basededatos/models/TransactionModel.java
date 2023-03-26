package com.basedatos.basededatos.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(schema = "transactions") // Trasacciones
public class TransactionModel {
    @Id
    @Column(name = "id",updatable = false, nullable = false,  unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "amount", nullable = false)
    private String amount;

    // @Column(name = "date", nullable = false)
    // private String date;
    @Temporal(TemporalType.DATE)
    @Column(name = "date", nullable = false)
    private Date date;

    @PrePersist
    protected void onCreate() {
        date = new Date();
    }

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private PropertyModel property;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private LessorsModel lessor;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private TenantsModel tenant;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public PropertyModel getProperty() {
        return property;
    }

    public void setProperty(PropertyModel property) {
        this.property = property;
    }

    public LessorsModel getLessor() {
        return lessor;
    }

    public void setLessor(LessorsModel lessor) {
        this.lessor = lessor;
    }

    public TenantsModel getTenant() {
        return tenant;
    }

    public void setTenant(TenantsModel tenant) {
        this.tenant = tenant;
    }
}
