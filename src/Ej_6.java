public class Ej_6 {
    public static int maximo (int [] numeros) {
        int min = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < min) {
                min = numeros[i];
            }
        } return min;

    }

    public static void main(String[] args) {
        int [] numeros = {1, 1, 1, 1, 1, 1, 1, 1, 1, -1};
        int min;

        min = maximo(numeros);

        System.out.println(min);
    }
}
