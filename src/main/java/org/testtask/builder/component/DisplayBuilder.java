package org.testtask.builder.component;

import java.math.BigDecimal;

import org.testtask.computer.component.Display;

public class DisplayBuilder implements ComponentBuilder<Display> {

    @Override public Display constructCheapVersion() {
        return Display.builder()
            .priceInDollars(BigDecimal.valueOf(20))
            .diagonal(14.0f)
            .resolution("1366x788")
            .type("TN")
            .build();
    }

    @Override public Display constructBasicVersion() {
        return Display.builder()
            .priceInDollars(BigDecimal.valueOf(60))
            .diagonal(15.5f)
            .resolution("1920x1080")
            .type("OLED")
            .build();
    }

    @Override public Display constructPremiumVersion() {
        return Display.builder()
            .priceInDollars(BigDecimal.valueOf(120))
            .diagonal(17.0f)
            .resolution("1920x1080")
            .type("IPS")
            .build();
    }
}
