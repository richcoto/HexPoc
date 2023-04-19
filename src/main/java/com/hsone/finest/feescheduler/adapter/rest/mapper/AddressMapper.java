package com.hsone.finest.feescheduler.adapter.rest.mapper;
import com.hsone.finest.feescheduler.core.model.Address;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface AddressMapper {
    @Mappings({
            @Mapping(source = "addressId", target = "addressId"),
            @Mapping(source = "address1", target = "address1"),
            @Mapping(source = "address2", target = "address2"),
            @Mapping(source = "postalCode", target = "postalCode"),
            @Mapping(source = "city", target = "city"),
            @Mapping(source = "state", target = "state")
    }
    )
    Address toAddress(com.hsone.finest.feescheduler.adapter.entity.Address address);
    Iterable<Address> toAddresses(Iterable<com.hsone.finest.feescheduler.adapter.entity.Address> addressEntity);

    @InheritInverseConfiguration
    com.hsone.finest.feescheduler.adapter.entity.Address toAddressEnity (Address address);
}
