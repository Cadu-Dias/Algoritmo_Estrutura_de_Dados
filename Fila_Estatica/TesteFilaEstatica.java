import java.util.Random;

public class TesteFilaEstatica {
    public static void main(String[] args) {
        FilaEstatica f = new FilaEstatica();
        System.out.println(f);

        Random r = new Random(0);
        while(!f.estaCheia()) {
            f.enfileira(r.nextInt(10));
            System.out.println(f);
        }

        while(!f.estaVazia()) {
            System.out.println(f.desenfilera() + " foi atendido");
            System.out.println(f);
        }
    }
}
