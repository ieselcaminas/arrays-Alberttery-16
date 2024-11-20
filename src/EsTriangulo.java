public class EsTriangulo {
    public static boolean esTriangulo(int palo1, int palo2, int palo3) {
        boolean triangulo;

        if (palo3 > palo1 + palo2) {
            triangulo = false;
        } else if (palo2 > palo1 + palo3) {
            triangulo = false;
        } else if (palo1 > palo2 + palo3) {
            triangulo = false;
        } else {
            triangulo = true;
        }
        return triangulo;

        /*
        return (palo3 > palo1 +palo2)
                || (palo2 > palo1 + palo3)
                || (palo1 > palo2 + palo3);
         */
    }
    public static void main(String[] args) {
        int palo1 = Utilidades.leerEntero("Longitud 1r palito");
        int palo2 = Utilidades.leerEntero("Longitud 2r palito");
        int palo3 = Utilidades.leerEntero("Longitud 3r palito");

        if (esTriangulo(palo1, palo2, palo3)) {
            System.out.println("Si puedo");
        }else{
            System.out.println("No puedo");
        }
    }
}
