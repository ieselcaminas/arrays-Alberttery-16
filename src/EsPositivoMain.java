public class EsPositivoMain {
    public static boolean esPositivo(int a){

        if (a >= 0) {
            return true;
        } else {
            return false;
        }

        //return a >= 0        "metodo  mas optimizado"
    }
    public static void main(String argv[]) {
        int  numero = Utilidades.leerEntero("Introduce un número entero:");

        if (numero >= 0) {
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número es negativo");
        }
    }
}
