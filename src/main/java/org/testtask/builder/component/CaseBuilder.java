package org.testtask.builder.component;

import java.math.BigDecimal;

import org.testtask.computer.component.Case;

public class CaseBuilder implements ComponentBuilder<Case> {

    @Override public Case constructCheapVersion() {
        return Case.builder()
            .brand("Gamemax")
            .model("ET-209-NP")
            .color("Black")
            .material("Plastic")
            .type("Mid-tower")
            .sizeInMm("175 х 405 х 330 mm")
            .priceInDollars(BigDecimal.valueOf(20))
            .build();
    }

    @Override public Case constructBasicVersion() {
        return Case.builder()
            .brand("Pure Base")
            .model("500DX")
            .color("White")
            .material("Steel, glass, plastic")
            .type("Mid-tower")
            .sizeInMm("450 х 232 х 443 mm")
            .priceInDollars(BigDecimal.valueOf(130))
            .build();
    }

    @Override public Case constructPremiumVersion() {
        return Case.builder()
            .brand("ThermalTake")
            .model("Level 20")
            .color("Black")
            .material("Plastic, aluminium, metal, glass")
            .type("Full-tower")
            .sizeInMm("280 х 405 х 330 mm")
            .priceInDollars(BigDecimal.valueOf(1000))
            .build();
    }
}
