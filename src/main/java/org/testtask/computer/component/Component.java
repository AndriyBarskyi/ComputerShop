package org.testtask.computer.component;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public abstract class Component {
    private final String brand;
    private final String model;
    private final BigDecimal priceInDollars;

    @Override
    public String toString() {
        return brand + " " + model + ", ";
    }
}
