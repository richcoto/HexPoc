package com.hsone.finest.feescheduler.core.service;

import com.hsone.finest.feescheduler.adapter.repository.AddressCrudRepository;
import com.hsone.finest.feescheduler.adapter.rest.mapper.AddressMapper;
import com.hsone.finest.feescheduler.core.model.Address;
import com.hsone.finest.feescheduler.port.left.FeeSchedulerPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FeeSchedulerService implements FeeSchedulerPort {
    private final AddressCrudRepository addressCrudRepository;
    private AddressMapper addressMapper;
    public FeeSchedulerService(AddressCrudRepository addressCrudRepository, AddressMapper addressMapper) {
        this.addressCrudRepository = addressCrudRepository;
        this.addressMapper = addressMapper;
    }

    @Override
    public Iterable<Address> getFeeSchedulerAddresses() {
        List<com.hsone.finest.feescheduler.adapter.entity.Address> lst = new ArrayList<>();
        lst = (List< com.hsone.finest.feescheduler.adapter.entity.Address>)addressCrudRepository.findAll();
        return addressMapper.toAddresses(lst);
    }
}
