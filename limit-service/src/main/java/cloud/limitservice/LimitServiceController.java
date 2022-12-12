package cloud.limitservice;

import cloud.limitservice.configuration.Configuration;
import cloud.limitservice.model.LimitServiceConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LimitServiceController {

    @Autowired
    private Configuration configuration;

    @GetMapping("limit-service")
    public LimitServiceConfiguration getLimitConfig(){

        return new LimitServiceConfiguration(configuration.getMin(), configuration.getMax());
    }
}
