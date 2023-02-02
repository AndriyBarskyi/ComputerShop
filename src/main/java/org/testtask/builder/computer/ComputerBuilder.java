package org.testtask.builder.computer;

import org.testtask.computer.Computer;

public interface ComputerBuilder<C extends Computer> {
    C constructCheapVersion();

    C constructBasicVersion();

    C constructPremiumVersion();
}
