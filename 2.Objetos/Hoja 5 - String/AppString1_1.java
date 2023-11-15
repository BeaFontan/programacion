import java.util.Scanner;

public class AppString1_1 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        String respuesta;


        System.out.println("Dime una frase");
        respuesta = teclado.nextLine();

        while (!respuesta.equals("Fin")) {
            
            if (respuesta.length() > 15) {

                System.out.println(respuesta);
            
            }

            System.out.println("Dime una frase");
            respuesta = teclado.nextLine();

        }
        
        teclado.close();

    }

}