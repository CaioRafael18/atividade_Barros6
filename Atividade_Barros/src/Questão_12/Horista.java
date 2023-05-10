package Questão_12;


class Horista extends Funcionario {
    private double precoHora;
    private double horasTrabalhadas;
    public Horista(String nome, double precoHora, double horasTrabalhadas) {
        super(nome);
        this.precoHora = precoHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }
    public double calcularVencimento() {
        return precoHora * horasTrabalhadas;
    }
}
