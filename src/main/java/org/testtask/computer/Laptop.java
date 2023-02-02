package org.testtask.computer;

import java.math.BigDecimal;
import java.util.List;

import org.testtask.computer.component.Battery;
import org.testtask.computer.component.CPU;
import org.testtask.computer.component.Display;
import org.testtask.computer.component.Motherboard;
import org.testtask.computer.component.OS;
import org.testtask.computer.component.RAM;
import org.testtask.computer.component.ROM;
import org.testtask.computer.component.VideoCard;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode(callSuper = true)
@Getter
public class Laptop extends Computer {
    private final Display display;
    private final Battery battery;

    @Builder
    public Laptop(String id, String brand, String model, CPU cpu,
        List<RAM> ramList,
        List<ROM> romList, List<VideoCard> videoCardList,
        Motherboard motherboard, OS os, Float weightInKg, Display display,
        Battery battery) {
        super(id, brand, model, cpu, ramList, romList, videoCardList,
            motherboard,
            os, weightInKg);
        this.display = display;
        this.battery = battery;
    }

    @Override
    public BigDecimal calculatePrice() {
        return super.calculatePrice()
            .add(this.display.getPriceInDollars()
                .add(this.battery.getPriceInDollars()));
    }

    @Override public String getShortDescription() {
        return super.getShortDescription()
            + getDisplay().getDiagonal() + " inches\n"
            + getBattery().getCapacityInMAh() + "mAh\n"
            + "price: " + calculatePrice() + "$";
    }

    @Override public String toString() {
        return "Laptop:\n" +
            super.toString()
            + display + battery +
            "price: " + calculatePrice() + "$";
    }
}
