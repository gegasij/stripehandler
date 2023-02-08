package com.pleasurebot.stripehandler.bot;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.request.BaseRequest;
import com.pengrad.telegrambot.response.BaseResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TelegramBotApi {
    private final TelegramBot telegramBot;

    public BaseResponse sendMessage(BaseRequest<?, ?> editMessageText) {
        return telegramBot.execute(editMessageText);
    }


}
