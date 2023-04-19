package com.hsone.finest.feescheduler.adapter.rest.api;

import com.hsone.finest.feescheduler.core.model.Address;
import com.hsone.finest.feescheduler.core.model.FeeSchedule;
import com.hsone.finest.feescheduler.core.service.FeeSchedulerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class FeeSchedulerController {
    private final FeeSchedulerService feeSchedulerService;

    public FeeSchedulerController(FeeSchedulerService feeSchedulerService) {
        this.feeSchedulerService = feeSchedulerService;
    }

    @GetMapping(value = "/feeSchedule")
    public List<FeeSchedule> getFeeScheduleRecords() {
        System.out.println("Hello Friend (feeSchedule).");
        return null;
    }

    @GetMapping(value = "/feeScheduleAddress")
    public Iterable<Address> getFeeScheduleAddressRecords() {
        System.out.println("Hello Friend (feeScheduleAddress)");
        return feeSchedulerService.getFeeSchedulerAddresses();
    }

}
