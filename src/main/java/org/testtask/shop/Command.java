package org.testtask.shop;

public enum Command {
    GREETING("Hello, welcome to The Computer Shop!",
        "Shows the greeting message."),
    ALL("Here you can see all available computers:",
        "Shows all available computers."),
    DESKTOP("Here you can see all available desktop PCs:",
        "Shows all available desktop PCs."),
    LAPTOP("Here you can see all available laptops:",
        "Shows all available laptops."),
    MONOBLOCK("Here you can see all available mono-blocks:",
        "Shows all available computers."),
    INFO("Please, input the product id to choose the product:",
        "Shows all information about the product."),
    BUY("Please, input the product id to confirm your choice: ",
        "Use to buy the current product."),
    MENU("Menu:", "Shows the list of commands."),
    EXIT("Good bye!\n", "Closes the application.\n");

    public final String responseText;
    public final String description;

    Command(String responseText, String description) {
        this.responseText = responseText;
        this.description = description;
    }
}
