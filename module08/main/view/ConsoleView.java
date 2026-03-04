package view;

import model.Operation;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ConsoleView {
    private static final String PROMPT = "> ";
    private static final String ERROR = "Error: ";

    private final Scanner scanner;

    public ConsoleView() {
        this.scanner = new Scanner(System.in);
    }

    public void displayWelcome() {
        System.out.println("Welcome to the calculator");
        System.out.println("Allowed operations: " + Arrays.stream(Operation.values())
                .map(Operation::getSymbol)
                .collect(Collectors.joining(" ")));
        System.out.println("Type exit to close calculator.");
    }

    public void displayError(String message) {
        System.out.println(ERROR + message);
    }

    public void displayResult(Number result) {
        System.out.println(result);
    }

    public String getClientOperation() {
        System.out.print(PROMPT);
        return scanner.nextLine();
    }

    public void close() {
        System.out.println("Goodbye!");
    }
}