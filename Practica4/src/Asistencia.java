public class Asistencia {
    String nombre;
    double diasasistidos;

    public double getDiasasistidos() {
        return diasasistidos;
    }

    public void setDiasasistidos(double diasasistidos) {
        this.diasasistidos = diasasistidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double PorcentajeDias(){
        return (this.diasasistidos*100)/30;
    }
    public String EstadoEstudiante(){
        double asistencia=this.PorcentajeDias();
        if(asistencia > 75){
            return "APROBADO";
        }else if(asistencia < 75 && asistencia > 50){
            return "CONDICIONAL";
        }else{
            return "DESAPROBADO";
        }
    }

}
