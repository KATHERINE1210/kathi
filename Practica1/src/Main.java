import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== GESTION DE EMPLEADOS =====");

        Scanner input=new Scanner(System.in);
        Empleado pago = new Empleado();
        System.out.print("ingrese el nombre del empleado: ");
        pago.setNombre(input.nextLine());
        System.out.print("ingrese las horas trabajadas: ");
        pago.setHoraTrabajada(input.nextInt());
        System.out.print("ingrese las horas extras trabajadas: ");
        pago.setHoraExtra(input.nextInt());
        System.out.print("ingrese el pago por hora:");
        pago.setPagoHora(input.nextDouble());

        System.out.println("Calculando salario... ");

        System.out.println("El salario total de "+ pago.getNombre()+" es de: "+ pago.Total());
        System.out.println("La categoria salarial es: "+ pago.categoria());
    }
}