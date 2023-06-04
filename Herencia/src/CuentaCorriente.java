package cuentas;

public class CuentaCorriente extends Cuenta {

    private float sobregiro;
    public CuentaCorriente(float saldo, float tasa) {
        super(saldo, tasa);
        sobregiro = 0;
    }
    public void retirar(float monto) {
        float resultado = saldo - monto;
        if (resultado < 0) {
            sobregiro = sobregiro - resultado;
            saldo = 0;
        } else {
            super.retirar(monto);
        }
    }
    public void consignar(float monto) {

        float residuo = sobregiro - monto;

        if (sobregiro > 0) {
            if ( residuo > 0) {
                sobregiro = 0;
                saldo = residuo;
            } else {
                sobregiro = -residuo;
                saldo = 0;
            }
        } else {
            super.consignar(monto);
        }
    }
    public void extracto_mensual() {
        super.extracto_mensual();
    }
    public void imprimir() {
        System.out.println("Saldo = $ " + saldo);
        System.out.println("Cargo mensual = $ " + comision_mensual);
        System.out.println("Número de transacciones = " + (num_consignaciones + num_retiros));
        System.out.println("Valor de sobregiro = $" + (num_consignaciones + num_retiros));
        System.out.println();
    }
}