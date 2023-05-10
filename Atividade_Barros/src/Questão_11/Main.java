package Questão_11;

import Questão_11.Arte;

public class Main {
    public static void main(String[] args) {
        Arte.CadastroDeDesenhos cadastro = new Arte.CadastroDeDesenhos();

        Arte.Desenho retangulo = new Arte.Retangulo();
        Arte.Desenho circulo = new Arte.Circulo();
        Arte.Desenho quadrado = new Arte.Quadrado();
        Arte.Desenho pessoa = new Arte.Pessoa();

        cadastro.adicionarDesenho(retangulo);
        cadastro.adicionarDesenho(circulo);
        cadastro.adicionarDesenho(quadrado);
        cadastro.adicionarDesenho(pessoa);

        cadastro.desenharTodos();
    }
}