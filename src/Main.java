import controller.NumeroController;
import model.NumeroModel;
import view.NumeroView;

public class Main {
    public static void main(String[] args) {
        NumeroModel modelo = new NumeroModel();
        NumeroView vista = new NumeroView();
        NumeroController controlador = new NumeroController(modelo, vista);

        vista.mostrar();
    }
}
