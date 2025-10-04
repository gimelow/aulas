package com.conceitos;

public class Aula1 {

    public static void main(String[] args) {
        Cachorro c = new Cachorro();//Um espaço
        //c = c + 1; Erro em tempo de compilaçao
        c.nome = "BIDU";
        c.raca = "SRD";
        c.latir();
        c.mostrarRaca();
        Cachorro d = new Cachorro();//Outro
        d.nome = "REX";
        d.raca = "POODLE";
        d.latir();
        d.mostrarRaca();
    }
}
