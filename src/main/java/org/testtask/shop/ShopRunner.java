package org.testtask.shop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ShopRunner implements Runnable {
    public static final String ERROR = "Invalid command, please, try again!";
    public static final String SUCH_PRODUCT_NOT_FOUND_TRY_AGAIN =
        "Such product not found! Try again!";
    public static final String CANNOT_READ_COMMAND = "Cannot read command!";
    public static final String THANK_YOU_AND_TOTAL_PRICE =
        "Thank you for buying our products, total price to pay: ";

    private static String getCommandsMenu() {
        Command[] commands = Command.values();
        return Arrays.stream(commands).map(con -> con + " - " + con.description)
            .reduce("", (a, b) -> a + "\n" + b);
    }

    public static Command fetchValue(String constant) {
        for (Command command : Command.values()) {
            if (command.toString().equals(constant)) {
                return command;
            }
        }
        return Command.MENU;
    }

    @Override public void run() {

        try (BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in))) {

            System.out.println(Command.GREETING.responseText);
            System.out.println(Command.MENU.responseText);
            System.out.println(getCommandsMenu());
            String command;
            while (!(command =
                reader.readLine().toUpperCase()).equalsIgnoreCase(
                Command.EXIT.toString())) {
                switch (fetchValue(command)) {
                case GREETING:
                    System.out.println(Command.GREETING.responseText);
                    break;
                case ALL:
                    System.out.println(Command.ALL.responseText);
                    ProductInfoSupplier.getAllComputers().forEach(
                        c -> System.out.println(
                            c.getShortDescription() + "\n"));
                    break;
                case DESKTOP:
                    System.out.println(
                        Command.DESKTOP.responseText);
                    ProductInfoSupplier.showDesktopsShortInfo();
                    break;
                case LAPTOP:
                    System.out.println(Command.LAPTOP.responseText);
                    ProductInfoSupplier.showLaptopsShortInfo();
                    break;
                case MONOBLOCK:
                    System.out.println(
                        Command.MONOBLOCK.responseText);
                    ProductInfoSupplier.showMonoblocksShortInfo();
                    break;
                case INFO:
                    System.out.println(Command.INFO.responseText);
                    String showProductId = reader.readLine().trim();
                    showFullProductInfoById(showProductId);
                    break;
                case BUY:
                    System.out.println(Command.BUY.responseText);
                    String productId = reader.readLine();
                    buyProductById(productId);
                    break;
                case MENU:
                    System.out.println(Command.MENU.responseText);
                    System.out.println(getCommandsMenu());
                    break;
                default:
                    System.out.println(ERROR);
                }
            }
        } catch (IOException e) {
            System.out.println(CANNOT_READ_COMMAND);
        }
    }

    private void showFullProductInfoById(String productId) {
        if (productExists(productId)) {
            System.out.println("Full info: \n" +
            ProductInfoSupplier.getComputerById(productId).get());
        } else {
            System.out.println(SUCH_PRODUCT_NOT_FOUND_TRY_AGAIN);
        }
    }

    private void buyProductById(String productId) {
        if (productExists(productId)) {
            System.out.println(
                THANK_YOU_AND_TOTAL_PRICE
                    + ProductInfoSupplier.getComputerById(productId)
                    .get().calculatePrice() + " $");
        } else {
            System.out.println(
                SUCH_PRODUCT_NOT_FOUND_TRY_AGAIN);
        }
    }

    private boolean productExists(String productId) {
        return ProductInfoSupplier.getComputerById(productId.toUpperCase())
            .isPresent();
    }
}
