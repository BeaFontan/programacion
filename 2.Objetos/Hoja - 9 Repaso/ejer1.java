import java.util.Scanner;

public class ejer1 {

    public static void main(String[] args) {
        
    int[] arrayEnteros = new int[6];
    Scanner entrada = new Scanner(System.in);
    String respuesta;


    System.out.println("Pulsa a para introducir los valores");
    System.out.println("Pulsa b para Multiplicar todos los valores por 3");
    System.out.println("Pulsa c para Calcular la media de los valores");
    System.out.println("Pulsa d para Intercambiar los números 2 a 2");
    System.out.println("Pulsa e para Imprimir el array");
    System.out.println("Pulsa f para Almacenar a partir de la posición 3ª el producto de los elementos anteriores");
    respuesta = entrada.nextLine();

    while (true) {
        
        switch (respuesta) {
            case "a":
                
                System.out.println("Dime os 6 números enteiros");
                
                for (int i = 0; i < arrayEnteros.length; i++) {
                    arrayEnteros[i] = entrada.nextInt();
                }

                break;

            case "b":

                for (int i = 0; i < arrayEnteros.length; i++) {
                    arrayEnteros[i] = arrayEnteros[i] * 3;
           
                }

                for (int valor : arrayEnteros) {
                    System.out.println(valor);
                }                

                break;

            case "c":
                int suma = 0;
                int media = 0; //Ojo, debería están en double.

                for (int i = 0; i < arrayEnteros.length; i++) {
                    suma = suma + arrayEnteros[i];
                    media = suma / arrayEnteros.length;
                }


                System.out.println(media);


                break;

            case "d":
                                                        //que valla de dos en dos
                for (int i = 0; i < arrayEnteros.length; i+=2) { //le digo que valla de 2 en dos, sino está cambiando todo el rato, en cada una

                    int guardarPosicion = arrayEnteros[i];//guardo la primera posición

                    arrayEnteros[i] = arrayEnteros[i+1];//resto uno, para que se ponga de primero

                    arrayEnteros[i+1] = guardarPosicion;

                }

                for (int valor : arrayEnteros) {
                    System.out.println(valor);
                }


                break;

            case "e":

                for (int valor : arrayEnteros) {
                    System.out.println(valor);
                }

                break;

            case "f":



                break;

        }

        System.out.println("Pulsa a para introducir los valores");
        System.out.println("Pulsa b para Multiplicar todos los valores por 3");
        System.out.println("Pulsa c para Calcular la media de los valores");
        System.out.println("Pulsa d para Intercambiar los números 2 a 2");
        System.out.println("Pulsa e para Imprimir el array");
        System.out.println("Pulsa f para Almacenar a partir de la posición 3ª el producto de los elementos anteriores");
        respuesta = entrada.nextLine();
    }
        
    }
}