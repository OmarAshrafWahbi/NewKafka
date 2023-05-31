package com.customer;

import com.google.gson.Gson;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class CustomerListener {
    @KafkaListener(topics = "Product", groupId = "product")
    void listener(String data) {
        ApiRequest api = new Gson().fromJson(data, ApiRequest.class);
        System.out.println(api.getDbconnections());
    }
}
