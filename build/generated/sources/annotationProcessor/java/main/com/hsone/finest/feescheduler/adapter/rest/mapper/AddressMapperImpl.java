package com.hsone.finest.feescheduler.adapter.rest.mapper;

import com.hsone.finest.feescheduler.adapter.entity.Address;
import com.hsone.finest.feescheduler.core.model.Organization;
import java.util.ArrayList;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-18T22:20:29-0600",
    comments = "version: 1.5.4.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.6.1.jar, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class AddressMapperImpl implements AddressMapper {

    @Override
    public com.hsone.finest.feescheduler.core.model.Address toAddress(Address address) {
        if ( address == null ) {
            return null;
        }

        String addressId = null;
        String address1 = null;
        String address2 = null;
        String postalCode = null;
        String city = null;
        String state = null;

        if ( address.getAddressId() != null ) {
            addressId = String.valueOf( address.getAddressId() );
        }
        address1 = address.getAddress1();
        address2 = address.getAddress2();
        postalCode = address.getPostalCode();
        city = address.getCity();
        state = address.getState();

        Organization organization = null;

        com.hsone.finest.feescheduler.core.model.Address address3 = new com.hsone.finest.feescheduler.core.model.Address( addressId, address1, address2, city, state, postalCode, organization );

        return address3;
    }

    @Override
    public Iterable<com.hsone.finest.feescheduler.core.model.Address> toAddresses(Iterable<Address> addressEntity) {
        if ( addressEntity == null ) {
            return null;
        }

        ArrayList<com.hsone.finest.feescheduler.core.model.Address> iterable = new ArrayList<com.hsone.finest.feescheduler.core.model.Address>();
        for ( Address address : addressEntity ) {
            iterable.add( toAddress( address ) );
        }

        return iterable;
    }

    @Override
    public Address toAddressEnity(com.hsone.finest.feescheduler.core.model.Address address) {
        if ( address == null ) {
            return null;
        }

        Address address1 = new Address();

        if ( address.getAddressId() != null ) {
            address1.setAddressId( Long.parseLong( address.getAddressId() ) );
        }
        address1.setAddress1( address.getAddress1() );
        address1.setAddress2( address.getAddress2() );
        address1.setPostalCode( address.getPostalCode() );
        address1.setCity( address.getCity() );
        address1.setState( address.getState() );

        return address1;
    }
}
