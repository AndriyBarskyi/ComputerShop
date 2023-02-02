package org.testtask.builder.component;

import java.math.BigDecimal;

import org.testtask.computer.component.CPU;

public class CPUBuilder implements ComponentBuilder<CPU> {

    @Override public CPU constructCheapVersion() {
        return CPU.builder()
            .brand("Intel")
            .model("Core i5-2400")
            .priceInDollars(BigDecimal.valueOf(39))
            .cores(4)
            .threads(4)
            .memorySpeedInGHz(3.1f)
            .build();
    }

    @Override public CPU constructBasicVersion() {
        return CPU.builder()
            .brand("Intel")
            .model("Core i7-10700F")
            .priceInDollars(BigDecimal.valueOf(244))
            .cores(8)
            .threads(16)
            .memorySpeedInGHz(2.9f)
            .build();
    }

    @Override public CPU constructPremiumVersion() {
        return CPU.builder()
            .brand("Intel")
            .model("Core i9-13900KF")
            .priceInDollars(BigDecimal.valueOf(569))
            .cores(24)
            .threads(32)
            .memorySpeedInGHz(3.0f)
            .build();
    }
}
