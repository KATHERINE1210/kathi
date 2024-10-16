import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== CONTROL DE ASISTENCIA =====");
        Scanner input=new Scanner(System.in);
        Asistencia alumno = new Asistencia();
        System.out.print("ingrese el nombre del estudiante: ");
        alumno.setNombre(input.nextLine());
        System.out.print("ingrese la cantidad de dias asistidos: ");
        alumno.setDiasasistidos(input.nextDouble());

        System.out.println(" ");

        System.out.println("Calculando porcentaje de asistencia... ");

        System.out.println(" ");

        System.out.println("El porcentaje de asistencia es de: " + alumno.PorcentajeDias()+"%");
        System.out.println("Estado del estudiante: "+ alumno.EstadoEstudiante());
    }
}