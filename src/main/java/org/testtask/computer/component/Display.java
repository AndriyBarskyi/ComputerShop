package org.testtask.computer.component;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Display extends Component {
    private final Float diagonal;
    private final String resolution;
    private final String type;

    @Builder
    public Display(String brand, String model, BigDecimal priceInDollars,
        Float diagonal, String resolution, String type) {
        super(brand, model, priceInDollars);
        this.diagonal = diagonal;
        this.resolution = resolution;
        this.type = type;
    }
}
