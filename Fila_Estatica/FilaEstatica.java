public class FilaEstatica {
    private int[] dados;
    private int tamanho, prim, ult;

    public FilaEstatica() {
        this(10);
    }

    public FilaEstatica(int capacidade) {
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

    public String oVetor() {
        String s = ": ";

        if(estaVazia()) for(int i = 0; i < dados.length; i++) s+= "_ ";
            
        else if (estaCheia()) for(int i=0; i < dados.length; i++) s+= dados[i] + " ";
            
        else if (prim < ult) {
            for(int i=0; i<prim; i++) s+="_ ";
            for(int i=prim; i<ult; i++) s+= dados[i] + "_ ";
            for(int i=ult; i<dados.length; i++) s+= "_ ";
        }
        else {
            for(int i=0; i<ult; i++) s+= dados[i] + "";
            for(int i=ult; i<prim;i++) s+= "_ ";
            for(int i=prim; i<dados.length;i++) s+= dados[i]+ "_ ";
        }
        return s;
    }

}