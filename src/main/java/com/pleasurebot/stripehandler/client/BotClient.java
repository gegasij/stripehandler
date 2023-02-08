package com.pleasurebot.stripehandler.client;

import com.pleasurebot.stripehandler.model.CreateUserRequest;
import com.pleasurebot.stripehandler.model.CreateUserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(value = "botClient", url = "http://localhost:8081")
public interface BotClient {
    @RequestMapping(method = RequestMethod.POST, value = "/user")
    CreateUserResponse getPassword(CreateUserRequest createUserRequest);
}
