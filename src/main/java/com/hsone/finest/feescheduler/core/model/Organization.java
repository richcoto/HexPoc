package com.hsone.finest.feescheduler.core.model;

import java.util.Date;
import java.util.TimeZone;

public class Organization {
    private String name;
    private PMSoftwareType softwareType;
    private String customer;
    private String alias;
    private Address address;
    private Phone phone;
    private Email email;
    private TimeZone timezone;
    private Boolean showLineItem;
    private String organizationGUID;
    private PracticeCustomization customization;
    private String baseUrl;
    private boolean allowAutoClaimSubmission;
    private Date autoClaimSubmissionHour;
    private boolean tamiEnabled;
    private boolean isTestingOrganization;
    private boolean isEnabled;
    private Integer licenseCount;
    private boolean licenseNotificationEnabled;
    private String orgMapperId;
    private Boolean electronicPrescriptionEnabled;

    public Organization(final String name, final PMSoftwareType softwareType, final String customer,
                        final String alias, final Address address, final Phone phone, final Email email,
                        final TimeZone timezone, final Boolean showLineItem, final String organizationGUID,
                        final PracticeCustomization customization, final String baseUrl,
                        final boolean allowAutoClaimSubmission, final Date autoClaimSubmissionHour,
                        final boolean tamiEnabled, final boolean isTestingOrganization, final boolean isEnabled,
                        final Integer licenseCount, final boolean licenseNotificationEnabled,
                        final String orgMapperId, final Boolean electronicPrescriptionEnabled) {
        this.name = name;
        this.softwareType = softwareType;
        this.customer = customer;
        this.alias = alias;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.timezone = timezone;
        this.showLineItem = showLineItem;
        this.organizationGUID = organizationGUID;
        this.customization = customization;
        this.baseUrl = baseUrl;
        this.allowAutoClaimSubmission = allowAutoClaimSubmission;
        this.autoClaimSubmissionHour = autoClaimSubmissionHour;
        this.tamiEnabled = tamiEnabled;
        this.isTestingOrganization = isTestingOrganization;
        this.isEnabled = isEnabled;
        this.licenseCount = licenseCount;
        this.licenseNotificationEnabled = licenseNotificationEnabled;
        this.orgMapperId = orgMapperId;
        this.electronicPrescriptionEnabled = electronicPrescriptionEnabled;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public PMSoftwareType getSoftwareType() {
        return softwareType;
    }

    public void setSoftwareType(final PMSoftwareType softwareType) {
        this.softwareType = softwareType;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(final String customer) {
        this.customer = customer;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(final String alias) {
        this.alias = alias;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(final Address address) {
        this.address = address;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(final Phone phone) {
        this.phone = phone;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(final Email email) {
        this.email = email;
    }

    public TimeZone getTimezone() {
        return timezone;
    }

    public void setTimezone(final TimeZone timezone) {
        this.timezone = timezone;
    }

    public Boolean getShowLineItem() {
        return showLineItem;
    }

    public void setShowLineItem(final Boolean showLineItem) {
        this.showLineItem = showLineItem;
    }

    public String getOrganizationGUID() {
        return organizationGUID;
    }

    public void setOrganizationGUID(final String organizationGUID) {
        this.organizationGUID = organizationGUID;
    }

    public PracticeCustomization getCustomization() {
        return customization;
    }

    public void setCustomization(final PracticeCustomization customization) {
        this.customization = customization;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(final String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public boolean isAllowAutoClaimSubmission() {
        return allowAutoClaimSubmission;
    }

    public void setAllowAutoClaimSubmission(final boolean allowAutoClaimSubmission) {
        this.allowAutoClaimSubmission = allowAutoClaimSubmission;
    }

    public Date getAutoClaimSubmissionHour() {
        return autoClaimSubmissionHour;
    }

    public void setAutoClaimSubmissionHour(final Date autoClaimSubmissionHour) {
        this.autoClaimSubmissionHour = autoClaimSubmissionHour;
    }

    public boolean isTamiEnabled() {
        return tamiEnabled;
    }

    public void setTamiEnabled(final boolean tamiEnabled) {
        this.tamiEnabled = tamiEnabled;
    }

    public boolean isTestingOrganization() {
        return isTestingOrganization;
    }

    public void setTestingOrganization(final boolean testingOrganization) {
        isTestingOrganization = testingOrganization;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(final boolean enabled) {
        isEnabled = enabled;
    }

    public Integer getLicenseCount() {
        return licenseCount;
    }

    public void setLicenseCount(final Integer licenseCount) {
        this.licenseCount = licenseCount;
    }

    public boolean isLicenseNotificationEnabled() {
        return licenseNotificationEnabled;
    }

    public void setLicenseNotificationEnabled(final boolean licenseNotificationEnabled) {
        this.licenseNotificationEnabled = licenseNotificationEnabled;
    }

    public String getOrgMapperId() {
        return orgMapperId;
    }

    public void setOrgMapperId(final String orgMapperId) {
        this.orgMapperId = orgMapperId;
    }

    public Boolean getElectronicPrescriptionEnabled() {
        return electronicPrescriptionEnabled;
    }

    public void setElectronicPrescriptionEnabled(final Boolean electronicPrescriptionEnabled) {
        this.electronicPrescriptionEnabled = electronicPrescriptionEnabled;
    }
}
