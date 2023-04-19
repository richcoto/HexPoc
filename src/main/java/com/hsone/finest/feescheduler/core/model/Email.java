package com.hsone.finest.feescheduler.core.model;

public class Email {
    private String address;
    private Organization organization;

    public Email(String address, Organization organization) {
        this.address = address;
        this.organization = organization;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(final Organization organization) {
        this.organization = organization;
    }
}
