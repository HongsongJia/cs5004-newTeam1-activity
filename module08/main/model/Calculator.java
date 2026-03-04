package model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Calculator implements ICalculator {

    @Override
    public Number invokeOperation(Operation operation, Number a, Number b) {
        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }
        return switch (operation) {
            case ADD -> add(a, b);
            case SUBTRACT -> subtract(a, b);
            case MULTIPLY -> multiply(a, b);
            case DIVIDE -> divide(a, b);
        };
    }

    @Override
    public Number add(Number a, Number b) {
        return a.doubleValue() + b.doubleValue();
    }

    @Override
    public Number subtract(Number a, Number b) {
        return a.doubleValue() - b.doubleValue();
    }

    @Override
    public Number multiply(Number a, Number b) {
        return a.doubleValue() * b.doubleValue();
    }

    @Override
    public Number divide(Number a, Number b) {
        double divisor = b.doubleValue();
        if (divisor == 0.0) {
            throw new ArithmeticException("Division by zero");
        }
        return a.doubleValue() / divisor;
    }

    @Override
    // 整坨代码最抽象的地方.
    public List<String> getOperationSymbols() {
        return Arrays.stream(Operation.values())
                .map(Operation::getSymbol)
                .collect(Collectors.toList());
    }

    @Override
    public Operation getOperation(String symbol) {
        return Operation.getOperation(symbol);
    }
}