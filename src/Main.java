import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater( () -> {
            InputForm inputForm = new InputForm();
            inputForm.configure();
        });
    }
}