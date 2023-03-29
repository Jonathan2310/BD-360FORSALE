package com.basedatos.basededatos.models;

import jakarta.persistence.*;

@Entity
@Table(schema = "property") // Inmuebles
public class PropertyModel {
    @Id
    @Column(name = "id",updatable = false, nullable = false,  unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "category", nullable = false)
    private String category;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "country", nullable = false)
    private String country;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "description", nullable = false)
    private String description;

    // Estado enajenadao ("alquilado")
    @Column(name = " alienated_status", nullable = false)
    private Boolean alienatedStatus;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "lessor_id", referencedColumnName = "id")
    private LessorsModel lessor;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "tenant_id", referencedColumnName = "id")
    private TenantsModel tenant;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Boolean getAlienatedStatus() {
        return alienatedStatus;
    }

    public void setAlienatedStatus(Boolean alienatedStatus) {
        this.alienatedStatus = alienatedStatus;
    }
}
