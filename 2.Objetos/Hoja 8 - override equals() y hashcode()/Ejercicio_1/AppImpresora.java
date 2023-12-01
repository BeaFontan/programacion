package Ejercicio_1;

public class AppImpresora {

    public static void main(String[] args) {
        
        Impresora imp1 = new Impresora(15, "Model 1", 6);

        Impresora imp2 = new Impresora(15, "Modelo 3", 6);

        System.out.println(imp1.equals(imp2));



    }
}