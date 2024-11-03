/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Matrices {

    // 1. Suma diagonal principal
    public int sumaDiagonal(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][i]; // Suma los elementos de la diagonal principal
        }
        return suma;
    }

    // 2. Encuentra el valor máximo en una matriz
    public int encuentraMaximo(int[][] matriz) {
        int maximo = matriz[0][0]; // Inicializa con el primer elemento de la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maximo) {
                    maximo = matriz[i][j]; // Actualiza el máximo si encuentra un mayor valor
                }
            }
        }
        return maximo;
    }

    // 3. Suma de dos matrices
    public int[][] sumaMatrices(int[][] matriz1, int[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] resultado = new int[filas][columnas];
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j]; // Suma los elementos
            }
        }
        return resultado;
    }

    // 4. Multiplicar una matriz por un escalar
    public int[][] multiplicarPorEscalar(int[][] matriz, int escalar) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] resultado = new int[filas][columnas];
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz[i][j] * escalar; // Multiplica cada elemento por el escalar
            }
        }
        return resultado;
    }

    // 5. Multiplicación de dos matrices
    public int[][] multiplicarMatrices(int[][] matriz1, int[][] matriz2) {
        int filas1 = matriz1.length;
        int columnas1 = matriz1[0].length;
        int filas2 = matriz2.length;
        int columnas2 = matriz2[0].length;
        
        // Verificar que las matrices sean compatibles (columnas1 == filas2)
        if (columnas1 != filas2) {
            System.out.println("Error: Las matrices no se pueden multiplicar.");
            return null; // Retornar null si las matrices no son compatibles
        }
        
        int[][] resultado = new int[filas1][columnas2];
        
        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas2; j++) {
                for (int k = 0; k < columnas1; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j]; // Realiza la multiplicación
                }
            }
        }
        return resultado;
    }


    public int[][] transponerMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] transpuesta = new int[columnas][filas];
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = matriz[i][j]; 
            }
        }
        return transpuesta;
    }
}
 
