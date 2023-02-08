package com.pleasurebot.stripehandler.service;

import com.pleasurebot.stripehandler.mapper.ChargeMapper;
import com.pleasurebot.stripehandler.mapper.CustomerMapper;
import com.pleasurebot.stripehandler.repository.ChargeRepository;
import com.pleasurebot.stripehandler.repository.CustomerRepository;
import com.stripe.model.Charge;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PaymentService {
    private final CustomerRepository customerRepository;
    private final ChargeRepository chargeRepository;

    public void handlePayment(Charge charge){
        val internCustomer = CustomerMapper.fromStripeCustomer(charge.getCustomerObject());
        val internCharge = ChargeMapper.fromStripeCharge(charge);
        customerRepository.save(internCustomer);
        chargeRepository.save(internCharge);
    }

}
