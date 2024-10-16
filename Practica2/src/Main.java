import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== SISTEMA DE GESTION DE BANCOS =====");
        Scanner input = new Scanner(System.in);
        CuentaBancaria banco = new CuentaBancaria();
        System.out.print("ingrese el nombre del titular de la cuenta: ");
        banco.setNombre(input.nextLine());
        System.out.print("ingrese el saldo inicial de la cuenta: ");
        banco.setSaldoInicial(input.nextDouble());
        System.out.print("ingrese el tipo de cuenta (Ahorros/Corriente): ");
        banco.setTipoCuenta(input.nextLine());

        System.out.println("Opciones:");
        System.out.println("1. Depositar dinero");
        System.out.println("2. Retirar dinero");
        System.out.println("3. Conultar saldo");
        System.out.println("4. Salir");

        Scanner i = new Scanner(System.in);
        System.out.print("Seleccione una opcion: ");
        int opcion = i.nextInt();

        if (opcion == 1) {
            Scanner s = new Scanner(System.in);
            System.out.println("Ingrese el monto a depositar: ");
            banco.setMonto(s.nextDouble());
            System.out.println("Saldo actualizado: " + banco.Deposito());
            System.out.println("Estado de la cuenta: " + banco.EstadoCuenta());
        } else if (opcion == 2) {
            Scanner s = new Scanner(System.in);
            System.out.print("Ingrese el monto a retirar: ");
            banco.setMonto(s.nextDouble());
            System.out.println("Saldo actualizado: " + banco.Retiro());
            System.out.println("Estado de la cuenta: " + banco.EstadoCuenta());
        } else if (opcion == 3) {
            System.out.println("Saldo de cuenta: " + banco.getSaldoInicial());
            System.out.println("Estado de la cuenta: " + banco.EstadoInicial());
        } else {
            System.out.println("Usted esta saliendo de la aplicacion...");
        }
    }
}