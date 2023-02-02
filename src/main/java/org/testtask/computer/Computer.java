package org.testtask.computer;

import java.math.BigDecimal;
import java.util.List;

import org.testtask.computer.component.CPU;
import org.testtask.computer.component.Component;
import org.testtask.computer.component.Motherboard;
import org.testtask.computer.component.OS;
import org.testtask.computer.component.RAM;
import org.testtask.computer.component.ROM;
import org.testtask.computer.component.VideoCard;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public abstract class Computer {
    private final String id;
    private final String brand;
    private final String model;
    private final CPU cpu;
    private final List<RAM> ramList;
    private final List<ROM> romList;
    private final List<VideoCard> videoCardList;
    private final Motherboard motherboard;
    private final OS os;
    private final Float weightInKg;

    public static BigDecimal sumComponentsPrice(
        List<? extends Component> components) {
        return components.stream().map(Component::getPriceInDollars)
            .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public BigDecimal calculatePrice() {
        return cpu.getPriceInDollars()
            .add(motherboard.getPriceInDollars())
            .add(os.price)
            .add(sumComponentsPrice(ramList))
            .add(sumComponentsPrice(romList))
            .add(sumComponentsPrice(videoCardList));
    }

    public String getShortDescription() {
        return "id: " + getId() + "\n" +
            getBrand() + " " + getModel() + "\n" +
            getCpu().getBrand() + " " +
            getCpu().getModel() + " " +
            getCpu().getMemorySpeedInGHz() + "GHz\n" +
            getTotalRamCapacity() + "Gb RAM\n" +
            getRomList().stream()
                .map(
                    rom -> rom.getCapacityInGb() + "Gb " + rom.getType() + "\n")
                .reduce((a, b) -> a + b).orElse("") +
            getVideoCardList().stream().map(
                    v -> v.getBrand() + " " + v.getModel() + " "
                        + v.getMemorySizeInGb() + "Gb\n")
                .reduce((a, b) -> a + b).orElse("");
    }

    private Integer getTotalRamCapacity() {
        return ramList.stream().map(RAM::getCapacityInGb).reduce(Integer::sum)
            .orElse(0);
    }

    @Override public String toString() {
        return "id: " + id + ", \n" +
            brand + " " +
            model + ", \n" +
            cpu +
            "RAM: " + ramList +
            "\nROM: " + romList +
            "\nVideo memory: " + videoCardList +
            "\n"+ motherboard +
            "OS: " + os +
            "\nWeight: " + weightInKg +
            "kg\n";
    }
}
