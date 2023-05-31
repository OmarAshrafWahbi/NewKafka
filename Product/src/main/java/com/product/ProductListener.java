package com.product;

import com.google.gson.Gson;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class ProductListener {
    @KafkaListener(topics = "Customer", groupId = "Customer")
    void listener(Map<String,Object> data) {
        System.out.println(data);
    }
}
