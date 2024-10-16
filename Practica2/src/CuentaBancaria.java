public class CuentaBancaria {
    String nombre;
    String tipoCuenta;
    double saldoInicial;
    double monto;
    double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double Deposito() {
        this.saldo = this.saldoInicial + this.monto;
        return this.saldo;
    }

    public double Retiro() {
        this.saldo = this.saldoInicial - this.monto;
        return this.saldo;
    }
    public String EstadoCuenta(){
        if(this.saldo>1000){
            return "Suficiente";
        }else if(this.saldo<1000 && this.saldo>100){
            return "Minimo";
        }else{
            return "Critico";
        }
    }
    public String EstadoInicial(){
        if(this.saldoInicial >1000){
            return "Suficiente";
        }else if(this.saldoInicial <1000 && this.saldoInicial >100){
            return "Minimo";
        }else{
            return "Critico";
        }
    }

}
