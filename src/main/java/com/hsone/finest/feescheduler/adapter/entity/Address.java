package com.hsone.finest.feescheduler.adapter.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Address")
public class Address {
    @Id
    @Column(name="AddressID", nullable = false, updatable = false)
    private Long addressId;
    @Column(name="Address1")
    private String address1;
    @Column(name="Address2")
    private String address2;
    @Column(name="City")
    private String city;
    @Column(name="State")
    private String state;
    @Column(name="PostalCode")
    private String postalCode;

    public Address(final Long addressId, final String address1, final String address2, final String city,
                   final String state, final String postalCode) {
        this.addressId = addressId;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
    }

    public Address() {

    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(final String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(final String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(final String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(final String postalCode) {
        this.postalCode = postalCode;
    }
}
