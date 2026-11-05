import java.util.Scanner;

/*
* Interface Ordenamiento por intercambio (Bubble Sort)
* @author Ángel Nahúm Camarillo Solano
* @date 05 Noviembre 2026
*/

public class OrdenamientoIntercambio {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in); //Puse el scanner para que pueda leer los datos desde el teclado

        int n, i, temporal; //Use n para la cantidad de elementos, i para que pueda controlar los ciclos, y use temporal para que sirva como auxiliar para que se puedan intercambiar sin perder los datos.
        boolean intercambio; //Use el boolean para verificar si hubo intercambios

        System.out.print("Cantidad de elementos: "); //Solicita los elementos
        n = teclado.nextInt(); //Crea los elementos

        int[] tarjetas = new int[n]; //Hace el arreglo con el tamaño por el user

        for (i = 0; i < n; i++) { //Captura los elementos del arreglo
            System.out.print("Ingresa el elemento " + (i + 1) + ": ");
            tarjetas[i] = teclado.nextInt();
        }

        intercambio = true; //Si es verdadero, asume que habrá intercambios

        while (intercambio) { //Puse el ciclo while para que sirva como ciclo principal y se ejecute mientras exista almenos un intercambio durante una pasada

            intercambio = false; //Es para que reinicie la bandera de intercambio

            for (i = 0; i < n - 1; i++) { // Puse el ciclo for para que compare los elementos

                if (tarjetas[i] > tarjetas[i + 1]) { //Si el elemento actual es mayor que el que sigue, se va a realizar el intercambio

                    temporal = tarjetas[i]; //Se intercambian los valores usando una variable como auxiliar
                    tarjetas[i] = tarjetas[i + 1];
                    tarjetas[i + 1] = temporal;

                    intercambio = true; //Indica que si hubo un intercambio
                }
            }

            n--; //Esto lo usé para que después de cada pasada, el núm más grande quede al final del arreglo, y así ya no sea necesario volverlo a comparar otra vez
        }

        System.out.println("\nArreglo ordenado:"); //Imprime y muestra ya los elementos ordenados

        for (i = 0; i < tarjetas.length; i++) {
            System.out.print(tarjetas[i] + " ");
        }

        teclado.close(); //Es para que libere los recursos del scanner
    }
}