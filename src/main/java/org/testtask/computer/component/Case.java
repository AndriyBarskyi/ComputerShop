package org.testtask.computer.component;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode(callSuper = true)
public class Case extends Component {
    private final String type;
    private final String sizeInMm;
    private final String color;
    private final String material;

    @Builder
    public Case(String brand, String model, BigDecimal priceInDollars,
        String type, String sizeInMm, String color, String material) {
        super(brand, model, priceInDollars);
        this.type = type;
        this.sizeInMm = sizeInMm;
        this.color = color;
        this.material = material;
    }

    @Override public String toString() {
        return "Case: " +
        super.toString() +
            "type: " + type + ", " +
            "size: " + sizeInMm + ", " +
            "color: " + color + ", " +
            "material: " + material + "\n";
    }
}
