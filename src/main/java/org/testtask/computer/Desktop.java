package org.testtask.computer;

import java.math.BigDecimal;
import java.util.List;

import org.testtask.computer.component.CPU;
import org.testtask.computer.component.Case;
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
@Getter
public class Desktop extends Computer {
    private final Case aCase;
    private final PowerSupply powerSupply;

    @Builder
    public Desktop(String id, String brand, String model, CPU cpu,
        List<RAM> ramList,
        List<ROM> romList, List<VideoCard> videoCardList,
        Motherboard motherboard, OS os, Float weightInKg, Case aCase,
        PowerSupply powerSupply) {
        super(id, brand, model, cpu, ramList, romList, videoCardList,
            motherboard,
            os, weightInKg);
        this.aCase = aCase;
        this.powerSupply = powerSupply;
    }

    @Override
    public BigDecimal calculatePrice() {
        return super.calculatePrice()
            .add(this.getACase().getPriceInDollars())
            .add(this.getPowerSupply().getPriceInDollars());
    }

    @Override public String getShortDescription() {
        return super.getShortDescription()
            + getACase().getColor() + "\n"
            + getPowerSupply().getWattage() + "W\n"
            + "price: " + calculatePrice() + "$";
    }

    @Override public String toString() {
        return "Desktop Computer:\n" +
            super.toString() +
            aCase + powerSupply +
            "price: "+ calculatePrice() + "$";
    }
}
