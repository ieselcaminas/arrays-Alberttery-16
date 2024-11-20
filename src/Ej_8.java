public class Ej_8 {
    public static int Positivos(int[] numeros){

        int suma = 0;
        for (int i = 0; i < numeros.length; i++){

            if (numeros [i] > 0){
                suma = suma + numeros[i]; //para sumar 1 en vez de todo el numero completo se cambiaria numeros[i] por "1"
            }
        }
        return suma;

    }
    public static int Negativos(int[] numeros){

        int resta = 0;
        for (int i = 0; i < numeros.length; i++){

            if (numeros [i] < 0){
                resta = resta + numeros[i];
            }
        }
        return resta;

    }
    public static void main(String[] args) {

        int [] numeros = {1, 23, 45, 76, -23, -45, -98};

        int suma = Positivos(numeros);
        int resta = Negativos(numeros);

        System.out.println("La numeración positiva es: " + suma);
        System.out.println("La numeración negativa es: " + resta);
    }
}

