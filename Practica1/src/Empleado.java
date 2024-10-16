public class Empleado {
    String nombre;
    int horaTrabajada;
    int horaExtra;
    double pagoHora;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoraTrabajada() {
        return horaTrabajada;
    }

    public void setHoraTrabajada(int horaTrabajada) {
        this.horaTrabajada = horaTrabajada;
    }

    public int getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(int horaExtra) {
        this.horaExtra = horaExtra;
    }

    public double getPagoHora() {
        return pagoHora;
    }

    public void setPagoHora(double pagoHora) {
        this.pagoHora = pagoHora;
    }
    public double Total(){
        return (this.horaTrabajada*this.pagoHora)+(((pagoHora*0.5)+pagoHora)*this.horaExtra);
    }
    public String categoria(){
        double total = this.Total();
        if(total>5000){
            return "ALTO";
        }else if(total<5000 && total>3000){
            return "MEDIO";
        }else{
            return "BAJO";
        }
    }

}
