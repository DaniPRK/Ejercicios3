public class Main {

    public static void main(String[] args) {

// Primera parte Suma
        int resultado;
        resultado = Suma(15, 30, 6);

        System.out.println(resultado);

// Segunda parte Incremento Coche
        Coche miCoche = new Coche();

// Incremento de puertas segunda parte

        miCoche.IncrementarPuertas();

System.out.println(miCoche.numeroPuertas);
    }

// Primera parte funci�n suma
    public static int Suma(int a, int b, int c) {
        return a + b + c;
    }

}

// Clase Coche y n�mero de puertas segunda parte
class Coche{

// N�mero de puertas coche
    public int numeroPuertas = 3;

// Funci�n incremento de puertas
    public void IncrementarPuertas(){this.numeroPuertas++;}
}