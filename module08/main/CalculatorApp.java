import controller.CalculatorController;
import controller.IController;
import model.Calculator;
import model.ICalculator;
import view.ConsoleView;
import view.IView;

public class CalculatorApp {

    public static void main(String[] args) {
        ICalculator model = new Calculator();
        IView view = new ConsoleView();
        IController controller = new CalculatorController(view, model);
        controller.run();
    }
}