package org.testtask.computer.component;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class CPU extends Component {
    private final Integer cores;
    private final Integer threads;
    private final Float memorySpeedInGHz;

    @Builder
    public CPU(String brand, String model, BigDecimal priceInDollars,
        Integer cores,
        Integer threads, Float memorySpeedInGHz) {
        super(brand, model, priceInDollars);
        this.cores = cores;
        this.threads = threads;
        this.memorySpeedInGHz = memorySpeedInGHz;
    }
}
