public class Cilindro {

    
private double radio;
private double altura;
public static final double PI = 3.1416;

//constructores
public Cilindro(){
    radio = 0;
    altura = 0;
}

public Cilindro(double radio, double altura){
    this.radio = radio;
    this.altura = altura;
}

//getters
public double getAltura() {
    return altura;
}

public double getRadio() {
    return radio;
}

//setters
public void setRadio(double radio) {
    this.radio = radio;
}

public void setAltura(double altura) {
    this.altura = altura;
}


//métodos estáticos
public static double calcArea(Cilindro cil){
    double area;

    area = 2* PI * (cil.radio+cil.altura);

    return area;

}

public static double calVolume(Cilindro cil){
    double volume;

    volume = PI * (cil.radio*cil.radio) * cil.altura;
    
    return volume;


}

//métodos non estáticos

public double calculaArea(){

    return Cilindro.calcArea();

}

public double calculaVolume(){

    return Cilindro.calVolume();
}


}