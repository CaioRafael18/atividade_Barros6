package Questão_12;

abstract class Funcionario {
    protected String nome;
    public Funcionario(String nome) {
        this.nome = nome;
    }
    public abstract double calcularVencimento();
}





