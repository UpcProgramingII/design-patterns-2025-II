/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.liskov.bad;


/**
 *
 * @author JAIRO
 */
public class CuentaProtegida extends CuentaBancaria {
    public CuentaProtegida(double saldo) {
        super(saldo);
    }

    public CuentaProtegida() {
    }

    public void depositar(double monto){
        if(monto>500)
            throw new IllegalArgumentException("Monto no permitido");

        super.depositar(monto);
    }

    public void retirar(double monto) {

            if(monto<=0)
                throw new IllegalArgumentException("Monto no permitido");
            if(monto>500)
                throw new IllegalArgumentException("Monto no permitido");
            if(this.getSaldo()<monto)
                throw new IllegalArgumentException("Saldo insuficiente");

            this.setSaldo(this.getSaldo()-monto);

    }

    
    
    
    
    
}
