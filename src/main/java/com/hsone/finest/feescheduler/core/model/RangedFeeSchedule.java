package com.hsone.finest.feescheduler.core.model;

import java.util.Date;

public class RangedFeeSchedule {
    private Date startDate;
    private Date endDate;
    private Organization organization;
    private FeeSchedule feeSchedule;
    private Integer rangedFeeScheduleVersion;

    public RangedFeeSchedule(final Date startDate, final Date endDate, final Organization organization,
                             final FeeSchedule feeSchedule, final Integer rangedFeeScheduleVersion) {
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

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(final Organization organization) {
        this.organization = organization;
    }

    public FeeSchedule getFeeSchedule() {
        return feeSchedule;
    }

    public void setFeeSchedule(final FeeSchedule feeSchedule) {
        this.feeSchedule = feeSchedule;
    }

    public Integer getRangedFeeScheduleVersion() {
        return rangedFeeScheduleVersion;
    }

    public void setRangedFeeScheduleVersion(final Integer rangedFeeScheduleVersion) {
        this.rangedFeeScheduleVersion = rangedFeeScheduleVersion;
    }
}
