package Questão_12;


import java.util.ArrayList;

class FolhaDePagamento {
    private ArrayList<Funcionario> funcionarios;
    public FolhaDePagamento() {
        funcionarios = new ArrayList<>();
    }
    public void adicionarFuncionario(Funcionario funcionario) {
        if (!funcionarios.contains(funcionario)) {
            funcionarios.add(funcionario);
        }
    }
    public void exibirTodos() {
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.nome + " | Vencimento: " + funcionario.calcularVencimento());
        }
    }
    public double calcularValorTotal() {
        double valorTotal = 0;
        for (Funcionario funcionario : funcionarios) {
            valorTotal += funcionario.calcularVencimento();
        }
        return valorTotal;
    }
}