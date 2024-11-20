public class Ej_4 {
    public static double media (int[] numeros) {
        int suma = 0;
        double media;

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        media = ((double) suma / (double) numeros.length);
        return media;
    }

    public static void main(String[] args) {
        int [] numeros = {5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        double media;

        media = media(numeros);

        System.out.println(media);
    }
}
