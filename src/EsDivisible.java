import java.util.Scanner;

public class EsDivisible {
    public static boolean esDivisible(int dividendo, int divisor) {
        if (dividendo % divisor == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividendo = Utilidades.leerEntero("Introduce el dividendo:");
        int divisor = Utilidades.leerEntero("Introduce el divisor:");

        System.out.println(esDivisible(dividendo, divisor));
    }
}
