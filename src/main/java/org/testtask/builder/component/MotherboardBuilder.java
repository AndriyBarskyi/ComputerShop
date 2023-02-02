package org.testtask.builder.component;

import java.math.BigDecimal;

import org.testtask.computer.component.Motherboard;

public class MotherboardBuilder implements ComponentBuilder<Motherboard> {

    @Override public Motherboard constructCheapVersion() {
        return Motherboard.builder()
            .brand("Dell")
            .model("4YP6J Optiplex 3020 SFF DIH81R Tigris")
            .maxRAMCapacityInGb(8)
            .maxMemoryFrequencyInMHz(1333)
            .memorySlots(2)
            .socket("LGA 1150")
            .priceInDollars(BigDecimal.valueOf(25))
            .build();
    }

    @Override public Motherboard constructBasicVersion() {
        return Motherboard.builder()
            .brand("Asus")
            .model("Prime B450M-A II")
            .maxRAMCapacityInGb(128)
            .maxMemoryFrequencyInMHz(2400)
            .memorySlots(4)
            .socket("AM4")
            .priceInDollars(BigDecimal.valueOf(164))
            .build();
    }

    @Override public Motherboard constructPremiumVersion() {
        return Motherboard.builder()
            .brand("Asus")
            .model("ROG Strix B550-F Gaming")
            .maxRAMCapacityInGb(2500)
            .maxMemoryFrequencyInMHz(4400)
            .memorySlots(6)
            .socket("AM4")
            .priceInDollars(BigDecimal.valueOf(403))
            .build();
    }
}
