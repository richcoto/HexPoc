package com.hsone.finest.feescheduler.adapter.entity;

public class PMSoftwareTypeEntity {
    static final String GOLDEN_EAGLE_DEFAULT = "default";
    static final String GOLDEN_EAGLE_AUSTRALIA = "en-AU";
    static final String GOLDEN_EAGLE_ATHENA = "Athena";

    private String name;

    public PMSoftwareTypeEntity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDefaultSoftwareType() {
        return name != GOLDEN_EAGLE_AUSTRALIA &&
                name != GOLDEN_EAGLE_ATHENA;
    }

    public boolean isAustralianSoftwareType() {
        return name == GOLDEN_EAGLE_AUSTRALIA;
    }
}
