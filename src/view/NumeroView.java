package view;

import javax.swing.*;
import java.awt.event.ActionListener;

public class NumeroView {
    private JFrame frame;
    private JTextField numeroInput;
    private JLabel resultadoLabel;
    private JButton translateButton;

    public NumeroView() {
        frame = new JFrame("Número a Inglés");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(null);

        numeroInput = new JTextField();
        numeroInput.setBounds(30, 20, 100, 30);

        translateButton = new JButton("Translate");
        translateButton.setBounds(140, 20, 100, 30);

        resultadoLabel = new JLabel("");
        resultadoLabel.setBounds(30, 60, 210, 30);

        frame.add(numeroInput);
        frame.add(translateButton);
        frame.add(resultadoLabel);
    }

    public int getNumero() {
        return Integer.parseInt(numeroInput.getText());
    }

    public void mostrarResultado(String resultado) {
        resultadoLabel.setText("Resultado: " + resultado);
    }

    public void agregarActionListener(ActionListener listener) {
        translateButton.addActionListener(listener);
    }

    public void mostrar() {
        frame.setVisible(true);
    }
}
