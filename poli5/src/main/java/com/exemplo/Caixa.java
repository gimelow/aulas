

package com.exemplo;


public class Caixa<T> {
    private T objeto;
    private boolean ocupada;

    public Caixa() {
        this.ocupada = false;
    }

    public void guardar(T objeto){
        if(ocupada){
            System.out.println("caixa ja ocupada");
        }else{
            this.objeto = objeto;
            this.ocupada = true;
            System.out.println("objeto guardada e caixa ocupada com sucesso");
        }
    }

}