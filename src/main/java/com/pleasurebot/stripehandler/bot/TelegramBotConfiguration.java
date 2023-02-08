package com.pleasurebot.stripehandler.bot;


import com.pengrad.telegrambot.TelegramBot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TelegramBotConfiguration {
    @Bean
    public TelegramBot telegramBot() {
        return new TelegramBot("5801400827:AAFxPUEZIcFyK5gR_Nszb6-ZTXqjUuegCkE");
    }
}
