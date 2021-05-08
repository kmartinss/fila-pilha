public class App {
    public static void main(String[] args) throws Exception {
        Fila f = new Fila();

        f.inserir(73);
        f.inserir(51);
        f.inserir(17);

        System.out.print("Fila: ");
        f.imprimir();

        System.out.println("\nElemento removido: " + f.remover());

        f.inserir(42);

        System.out.print("Fila: ");
        f.imprimir();

        System.out.println("\nTamanho da fila: " + f.tamanho());

        System.out.println("Elemento removido: " + f.remover());
        System.out.println("Elemento removido: " + f.remover());
        System.out.println("Elemento removido: " + f.remover());

        System.out.println("Fila vazia? " + f.vazia());
    }
}