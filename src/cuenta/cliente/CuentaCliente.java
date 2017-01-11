/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta.cliente;

import java.time.LocalDate;

/**
 *
 * @author a0y3770325h
 */
public class CuentaCliente {
    
    private double balance;
    private String fechaApertura;
    private String nCuenta;
    private Cliente nombre;

    
    

    public CuentaCliente(double balance, String fechaApertura, String nCuenta, Cliente nombre) {
        this.balance = balance;
        this.fechaApertura = fechaApertura;
        this.nCuenta=nCuenta;
        this.nombre=nombre;
    }
      
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura( String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }
    public Cliente getNombre() {
        return nombre;
    }

    public void setNombre(Cliente nombre) {
        this.nombre = nombre;
    }

    public String getnCuenta() {
        return nCuenta;
    }

    public void setnCuenta(String nCuenta) {
        this.nCuenta = nCuenta;
    }
    public void ingresar(int ingreso){
        balance=balance+ingreso;
    }
    
    public void retirar(int cantidad){
        balance=balance-cantidad;
    }
}
