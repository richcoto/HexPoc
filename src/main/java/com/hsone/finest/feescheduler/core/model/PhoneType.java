package com.hsone.finest.feescheduler.core.model;

public enum PhoneType {
    HOME(1, "Home"),
    WORK(2, "Work"),
    MOBILE(3, "Mobile"),
    OTHER(4, "Other");

    private final Integer id;
    private final String value;

    PhoneType(final Integer id, final String value) {
        this.id = id;
        this.value = value;
    }

    private String getKey() {
        return name();
    }
}
