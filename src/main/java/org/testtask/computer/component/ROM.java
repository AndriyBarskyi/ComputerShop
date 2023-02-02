package org.testtask.computer.component;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode(callSuper = true)
public class ROM extends Component {
    private final String type;
    private final Integer readingSpeedInMBpS;
    private final Integer writingSpeedInMBpS;
    private final Integer capacityInGb;

    @Builder
    public ROM(String brand, String model, BigDecimal priceInDollars,
        String type, Integer readingSpeedInMBpS, Integer writingSpeedInMBpS,
        Integer capacityInGb) {
        super(brand, model, priceInDollars);
        this.type = type;
        this.readingSpeedInMBpS = readingSpeedInMBpS;
        this.writingSpeedInMBpS = writingSpeedInMBpS;
        this.capacityInGb = capacityInGb;
    }

    @Override public String toString() {
        return super.toString() +
            "type: " + type + ", " +
            "reading speed: " + readingSpeedInMBpS + "Mb/s, " +
            "writing speed: " + writingSpeedInMBpS + "Mb/s, "+
            "capacity " + capacityInGb + "Gb";
    }
}
