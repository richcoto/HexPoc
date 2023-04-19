package com.hsone.finest.feescheduler.adapter.entity;

public enum PhoneTypeEntity {
    HOME(1, "Home"),
    WORK(2, "Work"),
    MOBILE(3, "Mobile"),
    OTHER(4, "Other");

    private final Integer id;
    private final String value;

    PhoneTypeEntity(final Integer id, final String value) {
        this.id = id;
        this.value = value;
    }

    private String getKey() {
        return name();
    }
}
