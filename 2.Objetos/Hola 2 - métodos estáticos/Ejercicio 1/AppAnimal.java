public class AppAnimal {

    public static void main(String[] args) {
        

            Animal animal1 = new Animal();
            Animal animal2 = new Animal(2, "Perro", true);
            Animal animal3 = new Animal(18, "Gato", true);
    
            animal1.nace();
            animal1.getDados();
            animal1.morre();
    
            animal2.nace();
            animal2.getDados();
            animal2.morre();
    
            animal3.nace();
            animal3.getDados();
            animal3.morre();
        
    }
}