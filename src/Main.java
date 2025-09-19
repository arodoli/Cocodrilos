import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Scanner para leer por teclado los nombres de los cocodrilos
        int cantidadCocodrilos = 0; // cantidad de cocodrilos que asisten a la fiesta
        String nombreCocodrilo = ""; // nombre de cada cocodrilo
        int cocodrilosLlorando = 0; // cantidad de cocodrilos que lloran

        // Mensaje de Bienvenida al programa
        System.out.printf("Bienvenido a cuentacocodrilos!\n");
        System.out.printf("Introduce cuantos cocodrilos vienen a esta fiesta >1 y <50:");

        // Recojo de teclado la cantidad de cocodrilos que llegan a la fiesta por teclado
        cantidadCocodrilos = Integer.parseInt(sc.nextLine());

        // Compruebo que la cantidad de cocodrilos sea correcta
        if(cantidadCocodrilos>1 && cantidadCocodrilos<50) {
            /* Interamos tantas veces como cocodrilos lleguen a la fiesta, haciendo
             * uso de las funciones auxiliares creadas para la funcionalidad de este ejercicio */
            for (int i = 1; i <= cantidadCocodrilos; i++) {
                nombreCocodrilo = sc.nextLine();
                if (!cuentaLetras(nombreCocodrilo) && compruebaCocodrilo(nombreCocodrilo)) {
                    cocodrilosLlorando++;
                    System.out.println(nombreCocodrilo + " Llora"); // Mostramos al vuelo si llora o no
                }
            }
            // Imprimimos por pantalla los cocodrilos que lloran:
            System.out.println("La cantidad de cocodrilos que lloran es de: " + cocodrilosLlorando);
        }else{
            System.out.println("La cantidad de cocodrilos es erronea");
        }
    }

    /**
     * devuelve true si tiene mas de 10 letras la palabra
     * @param palabra
     * @return
     */
    public static boolean cuentaLetras(String palabra){
            if (palabra.length()>10){
                return true;
            }
        return false;
    }

    /**
     * Devuelve true si la palabra tiene exactamente 2 vocales diferentes
     * No hace diferencia entre mayusculas y minusculas las considera por igual
     * @param palabra
     * @return
     */
    public static boolean compruebaCocodrilo(String palabra) {
        int cuentaVocal = 0;
            if(palabra.contains("a") || palabra.contains("A") || palabra.contains("á") || palabra.contains("Á")){
                cuentaVocal++;
            }
            if(palabra.contains("e") || palabra.contains("E") || palabra.contains("é") || palabra.contains("É")){
                cuentaVocal++;
            }
            if(palabra.contains("i") || palabra.contains("I") || palabra.contains("í") || palabra.contains("Í")){
                cuentaVocal++;
            }
            if(palabra.contains("o") || palabra.contains("O") || palabra.contains("ó") || palabra.contains("Ó")){
                cuentaVocal++;
            }
            if(palabra.contains("u") || palabra.contains("U") || palabra.contains("ú") || palabra.contains("Ú")){
                cuentaVocal++;
            }
        return cuentaVocal==2;
    }
}
