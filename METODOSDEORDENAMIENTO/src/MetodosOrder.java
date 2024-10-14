public class MetodosOrder {

    public int[] sortByBubble(int[] arreglo, boolean logs, boolean LogAscDes) {

        int tamano = arreglo.length;

        for (int i = 0; i < tamano; i++) {
            if (logs) {
                System.out.println("\nPasada numero " + i);
            }
            for (int j = i + 1; j < tamano; j++) {
                if (logs) {
                    System.out.println("i= " + arreglo[i] + " j= " + arreglo[j]);
                }
                if ((LogAscDes && arreglo[i] > arreglo[j]) || (!LogAscDes && arreglo[i] < arreglo[j])) {
                    // Intercambiamos los elementos.
                    if (logs) {
                        System.out.println("Si hay intercambio");
                    } 

                    int temporal = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temporal;
                    if (logs) {
                        System.out.print(" ");
                        imprime(arreglo);
                    }
                }
            }
        }
        return arreglo;
    }

    public int[] metodoSeleccion(int[] arreglo, boolean logs, boolean LogAscDes) {
        int tamano = arreglo.length;

        for (int i = 0; i < tamano - 1; i++) {
            int num_menor = i;
            if (logs) {
                System.out.println("\nPasada numero " + (i + 1) + ":");
                System.out.println("\npos i :"+num_menor);
            }       

            for (int j = i + 1; j < tamano; j++)
                if (LogAscDes && arreglo[j] < arreglo[num_menor]) {
                    num_menor = j;
                } else if (!LogAscDes && arreglo[j] > arreglo[num_menor]) {
                    num_menor = j;
                }

            if (num_menor != i) {
                int temporal = arreglo[i];
                arreglo[i] = arreglo[num_menor];
                arreglo[num_menor] = temporal;
            }
            if (logs) {
                System.out.println("Si hay intercambio");
                System.out.println("Nuevo arreglo: ");
                for (int j = 0; j < tamano; j++) {
                    System.out.print(arreglo[j] + " ");
                }
                System.out.println();
            }
        }

        return arreglo;
    }

    public int[] metodoInsercion(int[] arreglo, boolean logs, boolean LogAscDes) {
        int tamano = arreglo.length;

        for (int i = 1; i < tamano; i++) {
            int elementoActual = arreglo[i];
            int j = i - 1;
            if (logs) {
                System.out.println("\nInteracion " + i + ":");
                System.out.println("  Elemento actual:  " + elementoActual);
            }
            while (j >= 0
                    && ((LogAscDes && arreglo[j] > elementoActual) || (!LogAscDes && arreglo[j] < elementoActual))) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = elementoActual;
            System.out.println("Si hay intercambio");

            // Imprimir el estado del arreglo despues de cada paso
            if (logs) {

                for (int k = 0; k < tamano; k++) {
                    System.out.print(arreglo[k] + " ");
                }
                System.out.println();
            }
        }
        return arreglo;
    }

    public int[] MetodoBurbujaMejorado(int[] arreglo, boolean logs, boolean LogAscDes) {
        int tamano = arreglo.length;
        boolean intercambio = true;
    
        for (int i = 0; i < tamano - 1 && intercambio; i++) {
            intercambio = false;
            for (int j = 0; j < tamano - i - 1; j++) {
                if (logs) {
                    System.out.println("\nInteracion" + (i + 1) + ";");
                    System.out.println("Elemento en la posicion " + j + ":" + arreglo[j]);
                }
                if ((LogAscDes && arreglo[j] > arreglo[j + 1]) || (!LogAscDes && arreglo[j] < arreglo[j + 1])) {
                    int temporal = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;
                    intercambio = true;
                }
            }
            if (logs) {

                System.out.println("El arreglo despues de la interacion " + (i + 1) + " es:");
                System.out.println("Si hay intercambio");
                
                for (int j = 0; j < tamano; j++) {
                    System.out.print(arreglo[j] + " ");
                }
                System.out.println();
            }
        }
        return arreglo;
    }

    /* 4. Método que imprime un arreglo */
    public void imprime(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}
