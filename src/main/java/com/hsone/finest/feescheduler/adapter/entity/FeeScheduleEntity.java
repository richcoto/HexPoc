package com.hsone.finest.feescheduler.adapter.entity;

import java.util.List;

public class FeeScheduleEntity {
    private OrganizationEntity organization;
    private String feeScheduleName;
    private List<RangedFeeScheduleEntity> rangedFeeSchedules;

    public FeeScheduleEntity(final OrganizationEntity organization, final String feeScheduleName,
                             final List<RangedFeeScheduleEntity> rangedFeeSchedules) {
        this.organization = organization;
        this.feeScheduleName = feeScheduleName;
        this.rangedFeeSchedules = rangedFeeSchedules;
    }

    public OrganizationEntity getOrganization() {
        return organization;
    }

    public void setOrganization(final OrganizationEntity organization) {
        this.organization = organization;
    }

    public String getFeeScheduleName() {
        return feeScheduleName;
    }

    public void setFeeScheduleName(final String feeScheduleName) {
        this.feeScheduleName = feeScheduleName;
    }

    public List<RangedFeeScheduleEntity> getRangedFeeSchedules() {
        return rangedFeeSchedules;
    }

    public void setRangedFeeSchedules(final List<RangedFeeScheduleEntity> rangedFeeSchedules) {
        this.rangedFeeSchedules = rangedFeeSchedules;
    }
}
