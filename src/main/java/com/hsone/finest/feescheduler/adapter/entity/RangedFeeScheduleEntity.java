package com.hsone.finest.feescheduler.adapter.entity;

import java.util.Date;

public class RangedFeeScheduleEntity {
    private Date startDate;
    private Date endDate;
    private OrganizationEntity organization;
    private FeeScheduleEntity feeSchedule;
    private Integer rangedFeeScheduleVersion;

    public RangedFeeScheduleEntity(final Date startDate, final Date endDate, final OrganizationEntity organization,
                                   final FeeScheduleEntity feeSchedule, final Integer rangedFeeScheduleVersion) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.organization = organization;
        this.feeSchedule = feeSchedule;
        this.rangedFeeScheduleVersion = rangedFeeScheduleVersion;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(final Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(final Date endDate) {
        this.endDate = endDate;
    }

    public OrganizationEntity getOrganization() {
        return organization;
    }

    public void setOrganization(final OrganizationEntity organization) {
        this.organization = organization;
    }

    public FeeScheduleEntity getFeeSchedule() {
        return feeSchedule;
    }

    public void setFeeSchedule(final FeeScheduleEntity feeSchedule) {
        this.feeSchedule = feeSchedule;
    }

    public Integer getRangedFeeScheduleVersion() {
        return rangedFeeScheduleVersion;
    }

    public void setRangedFeeScheduleVersion(final Integer rangedFeeScheduleVersion) {
        this.rangedFeeScheduleVersion = rangedFeeScheduleVersion;
    }
}
