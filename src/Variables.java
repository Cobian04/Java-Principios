public class Variables {

    // Método para sumar dos números
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // TIPOS DE DATOS PRIMITIVOS

        byte numeroPequeno = -128; // Rango: -128 a 127
        short numeroCorto = 32767; // Rango: -32768 a 32767
        int numeroEntero = 1; // Rango: -2,147,483,648 a 2,147,483,647
        long numeroGrande = 34057845; // Rango: -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
        float numeroFlotante = 10.1f; // Precision de 32 bits
        double numeroDoble = 10.20985923849; // Precision de 64 bits
        char letra = 'b'; // Valor único de un carácter
        boolean verdadero = true; // Solo tiene valores: true o false
        boolean falso = false;

        // Imprimir los valores
        System.out.println("Byte: " + numeroPequeno);
        System.out.println("Short: " + numeroCorto);
        System.out.println("Int: " + numeroEntero);
        System.out.println("Long: " + numeroGrande);
        System.out.println("Float: " + numeroFlotante);
        System.out.println("Double: " + numeroDoble);
        System.out.println("Char: " + letra);
        System.out.println("Boolean verdadero: " + verdadero);
        System.out.println("Boolean falso: " + falso);

        // TIPOS DE DATOS DE REFERENCIA
        String mensaje = "Esto es un String";
        String[] nombres = {"Juanito", "Perenganito", "Mauricio"};

        System.out.println(mensaje);
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // ENUMERACIONES (enum)
        enum Día { LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO }
        Día hoy = Día.LUNES;
        System.out.println("Hoy es: " + hoy);

        // Condicionales
        int edad = 12;
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("No eres mayor de edad");
        }

        // Bucles
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // Arreglos Unidimensionales
        int[] numeros = {0, 1, 2, 3, 4};
        for (int numero : numeros) {
            System.out.println(numero);
        }

        // Arreglos Bidimensionales
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Llamar al método sumar
        int resultado = sumar(5, 3);
        System.out.println("La suma es: " + resultado);

        try {
            int division = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero");
        }
        
    }
}
