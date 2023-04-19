package com.hsone.finest.feescheduler.port.left;

import com.hsone.finest.feescheduler.core.model.Address;
import java.util.List;

public interface FeeSchedulerPort {
    Iterable<Address> getFeeSchedulerAddresses();
}
