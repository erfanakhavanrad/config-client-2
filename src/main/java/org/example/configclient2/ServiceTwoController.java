package org.example.configclient2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/payment")
@RefreshScope
public class ServiceTwoController {

    @Value("${trade.key}")
    private String tradeKey;

    @GetMapping()
    public String printKey() {
        return "Service 2: " + tradeKey;
    }


}
