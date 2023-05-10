package Questão_13;

public class Main {
    public static void main(String[] args) {
        Zoologico zoo = new Zoologico(10);

        Cachorro cachorro = new Cachorro();
        Animal galinha = new Galinha();
        Gato gato = new Gato();
        Animal papagaio = new Papagaio();

        zoo.adicionar(cachorro);
        System.out.println("Cachorro Adicionado!");
        zoo.adicionar(galinha);
        System.out.println("Galinha Adicionada!");
        zoo.adicionar(gato);
        System.out.println("Gato Adicionado!");
        zoo.adicionar(papagaio);
        System.out.println("Papagaio Adicionado!");

        zoo.animarBicharada();
        zoo.imprimirListaAnimais();
        zoo.remover(papagaio);
        System.out.println("Papagaio foi removido da lista!");
        zoo.imprimirListaAnimais();
        zoo.limpar();
        System.out.println("Não tem mais nenhum animal na lista!");
    }
}
