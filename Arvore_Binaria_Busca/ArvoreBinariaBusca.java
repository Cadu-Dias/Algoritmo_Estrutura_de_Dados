public class ArvoreBinariaBusca {

    private class NoBinario {
        private int info;
        
        //filho da esqurda
        private NoBinario esq;
        //filho da direita 
        private NoBinario dir;

        

        public NoBinario(int info) {
            this.info = info;
        }
        public int getInfo() {
            return info;
        }
        public void setInfo(int info) {
            this.info = info;
        }

        public NoBinario getEsq() {
            return esq;
        }
        public void setEsq(NoBinario esq) {
            this.esq = esq;
        }

        public NoBinario getDir() {
            return dir;
        }
        public void setDir(NoBinario dir) {
            this.dir = dir;
        }

        @Override 
        public String toString() {
            return "[info= " + info + "]";
        }
    }

    private NoBinario raiz;
    //apenas construtor padrão
    public void insere(int i) {

        NoBinario novo = new NoBinario(i);

        if(raiz == null) raiz = novo;
        
        else insereRec(raiz, novo);
    }

    private void insereRec(NoBinario atual, NoBinario novo) {
        if(novo.getInfo() <= atual.getInfo()) {
            if(atual.getEsq() == null) atual.setEsq(novo);
            
            else insereRec(atual.getEsq(), novo);
        }
        else {
            if(atual.getDir() == null) atual.setDir(novo);
            
            else insereRec(atual.getDir(), novo);
        }
    }

    public String exibeEmOrdem() {
        if(raiz == null) return "Arvore Vazia";

        return exibeEmOrdemRec(raiz);
    }

    private String exibeEmOrdemRec(NoBinario atual) {

        if (atual != null) return exibeEmOrdemRec(atual.getEsq()) + atual.getInfo() + " " + exibeEmOrdemRec(atual.getDir());

        return "";
    }

    public int exibePosOrdem() {
        if(raiz == null) return 0;

        return exibePosOrdemRec(raiz);
    }

    private int exibePosOrdemRec(NoBinario atual) {

        if (atual != null) return exibePosOrdemRec(atual.getEsq()) + exibePosOrdemRec(atual.getDir()) + 1;

        return 0;
    }
}
/*pergunta de prova:
  
    A partir de um código, desenhar qual será a árvore que será formada a
    partir daquele código 
*/