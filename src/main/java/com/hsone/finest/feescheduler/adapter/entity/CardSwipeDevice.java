package com.hsone.finest.feescheduler.adapter.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CardSwipeDevice {

    @Id
    private Integer cardSwipeDeviceId;
    private String name;

    public CardSwipeDevice(final Integer cardSwipeDeviceId, final String name) {
        this.cardSwipeDeviceId = cardSwipeDeviceId;
        this.name = name;
    }

    public CardSwipeDevice() {

    }

    public Integer getCardSwipeDeviceId() {
        return cardSwipeDeviceId;
    }

    public void setCardSwipeDeviceId(Integer cardSwipeDeviceId) {
        this.cardSwipeDeviceId = cardSwipeDeviceId;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
