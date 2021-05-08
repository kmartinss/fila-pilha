public class Pilha {
    public int[] pilha;
    public int posicaoPilha;

    public Pilha() {
        this.posicaoPilha = -1;
        this.pilha = new int[1000];
    }

    public boolean pilhaVazia() {
        if (this.posicaoPilha == -1) {
            return true;
        }
        return false;
    }

    public int tamanho() {
        if (this.pilhaVazia()) {
            return 0;
        }
        return this.posicaoPilha + 1;
    }

    public int exibeUltimoValor() {
        if (this.pilhaVazia()) {
            return 0;
        }
        return this.pilha[this.posicaoPilha];
    }

    public int desempilhar() {
        if (pilhaVazia()) {
            return 0;
        }
        return this.pilha[this.posicaoPilha--];
    }

    public void empilhar(int valor) {
        if (this.posicaoPilha < this.pilha.length - 1) {
            this.pilha[++posicaoPilha] = valor;
        }
    }
}