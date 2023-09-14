package controller;
import view.NumeroView;
import model.NumeroModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumeroController {
    private NumeroModel modelo;
    private NumeroView vista;

    public NumeroController(NumeroModel modelo, NumeroView vista) {
        this.modelo = modelo;
        this.vista = vista;

        vista.agregarActionListener(new TranslateListener());
    }

    class TranslateListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int numero = vista.getNumero();
            System.out.println("Controlador: Solicitada la traducción de " + numero);
            String resultado = modelo.obtenerNumeroEnIngles(numero);
            System.out.println("Controlador: Resultado de la traducción: " + resultado);
            vista.mostrarResultado(resultado);
        }
    }
}
