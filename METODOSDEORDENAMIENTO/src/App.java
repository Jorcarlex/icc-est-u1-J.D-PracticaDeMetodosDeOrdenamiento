import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        MetodosOrder metodos = new MetodosOrder();

        int opcion;
        int[] arregloNumeros = new int[0];

        do {
            try {
                System.out.println("\nMenu Principal");
                System.out.println("1. Ingrese un arreglo");
                System.out.println("2. Ordenar Arreglo");
                System.out.println("0. Salir");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el tamaño de su arreglo");
                        int tamano = scanner.nextInt();
                        arregloNumeros = new int[tamano];

                        for (int i = 0; i < arregloNumeros.length; i++) {
                            System.out.println("Ingrese el valor para " + (i + 1) + ": ");
                            arregloNumeros[i] = scanner.nextInt();
                        }
                        metodos.imprime(arregloNumeros);

                        break;
                    case 2:
                        /// Sub Menu para escoger el metodo
                        mostrarSubMenuMetodos(scanner, metodos, arregloNumeros);

                        break;
                    case 0:
                        System.out.println("Saliendo del programa... \nAdios");
                        System.exit(0); 
                        break;
                        
                    default:
                        System.out.println("Opcion no valida, ingrese una opcion valida");

                }
            } catch (Exception e) {
                System.out.println("No se puede ingresar letras u signos, ingrese una opcion valida");
                scanner.next();
            }

        } while (true);

    }

    /**
     * @param scanner
     * @param metodos
     * @param arreglo
     */
    public static void mostrarSubMenuMetodos(Scanner scanner, MetodosOrder metodos, int[] arreglo) {
        int opcionMetodo;
        do {

            try {

            System.out.println("\nEscoja un metodo de ordenamiento");
            System.out.println("1. Metodo Burbuja");
            System.out.println("2. Metodo Seleccion");
            System.out.println("3. Metodo Insercion");
            System.out.println("4. Metodo Burbuja Mejorado");
            System.out.println("0. Regresar al menu principal");

            opcionMetodo = scanner.nextInt();

            switch (opcionMetodo) {
                case 1:
                    // ingrese A -> Para Logs y B -> sin logs
                    /// String opcionLog
                    /// Boolean cond
                    /// if opcion.equals(A) cond -> true
                    /// else cond -> false
                    /// metodos.sortByBubble(arreglo, cond);

                    int opcionLogAscDes;
                    System.out.println("\nEscoja ascendente o desendente");
                    System.out.println("1. ascendente");
                    System.out.println("2. desendente");

                    opcionLogAscDes = scanner.nextInt();
                    Boolean LogAscDes;

                    switch (opcionLogAscDes) {
                        case 1:
                            LogAscDes = true;
                            break;
                        case 2:
                            LogAscDes = false;
                            break;
                        default:
                            System.out.println("Opcion no valida. Por defecto opcion 1: ");
                            LogAscDes = true;
                    }

                    int opcionLog;
                    System.out.println("\nQuiere ver cada paso");
                    System.out.println("1. Si");
                    System.out.println("2. No");

                    opcionLog = scanner.nextInt();
                    Boolean logs;

                    switch (opcionLog) {
                        case 1:
                            logs = true;
                            break;
                        case 2:
                            logs = false;
                            break;
                        default:
                            System.out.println("Opcion no valida. Por defecto opcion 1: ");
                            logs = true;
                    }

                    int[] arregloOrdenado = metodos.sortByBubble(arreglo, logs, LogAscDes);
                    System.out.println("El arreglo ordenado por burbuja es: ");
                    metodos.imprime(arregloOrdenado);

                    break;

                case 2:

                    int opcionLogAscDes2;
                    System.out.println("\nEscoja ascendente o desendente");
                    System.out.println("1. ascendente");
                    System.out.println("2. desendente");

                    opcionLogAscDes2 = scanner.nextInt();
                    Boolean LogAscDes2;

                    switch (opcionLogAscDes2) {
                        case 1:
                            LogAscDes2 = true;
                            break;
                        case 2:
                            LogAscDes2 = false;
                            break;
                        default:
                            System.out.println("Opcion no valida. Por defecto opcion 1:: ");
                            LogAscDes2 = true;
                            break;
                    }

                    System.out.println("\nQuiere ver cada paso");
                    System.out.println("1. Si");
                    System.out.println("2. No");

                    int opcionLog2 = scanner.nextInt();
                    Boolean logs2;

                    switch (opcionLog2) {
                        case 1:
                            logs2 = true;
                            break;
                        case 2:
                            logs2 = false;
                            break;
                        default:
                            System.out.println("Opcion no valida. Por defecto opcion 1:: ");
                            logs2 = true;
                            break;
                    }

                    int[] arregloSeleccion = metodos.metodoSeleccion(arreglo, logs2, LogAscDes2);
                    System.out.println();
                    System.out.println("El arreglo ordenado por el método de seleccion es:");
                    metodos.imprime(arregloSeleccion);

                    break;

                case 3:

                    int opcionLogAscDes3;
                    System.out.println("\nEscoja ascendente o desendente");
                    System.out.println("1. ascendente");
                    System.out.println("2. desendente");

                    opcionLogAscDes3 = scanner.nextInt();
                    Boolean LogAscDes3;

                    switch (opcionLogAscDes3) {
                        case 1:
                            LogAscDes3 = true;
                            break;
                        case 2:
                            LogAscDes3 = false;
                            break;
                        default:
                            System.out.println("Opcion no valida. Por defecto opcion 1:: ");
                            LogAscDes3 = true;
                            break;
                    }

                    System.out.println("\nQuiere ver cada paso");
                    System.out.println("1. Si");
                    System.out.println("2. No");

                    int opcionLog3 = scanner.nextInt();
                    Boolean logs3;
                    switch (opcionLog3) {
                        case 1:
                            logs3 = true;
                            break;
                        case 2:
                            logs3 = false;
                            break;

                        default:
                            System.out.println("Opcion no valida. Por defecto opcion 1: ");
                            logs3 = true;
                    }

                    int[] arregloOrden1 = metodos.metodoInsercion(arreglo, logs3, LogAscDes3);

                    System.out.println();
                    System.out.println("El arreglo ordenado por el método de inserción es:");
                    metodos.imprime(arregloOrden1);
                    break;

                case 4:

                    int opcionLogAscDes4;
                    System.out.println("\nEscoja ascendente o desendente");
                    System.out.println("1. ascendente");
                    System.out.println("2. desendente");

                    opcionLogAscDes4 = scanner.nextInt();
                    Boolean LogAscDes4;

                    switch (opcionLogAscDes4) {
                        case 1:
                            LogAscDes4 = true;
                            break;
                        case 2:
                            LogAscDes4 = false;
                            break;
                        default:
                            System.out.println("Opcion no valida. Por defecto opcion 1:: ");
                            LogAscDes4 = true;
                            break;
                    }

                    System.out.println("\nQuiere ver cada paso");
                    System.out.println("1. Si");
                    System.out.println("2. No");

                    int opcionLog4 = scanner.nextInt();
                    Boolean logs4;

                    switch (opcionLog4) {
                        case 1:
                            logs4 = true;
                            break;
                        case 2:
                            logs4 = false;
                            break;
                        default:
                            System.out.println("Opcion no valida. Por defecto opcion 1: ");
                            logs4 = true;
                    }
                    int[] arregloOrden4 = metodos.MetodoBurbujaMejorado(arreglo, logs4, LogAscDes4);

                    System.out.println("\nEl arreglo ordenado por el método de burbuja mejorado es:");
                    metodos.imprime(arregloOrden4);

                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcion no valida. Elija nuevamente.");
                    break;
            }
            } catch (Exception e) {
                System.out.println("No se puede ingresar letras u signos, ingrese una opcion valida");
                scanner.next();
            }
            
        } while (true);
    }
}
