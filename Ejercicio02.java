public class Ejercicio02 {

    public static void main(String[] args) {
        
        Coche miCoche = new Coche();
        miCoche.Agregarpuerta();
        miCoche.Agregarpuerta();
        miCoche.Agregarpuerta();
        miCoche.Agregarpuerta();

        System.out.println(miCoche.puertas);



    }
    
}

class Coche {

    public int puertas = 0;
    public void Agregarpuerta () {
        this.puertas ++;
    }
}
