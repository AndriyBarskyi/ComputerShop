package org.testtask.computer.component;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class PowerSupply extends Component {
    private final Integer wattage;
    private final String formFactor;
    private final String coolingMethod;

    @Builder
    public PowerSupply(String brand, String model, BigDecimal priceInDollars,
        Integer wattage, String formFactor, String coolingMethod) {
        super(brand, model, priceInDollars);
        this.wattage = wattage;
        this.formFactor = formFactor;
        this.coolingMethod = coolingMethod;
    }
}