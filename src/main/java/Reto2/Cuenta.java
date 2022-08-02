
package Reto2;


public class Cuenta {
 //Definicion de los atributos
    private long cuenta;
    private String fecha;
    private int tipo_cuenta;
    private double saldo;
    
       ///Definicion metodos
    
    //Constructor

    public Cuenta(long cuenta, String fecha, int tipo_cuenta, double saldo) {
        this.cuenta = cuenta;
        this.fecha = fecha;
        this.tipo_cuenta = tipo_cuenta;
        this.saldo = saldo;
    }

    public long getCuenta() {
        return cuenta;
    }

    public void setCuenta(long cuenta) {
        this.cuenta = cuenta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getTipo_cuenta() {
        return tipo_cuenta;
    }

    public void setTipo_cuenta(int tipo_cuenta) {
        this.tipo_cuenta = tipo_cuenta;
    }

    public double getSaldo_interes() {
        return saldo;
    }

    public void setSaldo_interes(double saldo) {
        this.saldo = saldo;
    }
    
    public double calcular_interes(){
         double valor_interes=0;
        switch(this.tipo_cuenta){
            case 1:
                valor_interes=saldo*0.015;
                break;
            case 2:
                valor_interes=saldo*0.017;
                break;
            case 3:
                valor_interes=saldo*0.016;
                break;
        }
        
        return valor_interes;
    }
    
}
