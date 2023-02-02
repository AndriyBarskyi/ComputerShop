package org.testtask.builder.component;

import java.math.BigDecimal;

import org.testtask.computer.component.ROM;

public class ROMBuilder implements ComponentBuilder<ROM> {

    @Override public ROM constructCheapVersion() {
        return ROM.builder()
            .brand("Seagate")
            .model("Pipeline HD")
            .capacityInGb(500)
            .priceInDollars(BigDecimal.valueOf(20))
            .type("HDD")
            .readingSpeedInMBpS(240)
            .writingSpeedInMBpS(300)
            .build();
    }

    @Override public ROM constructBasicVersion() {
        return ROM.builder()
            .brand("Samsung ")
            .model("870 QVO")
            .capacityInGb(1000)
            .priceInDollars(BigDecimal.valueOf(80))
            .type("SSD")
            .readingSpeedInMBpS(560)
            .writingSpeedInMBpS(530)
            .build();
    }

    @Override public ROM constructPremiumVersion() {
        return ROM.builder()
            .brand("Samsung")
            .model("870 Evo-Series")
            .capacityInGb(2000)
            .priceInDollars(BigDecimal.valueOf(200))
            .type("SSD")
            .readingSpeedInMBpS(560)
            .writingSpeedInMBpS(530)
            .build();
    }
}
