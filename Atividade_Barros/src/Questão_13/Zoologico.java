package Questão_13;

import java.util.ArrayList;

public class Zoologico {
    private ArrayList<Animal> animais;
    private int capacidade;

    public Zoologico(int capacidade) {
        this.capacidade = capacidade;
        animais = new ArrayList<Animal>();
    }

    public void adicionar(Animal animal) {
        if (animais.size() < capacidade) {
            animais.add(animal);
        } else {
            System.out.println("Capacidade máxima do zoológico atingida!");
        }
    }

    public void remover(Animal animal) {
        animais.remove(animal);
    }

    public void limpar() {
        animais.clear();
    }

    public void animarBicharada() {
        for (Animal animal : animais) {
            animal.andar();
            animal.emitirSom();
        }
    }

    public void imprimirListaAnimais() {
        System.out.println("Animais no zoológico:");
        for (Animal animal : animais) {
            System.out.println(animal.getClass().getSimpleName());
        }
    }
}



