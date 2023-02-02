package org.testtask.shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.testtask.builder.computer.DesktopBuilder;
import org.testtask.builder.computer.LaptopBuilder;
import org.testtask.builder.computer.MonoblockBuilder;
import org.testtask.computer.Computer;

public class ProductInfoSupplier {

    public static List<Computer> getAllComputers() {
        List<Computer> computers = new ArrayList<>();
        computers.add(new DesktopBuilder().constructCheapVersion());
        computers.add(new DesktopBuilder().constructBasicVersion());
        computers.add(new DesktopBuilder().constructPremiumVersion());

        computers.add(new LaptopBuilder().constructCheapVersion());
        computers.add(new LaptopBuilder().constructBasicVersion());
        computers.add(new LaptopBuilder().constructPremiumVersion());

        computers.add(new MonoblockBuilder().constructCheapVersion());
        computers.add(new MonoblockBuilder().constructBasicVersion());
        computers.add(new MonoblockBuilder().constructPremiumVersion());
        return computers;
    }

    public static Optional<Computer> getComputerById(String id) {
        return getAllComputers().stream()
            .filter(c -> c.getId().equals(id)).findFirst();
    }

    public static void showLaptopsShortInfo() {
        List<String> computers = new ArrayList<>();
        computers.add(
            new LaptopBuilder().constructCheapVersion().getShortDescription()
                + "\n");
        computers.add(
            new LaptopBuilder().constructBasicVersion().getShortDescription()
                + "\n");
        computers.add(
            new LaptopBuilder().constructPremiumVersion().getShortDescription()
                + "\n");
        computers.forEach(System.out::println);
    }

    public static void showDesktopsShortInfo() {
        List<String> computers = new ArrayList<>();
        computers.add(
            new DesktopBuilder().constructCheapVersion().getShortDescription()
                + "\n");
        computers.add(
            new DesktopBuilder().constructBasicVersion().getShortDescription()
                + "\n");
        computers.add(
            new DesktopBuilder().constructPremiumVersion().getShortDescription()
                + "\n");
        computers.forEach(System.out::println);
    }

    public static void showMonoblocksShortInfo() {
        List<String> computers = new ArrayList<>();
        computers.add(
            new MonoblockBuilder().constructCheapVersion().getShortDescription()
                + "\n");
        computers.add(
            new MonoblockBuilder().constructBasicVersion().getShortDescription()
                + "\n");
        computers.add(new MonoblockBuilder().constructPremiumVersion()
            .getShortDescription());
        computers.forEach(System.out::println);
    }
}
