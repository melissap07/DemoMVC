package Model;

public class NumeroModel {
    private String[] numerosEnIngles = {
            "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
    };

    public String obtenerNumeroEnIngles(int numero) {
        if (numero >= 1 && numero <= 9) {
            String numeroEnIngles = numerosEnIngles[numero - 1];
            System.out.println("Modelo: Traduciendo " + numero + " a " + numeroEnIngles);
            return numeroEnIngles;
        } else {
            System.out.println("Modelo: Número fuera de rango");
            return "Número fuera de rango";
        }
    }
}
