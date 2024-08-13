import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pilha pilha = new Pilha(5); 
        Fila fila = new Fila(5);     

        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n Menu:");
            System.out.println("1 - Inserir na Pilha");
            System.out.println("2 - Remover da Pilha");
            System.out.println("3 - Imprimir Pilha");
            System.out.println("4 - Inserir na Fila");
            System.out.println("5 - Remover da Fila");
            System.out.println("6 - Imprimir Fila");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("\n Digite o valor para inserir na Pilha: ");
                    int valorPilha = scanner.nextInt();
                    try {
                        pilha.insere(valorPilha);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        int removidoPilha = pilha.remove();
                        System.out.println("\n Removido da Pilha: " + removidoPilha);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("\n Conteúdo da Pilha:");
                    pilha.imprime();
                    break;
                case 4:
                    System.out.print("\n Digite o valor para inserir na Fila: ");
                    int valorFila = scanner.nextInt();
                    try {
                        fila.insere(valorFila);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    try {
                        int removidoFila = fila.remove();
                        System.out.println("\n Removido da Fila: " + removidoFila);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    System.out.println("\n Conteúdo da Fila:");
                    fila.imprime();
                    break;
                case 0:
                    System.out.println("\n Saindo...");
                    break;
                default:
                    System.out.println("\n Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
