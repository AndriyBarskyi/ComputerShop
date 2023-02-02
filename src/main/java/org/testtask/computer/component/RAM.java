package org.testtask.computer.component;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@ToString(callSuper = true)
@Getter
@EqualsAndHashCode(callSuper = true)
public class RAM extends Component {
    private final String memoryType;
    private final Integer capacityInGb;
    private final Integer memoryFrequencyInMHz;

    @Builder
    public RAM(String brand, String model, BigDecimal priceInDollars,
        String memoryType, Integer capacityInGb, Integer memoryFrequencyInMHz) {
        super(brand, model, priceInDollars);
        this.memoryType = memoryType;
        this.capacityInGb = capacityInGb;
        this.memoryFrequencyInMHz = memoryFrequencyInMHz;
    }
}
