package org.testtask.builder.component;

import java.math.BigDecimal;

import org.testtask.computer.component.RAM;

public class RAMBuilder implements ComponentBuilder<RAM> {

    @Override public RAM constructCheapVersion() {
        return RAM.builder()
            .brand("GoodRam")
            .model("GR1600S364L11S/4G")
            .capacityInGb(4)
            .memoryFrequencyInMHz(1600)
            .memoryType("DDR3")
            .priceInDollars(BigDecimal.valueOf(15))
            .build();
    }

    @Override public RAM constructBasicVersion() {
        return RAM.builder()
            .brand("Kingston")
            .model("Fury")
            .capacityInGb(8)
            .memoryFrequencyInMHz(3200)
            .memoryType("DDR4")
            .priceInDollars(BigDecimal.valueOf(40))
            .build();
    }

    @Override public RAM constructPremiumVersion() {
        return RAM.builder()
            .brand("Kingston")
            .model("Fury")
            .capacityInGb(32)
            .memoryFrequencyInMHz(6000)
            .memoryType("DDR5")
            .priceInDollars(BigDecimal.valueOf(200))
            .build();
    }
}
