public class Animal {

    private int idade;
    private String nome;
    private boolean vivo;

    //Constructores
    public Animal(){
        idade = 0;
        nome = "desconocido";
        vivo = true;
    }

    public Animal(int idad, String nom, boolean viv){
        idade = idad;
        nome = nom;
        vivo = viv;
    }

    //Métodos

        public int getDados() {
        System.out.println("Nombre: " + nome + ", Edad: " + idade);
        return idade;
    }


    
    public void nace(){
        if (vivo) {
            vivo = true; // pongo el boolean a true, aunque ya está de base
            System.out.println("Benvido");
        }
    }

    public void morre() {
  
            vivo = false;
            System.out.println("Adiós");
        
    }



}





