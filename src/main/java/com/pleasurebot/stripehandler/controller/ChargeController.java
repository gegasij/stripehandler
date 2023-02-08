package com.pleasurebot.stripehandler.controller;

import com.pleasurebot.stripehandler.service.ChargeHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/charge")
@RequiredArgsConstructor
public class ChargeController {
    private final ChargeHandler chargeHandler;

    @PostMapping("/succeeded")
    public String succeeded(@RequestBody String requestBody) {
        return chargeHandler.succeeded(requestBody);
    }

    @PostMapping("/failed")
    public String failed(@RequestBody String requestBody) {
        return chargeHandler.failed(requestBody);
    }
}
