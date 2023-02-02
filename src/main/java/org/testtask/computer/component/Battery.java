package org.testtask.computer.component;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Battery extends Component {
    private final Integer capacityInMAh;
    private final Double voltage;

    @Builder
    public Battery(String brand, String model, BigDecimal priceInDollars,
        Integer capacityInMAh, Double voltage) {
        super(brand, model, priceInDollars);
        this.capacityInMAh = capacityInMAh;
        this.voltage = voltage;
    }
}
