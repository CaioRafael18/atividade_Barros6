package Questão_12;

public class Main {
    public static void main(String[] args) {
        FolhaDePagamento folha = new FolhaDePagamento();

        Assalariado assalariado = new Assalariado("Caio", 1000);
        Comissionado comissionado = new Comissionado("Caua", 6000, 0.1);
        Horista horista = new Horista("Rafael", 100, 30);

        folha.adicionarFuncionario(assalariado);
        folha.adicionarFuncionario(comissionado);
        folha.adicionarFuncionario(horista);

        folha.exibirTodos();
        System.out.println("Valor total da folha de pagamento: " + folha.calcularValorTotal());
    }
}
