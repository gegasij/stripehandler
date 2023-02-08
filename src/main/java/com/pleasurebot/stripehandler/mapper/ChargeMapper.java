package com.pleasurebot.stripehandler.mapper;

import com.pleasurebot.stripehandler.model.Charge;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ChargeMapper {
    public Charge fromStripeCharge(com.stripe.model.Charge charge) {
        return Charge.builder()
                .id(charge.getId())
                .amount(charge.getAmount())
                .phone(charge.getBillingDetails().getPhone())
                .email(charge.getBillingDetails().getEmail())
                .name(charge.getBillingDetails().getName())
                .build();
    }
}
