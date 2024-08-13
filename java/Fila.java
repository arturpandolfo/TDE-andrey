public class Fila {
    private int capacidade;
    private int[] dados;
    private int inicio;
    private int fim;
    private int tamanho;

    public Fila(int capacidade) {
        this.capacidade = capacidade;
        this.dados = new int[capacidade];
        this.inicio = 0;
        this.fim = -1;
        this.tamanho = 0;
    }

    public boolean cheia() {
        return tamanho == capacidade;
    }

    public boolean vazia() {
        return tamanho == 0;
    }

    public void insere(int elemento) throws Exception {
        if (cheia()) {
            throw new Exception("Fila cheia.");
        }
        fim = (fim + 1) % capacidade;
        dados[fim] = elemento;
        tamanho++;
    }

    public int remove() throws Exception {
        if (vazia()) {
            throw new Exception("Fila vazia.");
        }
        int elementoRemovido = dados[inicio];
        inicio = (inicio + 1) % capacidade;
        tamanho--;
        return elementoRemovido;
    }

    public void imprime() {
        for (int i = 0; i < tamanho; i++) {
            int indice = (inicio + i) % capacidade;
            System.out.println(dados[indice]);
        }
    }
}
