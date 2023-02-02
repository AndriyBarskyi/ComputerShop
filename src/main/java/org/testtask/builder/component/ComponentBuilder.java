package org.testtask.builder.component;

import org.testtask.computer.component.Component;

public interface ComponentBuilder<C extends Component> {
    C constructCheapVersion();

    C constructBasicVersion();

    C constructPremiumVersion();
}
