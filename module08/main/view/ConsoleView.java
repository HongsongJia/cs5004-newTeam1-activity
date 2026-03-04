package view;

import java.util.Scanner;

public class ConsoleView implements IView {

    private static final String PROMPT = "> ";
    private static final String ERROR_PREFIX = "Error: ";

    private final Scanner scanner;

    public ConsoleView() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void displayWelcome() {
        System.out.println("Prefix Calculator");
        System.out.println("Enter expressions like: + 1 2  or  * + 1 2 3");
        System.out.println("Type 'exit' to quit.");
    }

    @Override
    public String getClientOperation() {
        System.out.print(PROMPT);
        if (!scanner.hasNextLine()) {
            return "exit";
        }
        return scanner.nextLine().trim();
    }

    @Override
    public void displayResult(Number result) {
        System.out.println(result);
    }

    @Override
    public void displayError(String message) {
        System.out.println(ERROR_PREFIX + message);
    }

    @Override
    public void close() {
        scanner.close();
    }
}