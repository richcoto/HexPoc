package com.hsone.finest.feescheduler.adapter.entity;

public class EmailEntity {
    private String address;
    private OrganizationEntity organization;

    public EmailEntity(String address, OrganizationEntity organization) {
        this.address = address;
        this.organization = organization;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    public OrganizationEntity getOrganization() {
        return organization;
    }

    public void setOrganization(final OrganizationEntity organization) {
        this.organization = organization;
    }
}
