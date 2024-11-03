
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Matrices matrices = new Matrices();
        int op;

        System.out.println("Operaciones de matrices");
        do {
            System.out.println("Seleccione la operación que quiera realizar");
            System.out.println("0) Para salir");
            System.out.println("1) Suma Diagonal");
            System.out.println("2) Encontrar el valor máximo");
            System.out.println("3) Sumar 2 Matrices");
            System.out.println("4) Multiplicación Escalar");
            System.out.println("5) Multiplicar Matrices");
            System.out.println("6) Transpuesta");
            op = scan.nextInt();

            if (op != 0) {
                switch (op) {
                    case 1:
                        System.out.println("Ingrese el tamaño n de la matriz (n x n):");
                        int n = scan.nextInt();
                        int[][] matrizDiagonal = leerMatriz(scan, n, n);
                        int sumaDiag = matrices.sumaDiagonal(matrizDiagonal);
                        System.out.println("La suma de la diagonal principal es: " + sumaDiag);
                        break;

                    case 2: 
                        System.out.println("Ingrese el tamaño de la matriz (filas):");
                        int filasMax = scan.nextInt();
                        System.out.println("Ingrese el tamaño de la matriz (columnas):");
                        int columnasMax = scan.nextInt();
                        int[][] matrizMax = leerMatriz(scan, filasMax, columnasMax);
                        int maximo = matrices.encuentraMaximo(matrizMax);
                        System.out.println("El valor máximo de la matriz es: " + maximo);
                        break;

                    case 3: // Sumar 2 matrices
                        System.out.println("Ingrese el tamaño de las matrices (filas):");
                        int filasSum = scan.nextInt();
                        System.out.println("Ingrese el tamaño de las matrices (columnas):");
                        int columnasSum = scan.nextInt();
                        System.out.println("Ingrese los valores de la primera matriz:");
                        int[][] matriz1Sum = leerMatriz(scan, filasSum, columnasSum);
                        System.out.println("Ingrese los valores de la segunda matriz:");
                        int[][] matriz2Sum = leerMatriz(scan, filasSum, columnasSum);
                        int[][] suma = matrices.sumaMatrices(matriz1Sum, matriz2Sum);
                        System.out.println("El resultado de la suma es:");
                        imprimirMatriz(suma);
                        break;

                    case 4: // Multiplicación escalar
                        System.out.println("Ingrese el tamaño de la matriz (filas):");
                        int filasEsc = scan.nextInt();
                        System.out.println("Ingrese el tamaño de la matriz (columnas):");
                        int columnasEsc = scan.nextInt();
                        int[][] matrizEsc = leerMatriz(scan, filasEsc, columnasEsc);
                        System.out.println("Ingrese el escalar:");
                        int escalar = scan.nextInt();
                        int[][] resultadoEscalar = matrices.multiplicarPorEscalar(matrizEsc, escalar);
                        System.out.println("El resultado de la multiplicación escalar es:");
                        imprimirMatriz(resultadoEscalar);
                        break;

                    case 5: // Multiplicar matrices
                        System.out.println("Ingrese el tamaño de la primera matriz (filas):");
                        int filas1Mul = scan.nextInt();
                        System.out.println("Ingrese el tamaño de la primera matriz (columnas):");
                        int columnas1Mul = scan.nextInt();
                        int[][] matriz1Mul = leerMatriz(scan, filas1Mul, columnas1Mul);
                        System.out.println("Ingrese el tamaño de la segunda matriz (filas):");
                        int filas2Mul = scan.nextInt();
                        System.out.println("Ingrese el tamaño de la segunda matriz (columnas):");
                        int columnas2Mul = scan.nextInt();
                        int[][] matriz2Mul = leerMatriz(scan, filas2Mul, columnas2Mul);
                        int[][] resultadoMultiplicacion = matrices.multiplicarMatrices(matriz1Mul, matriz2Mul);
                        if (resultadoMultiplicacion != null) {
                            System.out.println("El resultado de la multiplicación es:");
                            imprimirMatriz(resultadoMultiplicacion);
                        }
                        break;

                    case 6: // Transpuesta
                        System.out.println("Ingrese el tamaño de la matriz (filas):");
                        int filasTrans = scan.nextInt();
                         System.out.println("Ingrese el tamaño de la matriz (columnas):");
                        int columnasTrans = scan.nextInt();
                        int[][] matrizTrans = leerMatriz(scan, filasTrans, columnasTrans);
                        int[][] transpuesta = matrices.transponerMatriz(matrizTrans);
                        System.out.println("La transpuesta de la matriz es:");
                        imprimirMatriz(transpuesta);
                        break;

                    default:
                        System.out.println("Opción no válida.");
                        break;
                }
            }

        } while (op != 0);

        scan.close();
        System.out.println("Programa finalizado.");
    }

    // Método para leer una matriz desde el input del usuario
    public static int[][] leerMatriz(Scanner scan, int filas, int columnas) {
        int[][] matriz = new int[filas][columnas];
        System.out.println("Ingrese los valores de la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = scan.nextInt();
            }
        }
        return matriz;
    }

    // Método para imprimir una matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}