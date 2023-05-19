import java.util.Random;

public class OutroTeste {
    public static void main(String[] args) {
        Random r = new Random();
        
        FilaEstatica f = new FilaEstatica(12);

        do {
            //enfilerar
            if(r.nextInt(2) == 0) {
                if(!f.estaCheia()) f.enfileira(r.nextInt(10));
            }
            //desinfileirar
            else {
                if(!f.estaVazia()) {
                    System.out.println(f.desenfilera() + " foi atendido"); 
                }
            }
            System.out.print(f);
            System.out.println(f.oVetor());

        } while(!f.estaVazia());
    }
}
