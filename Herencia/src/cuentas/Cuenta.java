package cuentas;

public class Cuenta {

    protected float saldo;
    protected int num_consignaciones = 0;
    protected int num_retiros = 0;
    protected float tasa_anual;
    protected float comision_mensual = 0;

    public Cuenta(float saldo, float tasa_anual) {
        this.saldo = saldo;
        this.tasa_anual = tasa_anual;
    }

    public void consignar(float monto) {
        saldo = saldo + monto;
        num_consignaciones = num_consignaciones + 1;
    }
    public void retirar(float monto) {

        float nuevo_saldo = saldo - monto;

        if (nuevo_saldo >= 0) {
            saldo -= monto;
            num_retiros = num_retiros + 1;
        } else {
            System.out.println("El monto a retirar excede el saldo actual de la cuenta.");
        }
    }
    public void calcular_interes() {
        float tasa_mensual = tasa_anual / 12;
        float interes_mensual = saldo * tasa_mensual;
        saldo += interes_mensual;
    }
    public void extracto_mensual() {
        saldo -= comision_mensual;
        calcular_interes();
    }
}
