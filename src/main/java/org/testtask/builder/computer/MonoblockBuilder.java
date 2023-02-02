package org.testtask.builder.computer;

import java.util.List;

import org.testtask.builder.component.CPUBuilder;
import org.testtask.builder.component.DisplayBuilder;
import org.testtask.builder.component.MotherboardBuilder;
import org.testtask.builder.component.PowerSupplyBuilder;
import org.testtask.builder.component.RAMBuilder;
import org.testtask.builder.component.ROMBuilder;
import org.testtask.builder.component.VideoCardBuilder;
import org.testtask.computer.Monoblock;
import org.testtask.computer.component.OS;

public class MonoblockBuilder implements ComputerBuilder<Monoblock> {

    @Override public Monoblock constructCheapVersion() {
        return Monoblock.builder()
            .id("M1")
            .model("ARTLINE")
            .brand("Business M61v06")
            .cpu(new CPUBuilder()
                .constructCheapVersion())
            .motherboard(new MotherboardBuilder()
                .constructCheapVersion())
            .os(OS.ENDLESS_OS)
            .display(new DisplayBuilder()
                .constructCheapVersion())
            .powerSupply(new PowerSupplyBuilder()
                .constructCheapVersion())
            .ramList(List.of(new RAMBuilder().constructCheapVersion()))
            .romList(List.of(new ROMBuilder().constructCheapVersion()))
            .videoCardList(
                List.of(new VideoCardBuilder().constructCheapVersion()))
            .weightInKg(7.4f)
            .build();
    }

    @Override public Monoblock constructBasicVersion() {
        return Monoblock.builder()
            .id("M2")
            .model("ARTLINE")
            .brand("Gaming G75v35Win")
            .cpu(new CPUBuilder()
                .constructBasicVersion())
            .motherboard(new MotherboardBuilder()
                .constructBasicVersion())
            .os(OS.WINDOWS11)
            .display(new DisplayBuilder()
                .constructBasicVersion())
            .powerSupply(new PowerSupplyBuilder()
                .constructBasicVersion())
            .ramList(List.of(new RAMBuilder().constructBasicVersion(),
                new RAMBuilder().constructBasicVersion()))
            .romList(List.of(new ROMBuilder().constructBasicVersion()))
            .videoCardList(
                List.of(new VideoCardBuilder().constructBasicVersion()))
            .weightInKg(12.0f)
            .build();
    }

    @Override public Monoblock constructPremiumVersion() {
        return Monoblock.builder()
            .id("M3")
            .model("Dell")
            .brand("Optiplex 7400 AIO")
            .cpu(new CPUBuilder()
                .constructPremiumVersion())
            .motherboard(new MotherboardBuilder()
                .constructPremiumVersion())
            .os(OS.LINUX)
            .display(new DisplayBuilder()
                .constructPremiumVersion())
            .powerSupply(new PowerSupplyBuilder()
                .constructPremiumVersion())
            .ramList(List.of(new RAMBuilder().constructPremiumVersion(),
                new RAMBuilder().constructPremiumVersion()))
            .romList(List.of(new ROMBuilder().constructPremiumVersion()))
            .videoCardList(
                List.of(new VideoCardBuilder().constructPremiumVersion()))
            .weightInKg(6.18f)
            .build();
    }
}
