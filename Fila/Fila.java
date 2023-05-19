public class Fila {
    private int[] dados;
    private int tamanho, prim, ult;

    public Fila() {
        dados = new int[10];
        prim = 0;
        ult = 0;
        tamanho = 0;
    }

    public Fila(int capacidade) {
        dados = new int[capacidade];
        prim=0;
        ult=0;
        tamanho=0;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public boolean estaCheia() {
        return tamanho == dados.length;
    }
    //usado para inserir e remover elementos
    int proxima(int pos) {
        return (pos + 1) % dados.length;
    }

    public void enfileira(int i) {
        dados[ult] = i;
        ult = proxima(ult);
        tamanho++;
    }

    public int desenfilera() {
        int i = dados[prim];
        prim = proxima(prim);
        tamanho--;
        return i;
    }

    @Override
    public String toString() {

        String s = "Fila: ";
        if(estaVazia()) {
            s += "esta vazia";
        }
        else {
            int i = prim;
            do {
                s += dados[i] + " ";
                i = proxima(i);
            }while(i != ult);
        }
        
        return s;
    }

}