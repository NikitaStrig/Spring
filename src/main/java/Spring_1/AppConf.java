package Spring_1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConf {
    @Bean
    public Car getCarBean() {
        return new Car("BMW");
    }

    @Bean
    public Bus getBusBean() {
        return new Bus("MAZ");
    }

    @Bean
    public Pickup getPickupBean() {
        return new Pickup("T-REX");
    }

    @Bean(name = "driver")
    public Driver getDriver() {
        return new Driver(getCarBean(), "Log");
    }

    @Bean(name = "driver2")
    public Driver getDriver2() {
        return new Driver(getBusBean(), "Zog");
    }

    @Bean(name = "driver3")
    public Driver getDriver3() {
        return new Driver(getPickupBean(), "Bog");
    }
}