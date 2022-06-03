public class App {
    public static void main(String[] args) throws Exception {
        int total;
        total = sumar(10, 20, 30);
        System.out.println("El resultado es: " + total);

        Coche micoche = new Coche();
        micoche.AgregarPuerta();
        System.out.println("El coche tiene: " + micoche.puertas);
    }

    public static int sumar (int var1, int var2, int var3){
        return var1 + var2 + var3;
    }
}

class Coche {
    public int puertas = 0;

    public void AgregarPuerta() {
        this.puertas++;
    }
}