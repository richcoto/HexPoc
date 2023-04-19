package com.hsone.finest.feescheduler.core.model;

import java.util.List;

public class FeeSchedule{
    private Organization organization;
    private String feeScheduleName;
    private List<RangedFeeSchedule> rangedFeeSchedules;

    public FeeSchedule(final Organization organization, final String feeScheduleName,
                       final List<RangedFeeSchedule> rangedFeeSchedules) {
        this.organization = organization;
        this.feeScheduleName = feeScheduleName;
        this.rangedFeeSchedules = rangedFeeSchedules;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(final Organization organization) {
        this.organization = organization;
    }

    public String getFeeScheduleName() {
        return feeScheduleName;
    }

    public void setFeeScheduleName(final String feeScheduleName) {
        this.feeScheduleName = feeScheduleName;
    }

    public List<RangedFeeSchedule> getRangedFeeSchedules() {
        return rangedFeeSchedules;
    }

    public void setRangedFeeSchedules(final List<RangedFeeSchedule> rangedFeeSchedules) {
        this.rangedFeeSchedules = rangedFeeSchedules;
    }
}
