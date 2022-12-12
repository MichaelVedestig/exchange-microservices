package cloud.limitservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("limit-service")
@Component
public class Configuration {

    private int min;
    private int max;

    protected Configuration() {

    }

    public Configuration(int min, int max) {
        super();
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}
