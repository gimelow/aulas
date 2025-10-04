package com.aulas;

public class Record6 {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("giovanna", 3320, 10);
        a1.aprovado();
        System.out.println("nome: " + a1.nome());
        System.out.println("matricula: " + a1.matricula());
        System.out.println("nota final: " + a1.nota_final());
        System.out.println(a1.aprovado() ?  "aprovado" :  "reprovado"); 
    }
}
