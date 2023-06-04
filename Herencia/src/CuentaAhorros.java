package cuentas;

public class CuentaAhorros extends Cuenta{
    private boolean activa;
    public CuentaAhorros(float saldo, float tasa) {
        super(saldo, tasa);
        if (saldo < 10000){
            activa = false;
        }else {
            activa = true;
        }
    }
    public void retirar(float monto) {
        if (activa) {
            super.retirar(monto);
        }
    }
    public void consignar(float monto) {
        if (activa) {
            super.consignar(monto);
        }
    }
    public void extracto_mensual() {
        if (num_retiros > 4) {
            comision_mensual += (num_retiros - 4) * 1000;
        }
        super.extracto_mensual();
        if ( saldo < 10000 ) {
            activa = false;
        }
    }
    public void imprimir() {
        System.out.println("Saldo = $ " + saldo);
        System.out.println("Comisión mensual = $ " + comision_mensual);
        System.out.println("Número de transacciones = " + (num_consignaciones + num_retiros) +"\n");
    }
}
