package com.pleasurebot.stripehandler.service;

import com.pleasurebot.stripehandler.client.BotClient;
import com.pleasurebot.stripehandler.model.CreateUserRequest;
import com.pleasurebot.stripehandler.repository.ChargeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ActivationService {
    private final BotClient botClient;
    private final ChargeRepository chargeRepository;

    public String activateUser(String login, String text) {
        return chargeRepository.findByEmail(text)
                .stream()
                .findAny()
                .map(it -> botClient.getPassword(CreateUserRequest.builder().login(login).build()))
                .map(it-> "Ваш пароль "+ it.getPassword())
                .orElse("с этой почты еще не была произведена оплата");
    }
}
