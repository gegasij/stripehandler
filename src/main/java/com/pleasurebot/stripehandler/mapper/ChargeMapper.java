package com.pleasurebot.stripehandler.mapper;

import com.pleasurebot.stripehandler.model.Charge;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ChargeMapper {
    public Charge fromStripeCharge(com.stripe.model.Charge charge) {
        return Charge.builder()
                .id(charge.getId())
                .phone(charge.getCustomerObject().getPhone())
                .email(charge.getCustomerObject().getEmail())
                .name(charge.getCustomerObject().getName())
                .build();
    }
}
