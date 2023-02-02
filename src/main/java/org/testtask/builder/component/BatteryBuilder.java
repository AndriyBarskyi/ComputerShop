package org.testtask.builder.component;

import java.math.BigDecimal;

import org.testtask.computer.component.Battery;

public class BatteryBuilder implements ComponentBuilder<Battery> {

    @Override public Battery constructCheapVersion() {
        return Battery.builder()
            .brand("KingSener")
            .model("X230")
            .capacityInMAh(2200)
            .voltage(10.8)
            .priceInDollars(BigDecimal.valueOf(20))
            .build();
    }

    @Override public Battery constructBasicVersion() {
        return Battery.builder()
            .brand("V7")
            .model("0A36309-EV-7")
            .capacityInMAh(4400)
            .priceInDollars(BigDecimal.valueOf(62))
            .voltage(11.1)
            .build();
    }

    @Override public Battery constructPremiumVersion() {
        return Battery.builder()
            .brand("KingSener")
            .model("X230")
            .capacityInMAh(8000)
            .voltage(12.6)
            .priceInDollars(BigDecimal.valueOf(129))
            .build();
    }
}
