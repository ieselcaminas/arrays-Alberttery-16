public class Ej_2 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        System.out.println("Array invertido:");

        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " > ");
        }
    }
}
