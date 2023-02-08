package com.pleasurebot.stripehandler.mapper;

import com.pleasurebot.stripehandler.model.Customer;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CustomerMapper {
    public Customer fromStripeCustomer(com.stripe.model.Customer customer) {
        return Customer.builder()
                .id(customer.getId())
                .amount(null)
                .phone(customer.getPhone())
                .email(customer.getEmail())
                .name(customer.getName())
                .build();
    }
}
