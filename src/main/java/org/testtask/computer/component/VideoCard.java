package org.testtask.computer.component;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode(callSuper = true)
public class VideoCard extends Component {
    private final Float memorySizeInGb;
    private final Integer memoryBusWidthInBits;

    @Builder
    public VideoCard(String brand, String model, BigDecimal priceInDollars,
        Float memorySizeInGb, Integer memoryBusWidthInBits) {
        super(brand, model, priceInDollars);
        this.memorySizeInGb = memorySizeInGb;
        this.memoryBusWidthInBits = memoryBusWidthInBits;
    }

    @Override public String toString() {
        return super.toString() +
            "memory size: " + memorySizeInGb + "Gb, " +
            "memory bus width: " + memoryBusWidthInBits + "bits";
    }
}
