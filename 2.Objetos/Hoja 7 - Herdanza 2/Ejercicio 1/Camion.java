public class Camion extends Vehiculo{

    private int precioDia;
    private int diaInicio;
    private int diaFin;

    private static int numCamions=0;
    private static int numCamionsAlugados = 0;


    public Camion(String matricula, boolean alugado, int precioDia, int diaInicio, int diaFin) {
        super(matricula, alugado);
        this.precioDia = precioDia;
        this.diaInicio = diaInicio;
        this.diaFin = diaFin;

    }


    public int getPrecioDia() {
        return precioDia;
    }


    public void setPrecioDia(int precioDia) {
        this.precioDia = precioDia;
    }


    public int getDiaInicio() {
        return diaInicio;
    }


    public void setDiaInicio(int diaInicio) {
        this.diaInicio = diaInicio;
    }


    public int getDiaFin() {
        return diaFin;
    }


    public void setDiaFin(int diaFin) {
        this.diaFin = diaFin;
    }


    //get y set de los estáticos

    public static int getNumCamions() {
        return numCamions;
    }


    public static void setNumCamions(int numCamions) {
        Camion.numCamions = numCamions;
    }


    public static int getNumCamionsAlugados() {
        return numCamionsAlugados;
    }


    public static void setNumCamionsAlugados(int numCamionsAlugados) {
        Camion.numCamionsAlugados = numCamionsAlugados;
    }



    //metodos
    public void alugarCamion(){
        if (getAlugado() == true) {

            System.out.println("O camion está alugado");
            
        }
        else{
            System.out.println("O camión está disponible");
            setAlugado(true);
            numCamionsAlugados++;

        }
    }

////////////me quedé aquí


}