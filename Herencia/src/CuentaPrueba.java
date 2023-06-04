package cuentas;

import java.util.*;
public class CuentaPrueba {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        float saldo_inicial_ahorros;
        float tasa_ahorros;
        float monto_deposito;
        float monto_retiro;
        CuentaAhorros cuenta_1;

        System.out.println("Cuenta de ahorros");

        System.out.print("Ingrese el saldo inicial: $");
        saldo_inicial_ahorros = input.nextFloat();

        System.out.print("Ingrese la tasa de interés: ");
        tasa_ahorros = input.nextFloat();

        cuenta_1 = new CuentaAhorros(saldo_inicial_ahorros, tasa_ahorros);

        System.out.print("Ingrese el monto a consignar: $");
        monto_deposito = input.nextFloat();
        cuenta_1.consignar(monto_deposito);

        System.out.print("Ingresar cantidad a retirar: $");
        monto_retiro = input.nextFloat();
        cuenta_1.retirar(monto_retiro);
        cuenta_1.extracto_mensual();
        cuenta_1.imprimir();

        float saldo_inicial_corriente;
        float tasa_corriente;
        float monto_deposito_cor;
        float monto_retiro_cor;
        CuentaCorriente cuenta_2;

        System.out.println("Cuenta corriente");

        System.out.print("Ingrese el saldo inicial: $");
        saldo_inicial_corriente = input.nextFloat();

        System.out.print("Ingrese la tasa de interés: ");
        tasa_corriente = input.nextFloat();

        cuenta_2 = new CuentaCorriente(saldo_inicial_corriente, tasa_corriente);

        System.out.print("Ingrese el monto a consignar: $");
        monto_deposito_cor = input.nextFloat();
        cuenta_2.consignar(monto_deposito_cor);

        System.out.print("Ingresar cantidad a retirar: $");
        monto_retiro_cor = input.nextFloat();
        cuenta_2.retirar(monto_retiro_cor);
        cuenta_2.extracto_mensual();
        cuenta_2.imprimir();

    }
}
