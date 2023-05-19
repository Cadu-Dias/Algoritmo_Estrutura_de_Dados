import java.util.Random;

public class TesteABB {
    public static void main(String[] args) {
        Random r = new Random(0);
        ArvoreBinariaBusca abb = new ArvoreBinariaBusca();

        for(int i=1; i<=50; i++) {
            int n = r.nextInt(i);
            System.out.println(n + " ");
            abb.insere(n);
        }
        System.out.println(abb.exibeEmOrdem());
    }
}
