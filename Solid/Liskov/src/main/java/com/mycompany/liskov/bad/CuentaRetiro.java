package com.mycompany.liskov.bad;

public class CuentaRetiro extends CuentaBancaria {

    public CuentaRetiro() {

    }

    public void depositar(double monto){

        throw new IllegalArgumentException("Operacion no permitida");

    }

}
