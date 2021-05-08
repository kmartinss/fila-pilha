public class Fila {
    private Pilha pilhaPrincipal;
	private Pilha pilhaAuxiliar;
	private int total;

	public Fila() {
		this.pilhaPrincipal = new Pilha();
		this.pilhaAuxiliar = new Pilha();
		this.total = 0;
	}

	public boolean vazia() {
		if (this.total == 0)
			return true;
		else
			return false;
	}

	public void inserir(int elem) {
		this.pilhaPrincipal.empilhar(elem);
		this.total++;
	}

	public int remover() {
		if (this.vazia()) {
			System.out.println("Fila Vazia!");
			return -1;
		}

		int tamPilha = this.pilhaPrincipal.tamanho();

		int temp = 0;
		for(int i = 0; i < tamPilha - 1; i++)
		{
			this.pilhaAuxiliar.empilhar(this.pilhaPrincipal.desempilhar());
		}

		temp = this.pilhaPrincipal.desempilhar();
		tamPilha = this.pilhaAuxiliar.tamanho();

		for(int i = 0; i < tamPilha; i++)
		{
			this.pilhaPrincipal.empilhar(this.pilhaAuxiliar.desempilhar());
		}

		this.total--;
		return temp;
	}

	public int exibePrimeiroValor() {
		if (this.vazia()) {
			System.out.println("Fila Vazia!");
			return -1;
		}

		int tamPilha = this.pilhaPrincipal.tamanho();

		int temp = 0;
		for(int i = 0; i < tamPilha - 1; i++)
		{
			this.pilhaAuxiliar.empilhar(this.pilhaPrincipal.desempilhar());
		}

		temp = this.pilhaPrincipal.exibeUltimoValor();
		tamPilha = this.pilhaAuxiliar.tamanho();

		for(int i = 0; i < tamPilha; i++)
		{
			this.pilhaPrincipal.empilhar(this.pilhaAuxiliar.desempilhar());
		}

		return temp;
	}

	public void imprimir() {
		if (this.vazia()) {
			System.out.println("Fila Vazia!");
		}

		int tamPilha = this.pilhaPrincipal.tamanho();

		int temp = 0;
		for(int i = 0; i < tamPilha; i++)
		{
			this.pilhaAuxiliar.empilhar(this.pilhaPrincipal.desempilhar());
		}

		tamPilha = this.pilhaAuxiliar.tamanho();

		for(int i = 0; i < tamPilha; i++)
		{
			temp = this.pilhaAuxiliar.exibeUltimoValor();
			System.out.print(temp + " ");
			this.pilhaPrincipal.empilhar(this.pilhaAuxiliar.desempilhar());
		}
	}

	public int tamanho() {
		return this.total;
	}
}