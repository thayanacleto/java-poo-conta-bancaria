package entities;

import enums.StatusConta;

public class Conta {
    private int numero; 
    private double saldo; 
    private StatusConta status;
    private Titular titular;

    public Conta(){

    }

    


    public Conta(int numero, StatusConta status, Titular titular) {
        this.numero = numero;
        this.status = status;
        this.titular = titular;
        saldo = 0;
    }




    public int getNumero() {
        return numero;
    }




    public void setNumero(int numero) {
        this.numero = numero;
    }




    public double getSaldo() {
        return saldo;
    }




    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }




    public StatusConta getStatus() {
        return status;
    }




    public void setStatus(StatusConta status) {
        this.status = status;
    }




    public Titular getTitular() {
        return titular;
    }




    public void setTitular(Titular titular) {
        this.titular = titular;
    }




    public void depositar(double valor) {
        if ( status == StatusConta.ATIVA && valor > 0 ) {
            saldo += valor;
        } 

    } 

    public void sacar(double valor){
        if(status == StatusConta.ATIVA && valor > 0 && saldo >= valor) {
            saldo -= valor; 
        
        } 
        
    }


    

    
    
}
    