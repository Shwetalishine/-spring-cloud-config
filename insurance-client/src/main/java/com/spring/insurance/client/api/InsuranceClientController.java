package com.spring.insurance.client.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RefreshScope
public class InsuranceClientController {

    @Value("${insurance.provider.url}")
    private String url;
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getPlans")
    public List<String> getPlans(){
        List<String> plans=restTemplate.getForObject(url, List.class);
        return plans;
    }

}
