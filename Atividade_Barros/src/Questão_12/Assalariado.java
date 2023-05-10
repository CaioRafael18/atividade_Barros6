package Questão_12;

class Assalariado extends Funcionario {
    private double salario;
    public Assalariado(String nome, double salario) {
        super(nome);
        this.salario = salario;
    }
    public double calcularVencimento() {
        return salario;
    }
}