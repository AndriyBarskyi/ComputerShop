package org.testtask.computer.component;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Motherboard extends Component {
    private final Integer maxMemoryFrequencyInMHz;
    private final Integer maxRAMCapacityInGb;
    private final String socket;
    private final Integer memorySlots;

    @Builder
    public Motherboard(String brand, String model, BigDecimal priceInDollars,
        Integer maxMemoryFrequencyInMHz, Integer maxRAMCapacityInGb,
        String socket, Integer memorySlots) {
        super(brand, model, priceInDollars);
        this.maxMemoryFrequencyInMHz = maxMemoryFrequencyInMHz;
        this.maxRAMCapacityInGb = maxRAMCapacityInGb;
        this.socket = socket;
        this.memorySlots = memorySlots;
    }
}