package com.aulas;
    public record Aluno (String nome, int matricula, double nota_final){

        public boolean aprovado(){
            return nota_final >= 6;
        }
}
