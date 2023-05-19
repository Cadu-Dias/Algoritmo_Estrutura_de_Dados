public class ListaComCabeca <T> {
    private No<T> cabecaLista;
    
    public ListaComCabeca() {
        //Criando um nó que não guarda um valor
        cabecaLista = new No<T>(null);
    }

    public void insereInicio(T info) {
        No<T> novo = new No<T>(info);
        /*cabecaLista: não guarda um valor, apenas uma referência para apontar ao primeiro Nó da Lista
        Logo o elemento próximo a ela é o primeiro da lista*/
        novo.setProx(cabecaLista.getProx());
        cabecaLista.setProx(novo);
    }

    public T removeInicio() {

        T aux = null;

        if(cabecaLista.getProx() != null) {
            aux = cabecaLista.getProx().getInfo();
            cabecaLista.setProx(cabecaLista.getProx().getProx());
            return aux;
        }

        return aux;
    }

    @Override
    public String toString() {

        String s = "lista: ";
        if(cabecaLista.getProx() == null) {
            s+= "vazia";
        }
        else {
            No<T> runner = cabecaLista.getProx();
            while(runner != null) {
                s+= runner;
                runner = runner.getProx();
            }
        }
        return s;
    }
    
}
