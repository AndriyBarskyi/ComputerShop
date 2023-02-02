package org.testtask.computer.component;

import java.math.BigDecimal;

public enum OS {
    WINDOWS10(BigDecimal.valueOf(1000L)),
    WINDOWS11(BigDecimal.valueOf(1500L)),
    MAC_OS(BigDecimal.valueOf(2000L)),
    LINUX(BigDecimal.ZERO),
    ENDLESS_OS(BigDecimal.ZERO),
    NONE(BigDecimal.ZERO);

    public final BigDecimal price;

    OS(BigDecimal price) {
        this.price = price;
    }
}
