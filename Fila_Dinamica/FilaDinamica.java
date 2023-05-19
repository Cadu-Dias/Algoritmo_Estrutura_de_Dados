public class FilaDinamica {

    class No {
        private int info;
        private No proximo;

        public No(int i) {
            info = i;
            proximo = null;
        }

        public int getInfo() {
            return info;
        }
        public No getProx() {
            return proximo;
        }

        public void setInfo(int i) {
            info = i;
        }

        public void setProx(No ref) {
            proximo = ref;
        }

        @Override
        public String toString() {
            return "|" + info + "|->";
        }
    }

    private No prim;
    private No ult;
    private int tamanho;

    //construtor padrão só
    public boolean estaVazia() {
        return tamanho == 0;
    }

    public void enfileira(int i) {
        No novo = new No(i);
        
        if(estaVazia()) prim = novo;
        else ult.setProx(novo);
        ult = novo;
        tamanho++;
    }

    public int desenfileira() {
        int i = prim.getInfo();
        tamanho--;
        prim = prim.getProx();
        if(prim == null) {//esvaziou a fila
            ult = null;
        }
        return i;
    }

    @Override
    public String toString() {
        String s = "fila: ";
        if(estaVazia()) s+= "vazia";
        else {
            No runner = prim;
            while(runner != null) {
                s+= runner + " ";
                runner = runner.getProx();
            }
            s += "//";
        }
        return s;
    }
}