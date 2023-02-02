package org.testtask.builder.computer;

import java.util.List;

import org.testtask.builder.component.CPUBuilder;
import org.testtask.builder.component.CaseBuilder;
import org.testtask.builder.component.MotherboardBuilder;
import org.testtask.builder.component.PowerSupplyBuilder;
import org.testtask.builder.component.RAMBuilder;
import org.testtask.builder.component.ROMBuilder;
import org.testtask.builder.component.VideoCardBuilder;
import org.testtask.computer.Desktop;
import org.testtask.computer.component.OS;

public class DesktopBuilder implements ComputerBuilder<Desktop> {

    @Override public Desktop constructCheapVersion() {
        return Desktop.builder()
            .id("D1")
            .model("HP")
            .brand("Elite 8300 SFF")
            .cpu(new CPUBuilder()
                .constructCheapVersion())
            .motherboard(new MotherboardBuilder()
                .constructCheapVersion())
            .os(OS.WINDOWS10)
            .aCase(new CaseBuilder()
                .constructCheapVersion())
            .powerSupply(new PowerSupplyBuilder()
                .constructCheapVersion())
            .ramList(List.of(new RAMBuilder().constructCheapVersion(),
                new RAMBuilder().constructCheapVersion()))
            .romList(List.of(new ROMBuilder().constructCheapVersion()))
            .videoCardList(
                List.of(new VideoCardBuilder().constructBasicVersion()))
            .weightInKg(4.4f)
            .build();
    }

    @Override public Desktop constructBasicVersion() {
        return Desktop.builder()
            .id("D2")
            .model("ARTLINE")
            .brand("Gaming ASUS Edition X43")
            .cpu(new CPUBuilder()
                .constructBasicVersion())
            .motherboard(new MotherboardBuilder()
                .constructBasicVersion())
            .os(OS.NONE)
            .aCase(new CaseBuilder()
                .constructBasicVersion())
            .powerSupply(new PowerSupplyBuilder()
                .constructBasicVersion())
            .ramList(List.of(new RAMBuilder().constructBasicVersion(),
                new RAMBuilder().constructBasicVersion()))
            .romList(List.of(new ROMBuilder().constructBasicVersion()))
            .videoCardList(
                List.of(new VideoCardBuilder().constructBasicVersion()))
            .weightInKg(7.0f)
            .build();
    }

    @Override public Desktop constructPremiumVersion() {
        return Desktop.builder()
            .id("D3")
            .model("CYBER X")
            .brand("Digitalfury")
            .cpu(new CPUBuilder()
                .constructBasicVersion())
            .motherboard(new MotherboardBuilder()
                .constructPremiumVersion())
            .os(OS.WINDOWS11)
            .aCase(new CaseBuilder()
                .constructPremiumVersion())
            .powerSupply(new PowerSupplyBuilder()
                .constructPremiumVersion())
            .ramList(List.of(new RAMBuilder().constructPremiumVersion(),
                new RAMBuilder().constructPremiumVersion()))
            .romList(List.of(new ROMBuilder().constructPremiumVersion(),
                new ROMBuilder().constructCheapVersion()))
            .videoCardList(
                List.of(new VideoCardBuilder().constructPremiumVersion()))
            .weightInKg(26.0f)
            .build();
    }
}
