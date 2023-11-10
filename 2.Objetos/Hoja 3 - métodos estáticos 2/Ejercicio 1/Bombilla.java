public class Bombilla {

    private String nome;
    private int potencia;
    public static int potenciaTotal;

    //constructores
    public Bombilla(){
        nome = "Sin nome";
        potencia = 10;

    }

    public Bombilla(String nom, int potenc){

        nome = nom;
        potencia = potenc;
        potenciaTotal += potenc;

    }

    //métodos get y set

    public void setPotencia(int j){
        potencia = j;
    }

    public int getPotencia(){
        return potencia;
    }
    
    //funcion aumentar potencia, lo hago con void porque no quiero que me devuelva nada, solo almaceno el cálculo y luego muestro el valor de la potencia con el get de potencia
    public void aumentaPotencia(int h){
        int aumento = potencia + h;

        if(aumento > 35 && aumento < 2){
            potencia = 2;
        }
        else{
            potencia = aumento;
        }
       
    }

    //función para bajar potencia
    public void baixaPotencia(int h){
        int disminucion = potencia - h;

        if(disminucion > 35 && disminucion < 2){
            potencia = 2;
        }
        else{
            potencia = disminucion;
        }
        
    }

    public static int getValorPotenciaTotal(){
       
        return potenciaTotal;

    }

}