package com.product;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/Product")
public class ProductController {
//    @Autowired
    private KafkaTemplate<String, Map<String,Object>> kafkaTemplate;

    @PostMapping("/hello")
    public String hello(){
        return "Hello";
    }

    public ProductController(KafkaTemplate<String, Map<String, Object>> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping("testConn")
    public void publish(@RequestBody ApiRequest request){
//        kafkaTemplate.send(request.getAppnameid(), new Gson().toJson(request));
    }
}
