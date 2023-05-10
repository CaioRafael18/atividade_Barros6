package Questão_11;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Arte {
    public interface Desenho {
        public void desenhar();
    }

    public static class Retangulo implements Desenho {
        public void desenhar() {
            System.out.println("Desenhando um retângulo");
        }
    }

    public static class Circulo implements Desenho {
        public void desenhar() {
            System.out.println("Desenhando um círculo");
        }
    }

    public static class Quadrado implements Desenho {
        public void desenhar() {
            System.out.println("Desenhando um quadrado");
        }
    }

    public static class Pessoa implements Desenho {
        public void desenhar() {
            System.out.println("Desenhando uma pessoa");
        }
    }

    public static class CadastroDeDesenhos {
        private List<Desenho> desenhos = new ArrayList<Desenho>();

        public void adicionarDesenho(Desenho desenho) {
            desenhos.add(desenho);
        }

        public void desenharTodos() {
            for (Desenho desenho : desenhos) {
                desenho.desenhar();
            }
        }
    }


}
