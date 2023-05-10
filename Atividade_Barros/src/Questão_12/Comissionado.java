package Questão_12;

class Comissionado extends Funcionario {
    private double totalVenda;
    private double taxaComissao;
    public Comissionado(String nome, double totalVenda, double taxaComissao) {
        super(nome);
        this.totalVenda = totalVenda;
        this.taxaComissao = taxaComissao;
    }
    public double calcularVencimento() {
        return totalVenda * taxaComissao;
    }
}