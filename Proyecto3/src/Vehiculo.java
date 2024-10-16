import java.time.LocalDate;

public class Vehiculo {
    String marca;
    String modelo;
    int anoFabricacion;
    int velocidad;
    int year= LocalDate.now().getYear();

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacion() {
        return anoFabricacion;
    }

    public void setAnoFabricacion(int anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public int EdadAuto(){
        return (this.year-this.anoFabricacion);
    }
    public String Estado() {
        int edad = this.EdadAuto();
        if (edad > 10) {
            return "Antiguo";
        } else if (edad < 10 && edad > 3) {
            return "Semi-Nuevo";
        } else {
            return "Nuevo";
        }
    }

}
