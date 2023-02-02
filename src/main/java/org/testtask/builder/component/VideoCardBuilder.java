package org.testtask.builder.component;

import java.math.BigDecimal;

import org.testtask.computer.component.VideoCard;

public class VideoCardBuilder implements ComponentBuilder<VideoCard> {

    @Override public VideoCard constructCheapVersion() {
        return VideoCard.builder()
            .brand("Intel")
            .model("HD Graphics 4000")
            .priceInDollars(BigDecimal.valueOf(40))
            .memoryBusWidthInBits(192)
            .memorySizeInGb(0.5f)
            .build();
    }

    @Override public VideoCard constructBasicVersion() {
        return VideoCard.builder()
            .brand("Gigabyte")
            .model("GeForce GTX 1650")
            .priceInDollars(BigDecimal.valueOf(200))
            .memoryBusWidthInBits(192)
            .memorySizeInGb(4.0f)
            .build();
    }

    @Override public VideoCard constructPremiumVersion() {
        return VideoCard.builder()
            .brand("Gigabyte")
            .model("RTX 4090")
            .priceInDollars(BigDecimal.valueOf(2000))
            .memoryBusWidthInBits(384)
            .memorySizeInGb(24.0f)
            .build();
    }
}
