package org.testtask.computer;

import java.math.BigDecimal;
import java.util.List;

import org.testtask.computer.component.CPU;
import org.testtask.computer.component.Display;
import org.testtask.computer.component.Motherboard;
import org.testtask.computer.component.OS;
import org.testtask.computer.component.PowerSupply;
import org.testtask.computer.component.RAM;
import org.testtask.computer.component.ROM;
import org.testtask.computer.component.VideoCard;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Getter
public class Monoblock extends Computer {
    private final Display display;
    private final PowerSupply powerSupply;

    @Builder
    public Monoblock(String id, String brand, String model, CPU cpu,
        List<RAM> ramList,
        List<ROM> romList, List<VideoCard> videoCardList,
        Motherboard motherboard, OS os, Float weightInKg, Display display,
        PowerSupply powerSupply) {
        super(id, brand, model, cpu, ramList, romList, videoCardList,
            motherboard,
            os, weightInKg);
        this.display = display;
        this.powerSupply = powerSupply;
    }

    @Override
    public BigDecimal calculatePrice() {
        return super.calculatePrice()
            .add(this.display.getPriceInDollars())
            .add(this.powerSupply.getPriceInDollars());
    }

    @Override public String getShortDescription() {
        return super.getShortDescription()
            + getDisplay().getDiagonal() + " inches\n"
            + getPowerSupply().getWattage() + "W\n"
            + "price: " + calculatePrice() + "$";
    }
}
