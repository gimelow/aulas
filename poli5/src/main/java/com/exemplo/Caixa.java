

package com.exemplo;


public class Caixa<T> {
    private T objeto;
    private boolean ocupada;

    public Caixa() {
        this.ocupada = false;
    }

    public void guardar(T objeto) {
        if (ocupada) {
            System.out.println("Erro: a caixa já está ocupada!");
        } else {
            this.objeto = objeto;
            this.ocupada = true; 
            System.out.println("Objeto guardado com sucesso!");
        }
    }
}


