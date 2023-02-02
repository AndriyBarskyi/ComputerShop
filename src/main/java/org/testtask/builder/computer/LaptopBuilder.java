package org.testtask.builder.computer;

import java.util.List;

import org.testtask.builder.component.BatteryBuilder;
import org.testtask.builder.component.CPUBuilder;
import org.testtask.builder.component.DisplayBuilder;
import org.testtask.builder.component.MotherboardBuilder;
import org.testtask.builder.component.RAMBuilder;
import org.testtask.builder.component.ROMBuilder;
import org.testtask.builder.component.VideoCardBuilder;
import org.testtask.computer.Laptop;
import org.testtask.computer.component.OS;

public class LaptopBuilder implements ComputerBuilder<Laptop> {

    @Override public Laptop constructCheapVersion() {
        return Laptop.builder()
            .id("L1")
            .model("Lenovo")
            .brand("IdeaPad 3 15ALC6")
            .cpu(new CPUBuilder()
                .constructCheapVersion())
            .motherboard(new MotherboardBuilder()
                .constructCheapVersion())
            .os(OS.ENDLESS_OS)
            .display(new DisplayBuilder()
                .constructCheapVersion())
            .battery(new BatteryBuilder()
                .constructCheapVersion())
            .ramList(List.of(new RAMBuilder().constructCheapVersion()))
            .romList(List.of(new ROMBuilder().constructCheapVersion()))
            .videoCardList(
                List.of(new VideoCardBuilder().constructCheapVersion()))
            .weightInKg(1.65f)
            .build();
    }

    @Override public Laptop constructBasicVersion() {
        return Laptop.builder()
            .id("L2")
            .model("Acer")
            .brand("Aspire 7 A715-42G-R7BK")
            .cpu(new CPUBuilder()
                .constructBasicVersion())
            .motherboard(new MotherboardBuilder()
                .constructBasicVersion())
            .os(OS.LINUX)
            .display(new DisplayBuilder()
                .constructBasicVersion())
            .battery(new BatteryBuilder()
                .constructBasicVersion())
            .ramList(List.of(new RAMBuilder().constructBasicVersion(),
                new RAMBuilder().constructBasicVersion()))
            .romList(List.of(new ROMBuilder().constructBasicVersion(),
                new ROMBuilder().constructCheapVersion()))
            .videoCardList(
                List.of(new VideoCardBuilder().constructCheapVersion(),
                    new VideoCardBuilder().constructBasicVersion()))
            .weightInKg(2.4f)
            .build();
    }

    @Override public Laptop constructPremiumVersion() {
        return Laptop.builder()
            .id("L3")
            .model("Lenovo")
            .brand("ThinkPad P1 Gen 5")
            .cpu(new CPUBuilder()
                .constructPremiumVersion())
            .motherboard(new MotherboardBuilder()
                .constructPremiumVersion())
            .os(OS.WINDOWS11)
            .display(new DisplayBuilder()
                .constructPremiumVersion())
            .battery(new BatteryBuilder()
                .constructPremiumVersion())
            .ramList(List.of(new RAMBuilder().constructPremiumVersion(),
                new RAMBuilder().constructPremiumVersion()))
            .romList(List.of(new ROMBuilder().constructPremiumVersion(),
                new ROMBuilder().constructPremiumVersion()))
            .videoCardList(
                List.of(new VideoCardBuilder().constructCheapVersion(),
                    new VideoCardBuilder().constructPremiumVersion()))
            .weightInKg(1.81f)
            .build();
    }
}
