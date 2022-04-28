public class main {
    public static void main(String[] args) {
        //Condicional If
        int numeroif = -0;
        if (numeroif > 0) {
            System.out.println("El numero " + numeroif + " Es postivo");
        } else if (numeroif < 0) {
            System.out.println("El numero " + numeroif + " Es negativo");
        } else {
            System.out.println("El numero es 0");
        }
        System.out.println(" ");

        // Bucle while
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }
        System.out.println(" ");

        //Bucle Do while
        int numero_Do_while = 3;
        do {
            numero_Do_while++;
            System.out.println(numeroWhile);
        } while (numero_Do_while < 3);

        //bucle for

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("la variable numerofor vale " + numeroFor);
        }
        System.out.println(" ");

        // switch case
        String estacion = "verano";
        switch (estacion) {
            case "verano":
                System.out.println("Estamos en invierno");
                break;

            case "invierno":
                System.out.println("Estamos en invierno");
                break;

            case "otoño":
                System.out.println("Estamos en otoño");
                break;

            case "primavera":
                System.out.println("Estamos en primavera");
                break;

        }


    }
}
