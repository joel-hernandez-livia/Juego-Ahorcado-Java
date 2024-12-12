import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        System.out.println("Juego del Ahorcado\n\n");
        Scanner scanner = new Scanner(System.in);
        String palabraSecreta = "inteligencia";
        char letra;
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
            System.out.print(letrasAdivinadas[i] + " ");
        }

        while (!palabraAdivinada && intentos < intentosMaximos) {
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas));
            System.out.println("introduce una letra");
            letra = Character.toLowerCase(scanner.next().charAt(0));
            boolean letraCorrecta = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }

            }
            if (!letraCorrecta) {
                intentos++;
                System.out.println("incorrecto, te quedan " + (intentosMaximos - intentos) + " intentos");
            }
            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("Felicidades, adivinaste la palabra " + palabraSecreta);
            }
        }

        if (!palabraAdivinada) {
            System.out.println("Game over");
        }

    }
}