
package com.exemplo;

public class Exemplo {

    public static void main(String[] args) {
        
        //caixa de double 
        Caixa<Double> doublebox = new Caixa<>();
        doublebox.guardar(20.0);

        //caixa de string
        Caixa<String> stringbox = new Caixa<>();
        stringbox.guardar("objeto");

    }
}
