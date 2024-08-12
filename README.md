# Juego de Ahorcado en JAVA

Se creó un juego de ahorcado en JAVA donde se debe ir colocando letra a letra en la consola y se tiene cierta cantidad de intentos. Si logra completar toda la palabra uno gana, caso contrario, se acaben los intentos uno pierde.

## ¿Qué herramientas se utilizarón?

### Clase Scanner
   `Scanner scanner = new Scanner(System.in);`
   
### Declaraciones y asignaciones
     String palabraScreta = "inteligencia";
     int intentosMaximos = 10;
     int intentos = 0;
     boolean palabraAdivinada = false;
     
### Arreglos
  `char[] letrasAdivinadas = new char[palabraScreta.length()];`
  
### Estructura de control: Iterativa (Bucle)
            while (!palabraAdivinada && intentos < intentosMaximos) {
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
        
### Clase String y sus métodos valueOf, charAt y length()
`String.valueOf(letrasAdivinadas)`

### Clase Character y su método toLowerCase
`char letra = Character.toLowerCase(scanner.next().charAt(0));`

### Estructura de control: condicional
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