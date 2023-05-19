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

    
}