public class InventarioProductos {
    public static int contarProductosAgotados(int[][] matriz) {
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 0) {
                    contador++;
                }
            }
        }
        return contador;
    }
    public static double promedioInventariobajo(int[][] matriz) {
        int suma = 0;
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 20) {
                    suma += matriz[i][j];
                    contador++;
                }
            }
        }
        if (contador == 0) {
            return 0; 
        }
        return (double) suma / contador;
    }
    public static void imprimirInventarioCritico(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] <= 5) {
                    System.out.println("Inventario crítico en [" + i + "][" + j + "]: " + matriz[i][j] + " unidades");
                }
            }
        }
    }
    public static int[] posicionMayorInventario(int[][] matriz) {
        int[] posicion = new int[2];
        int maxCantidad = Integer.MIN_VALUE;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maxCantidad) {
                    maxCantidad = matriz[i][j];
                    posicion[0] = i;
                    posicion[1] = j;
                }
            }
        }
        return posicion;
    }
    public static int totalInventario(int[][] matriz) {
        int total = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                total += matriz[i][j];
            }
        }
        return total;
    }
    public static void main(String[] args) {
        int[][] inventario = {
                {10, 5, 0, 25},
                {3, 18, 12, 1},
                {0, 8, 30, 7}
        };
        System.out.println("Productos agotados: " + contarProductosAgotados(inventario));
        System.out.println("Promedio de inventario bajo: " + promedioInventariobajo(inventario));
        System.out.println("Inventario crítico:");
        imprimirInventarioCritico(inventario);
        int[] posicionMayor = posicionMayorInventario(inventario);
        System.out.println("Posición del mayor inventario: [" + posicionMayor[0] + "][" + posicionMayor[1] + "]");
        System.out.println("Total de inventario: " + totalInventario(inventario));
    }
}