import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {

        // Clase scanner permite que el usuario digite/escriba
        Scanner scanner = new Scanner(System.in);

        // Declaraciones y asignaciones
        String palabraScreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // Arreglos
        char[] letrasAdivinadas = new char[palabraScreta.length()];

        // Estructura de control ITERATIVA : Bucle
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
            System.out.print(letrasAdivinadas[i]);
        }

        // Estructura de control ITERATIVA : Bucle
        while (!palabraAdivinada && intentos < intentosMaximos) {
                                                        //Se usa cuando tenemos una palabra de chars(valueOf)
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " (" + palabraScreta.length() + " letras)"); 

            System.out.println("Introduce una letra, por favor");
            // scanner para solicitar una letra
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            // Estructura de control ITERATIVA : Bucle
            for (int i = 0; i < palabraScreta.length(); i++) {
                // Estructura de control condicional
                if (palabraScreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if(!letraCorrecta){
                intentos++;
                System.out.println("Incorrecto !!, Te quedan " + (intentosMaximos - intentos) + " intentos.");
            }

            if(String.valueOf(letrasAdivinadas).equals(palabraScreta)){
                palabraAdivinada = true;
                System.out.println("Felicidades !!!, has adivinado la palabra secreta: " + palabraScreta);
            }
        }

        if(!palabraAdivinada){
            System.out.println("Lo siento, no has adivinado la palabra secreta");
        }

        scanner.close();

    }

}
