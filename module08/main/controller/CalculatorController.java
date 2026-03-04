package controller;

import model.ICalculator;
import model.Operation;
import view.IView;

import java.util.Stack;

public class CalculatorController implements IController {

    private final IView view;
    private final ICalculator model;

    public CalculatorController(IView view, ICalculator model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void run() {
        view.displayWelcome();
        while (true) {
            String operation = view.getClientOperation();
            if (operation.equalsIgnoreCase("exit")) {
                break;
            }
            if (operation.isBlank()) {
                continue;
            }

            try {
                Number result = processOperation(operation);
                view.displayResult(result);
            } catch (Exception e) {
                view.displayError(e.getMessage());
            }
        }
        view.close();
    }

    private Number tryParseNumber(String token) {
        try {
            return Double.parseDouble(token);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    // Prefix expression evaluator: tokens read right-to-left using a stack
    private Number processOperation(String expression) {
        Stack<Number> numbers = new Stack<>();
        String[] tokens = expression.trim().split("\\s+");

        for (int i = tokens.length - 1; i >= 0; i--) {
            String token = tokens[i];
            if (token.isEmpty()) continue;

            Number n = tryParseNumber(token);
            if (n != null) {
                numbers.push(n);
                continue;
            }

            Operation op = Operation.getOperation(token);
            if (op == null) {
                throw new IllegalArgumentException("Invalid operation: " + token);
            }
            if (numbers.size() < 2) {
                throw new IllegalArgumentException("Not enough numbers for operation: " + token);
            }

            Number a = numbers.pop();
            Number b = numbers.pop();
            Number result = model.invokeOperation(op, a, b);
            numbers.push(result);
        }

        if (numbers.size() != 1) {
            throw new IllegalArgumentException("Invalid expression");
        }
        return numbers.pop();
    }
}