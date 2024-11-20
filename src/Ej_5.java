public class Ej_5 {
    public static int maximo (int [] numeros) {
        int max = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
        } return max;

    }

    public static void main(String[] args) {
        int [] numeros = {500, 82, 80, 56, 42, 6, 3, 7, 902, 990};
        int max;

        max = maximo(numeros);

        System.out.println(max);
    }
}

