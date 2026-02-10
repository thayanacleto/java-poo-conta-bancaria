package application;

import entities.Conta;
import entities.Titular;
import enums.StatusConta;

public class Program {
    public static void main(String[] args) {
        Titular a = new Titular();
        a.setNome("Thaynara"); 


        Conta b = new Conta(); 
        b.setNumero(1);
        b.setSaldo(0.0);
        b.setStatus(StatusConta.ATIVA); 
        b.setTitular(a);

        b.depositar(500.0);
        b.sacar(100.0);
        b.sacar(600.0);
        
        String nomeTitular = a.getNome(); 
        double saldoFinal = b.getSaldo();
        StatusConta statusC = b.getStatus();



        System.out.println(nomeTitular);
        System.out.println(saldoFinal);
        System.out.println(statusC);



    }
    
}
