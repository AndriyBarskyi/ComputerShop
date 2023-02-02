package org.testtask.builder.component;

import java.math.BigDecimal;

import org.testtask.computer.component.PowerSupply;

public class PowerSupplyBuilder implements ComponentBuilder<PowerSupply> {

    @Override public PowerSupply constructCheapVersion() {
        return PowerSupply.builder()
            .brand("Chieftec")
            .model("GPA-700S")
            .coolingMethod("Air")
            .formFactor("ATX")
            .wattage(700)
            .priceInDollars(BigDecimal.valueOf(38))
            .build();
    }

    @Override public PowerSupply constructBasicVersion() {
        return PowerSupply.builder()
            .brand("Chieftec")
            .model("Proton BDF-850C")
            .coolingMethod("Air")
            .formFactor("ATX")
            .wattage(850)
            .priceInDollars(BigDecimal.valueOf(120))
            .build();
    }

    @Override public PowerSupply constructPremiumVersion() {
        return PowerSupply.builder()
            .brand("Chieftec")
            .model("Polaris")
            .coolingMethod("Air")
            .formFactor("ATX")
            .wattage(1250)
            .priceInDollars(BigDecimal.valueOf(300))
            .build();
    }
}
