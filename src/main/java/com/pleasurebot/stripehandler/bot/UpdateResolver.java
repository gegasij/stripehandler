package com.pleasurebot.stripehandler.bot;

import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.model.request.ParseMode;
import com.pengrad.telegrambot.request.SendMessage;
import com.pleasurebot.stripehandler.repository.ChargeRepository;
import com.pleasurebot.stripehandler.service.ActivationService;
import com.pleasurebot.stripehandler.service.BotUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UpdateResolver {
    private final TelegramBotApi telegramBotApi;
    private final ActivationService activationService;

    public void resolveUpdate(Update update) {
        if (update.message() != null) {
            if (update.message().text() != null) {
                String telegramUsername = BotUtil.getTelegramUsername(update);
                String result = activationService.activateUser(telegramUsername, update.message().text());
                SendMessage sendMessage = new SendMessage(BotUtil.getChatId(update), result);
                telegramBotApi.sendMessage(sendMessage);
            }
        } else {
            SendMessage sendMessage = new SendMessage(BotUtil.getChatId(update), "Доброго дня! \n введите мне свою почту, которой вы произвели оплату, я создам для вас аккаунт и пришлю пароль");
            sendMessage.parseMode(ParseMode.HTML);
            telegramBotApi.sendMessage(sendMessage);
        }
    }
}
