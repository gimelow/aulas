
package com.exemplo;

public class Exemplo {

    public static void main(String[] args) {
        // caixa de inteiros
        Caixa<Integer> caixaInt = new Caixa<>();
        caixaInt.guardar(10);   
        caixaInt.guardar(20);   // nao guarda

        // caixa de strings
        Caixa<String> caixaStr = new Caixa<>();
        caixaStr.guardar("oi");
        caixaStr.guardar("tchau"); // nao guarda
    }
}
