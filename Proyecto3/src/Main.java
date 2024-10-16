import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== REGISTRO DE VEHICULOS =====");

        Scanner input=new Scanner(System.in);
        Vehiculo carro = new Vehiculo();
        System.out.print("ingrese la marca del vehiculo: ");
        carro.setMarca(input.nextLine());
        System.out.print("ingrese el modelo del vehiculo: ");
        carro.setModelo(input.nextLine());
        System.out.print("ingrese el año de fabricacion: ");
        carro.setAnoFabricacion(input.nextInt());
        System.out.print("ingrese la velocidad actual (km/h): ");
        carro.setVelocidad(input.nextInt());

        System.out.println("Opciones:");
        System.out.println("1. Acelerar vehiculo");
        System.out.println("2. Frenar vehiculo");
        System.out.println("3. consultar la edad del vehiculo");
        System.out.println("4. Salir");

        Scanner i = new Scanner(System.in);
        System.out.print("Seleccione una opcion: ");
        int opcion = i.nextInt();
        if (opcion == 1) {
            System.out.println("El vehiculo esta acelerando");
        } else if (opcion == 2) {
            System.out.print("El vehiculo esta frenando: ");
        } else if (opcion == 3) {
            System.out.println("El vehiculo tiene " + carro.EdadAuto()+" años de antiguedad");
            System.out.println("Estado del vehiculo: " + carro.Estado());
        } else {
            System.out.println("Saliendo de la aplicacion...");
        }
    }
}