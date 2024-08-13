public class Pilha {
    private int capacidade;
    private int topo;
    private int[] dados;

    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.topo = -1;
        this.dados = new int[capacidade];
    }

    public boolean cheia() {
        return topo == capacidade - 1;
    }

    public boolean vazia() {
        return topo == -1;
    }

    public void insere(int elemento) throws Exception {
        if (cheia()) {
            throw new Exception("Pilha cheia.");
        }
        dados[++topo] = elemento;
    }

    public int remove() throws Exception {
        if (vazia()) {
            throw new Exception("Pilha vazia.");
        }
        return dados[topo--];
    }

    public void imprime() {
        for (int i = topo; i >= 0; i--) {
            System.out.println(dados[i]);
        }
    }
}
