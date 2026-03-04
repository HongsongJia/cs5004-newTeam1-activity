package view;

public interface IView {

    void displayWelcome();

    String getClientOperation();

    void displayResult(Number result);

    void displayError(String message);

    void close();
}
