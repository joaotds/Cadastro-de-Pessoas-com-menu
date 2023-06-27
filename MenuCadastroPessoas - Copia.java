import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuCadastroPessoas {
    private static List<Pessoa> listaPessoas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    cadastrarPessoa();
                    break;
                case 2:
                    listarPessoas();
                    break;
                case 3:
                    excluirPessoa();
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente.");
            }
            System.out.println();
        } while (opcao != 0);
    }

    private static void exibirMenu() {
        System.out.println("MENU");
        System.out.println("1 - Cadastrar Pessoas");
        System.out.println("2 - Listar Pessoas");
        System.out.println("3 - Excluir uma Pessoa pelo índice");
        System.out.println("0 - Sair");
        System.out.print("Digite a opção desejada: ");
    }

    private static void cadastrarPessoa() {
        System.out.println("CADASTRO DE PESSOA");
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o sobrenome: ");
        String sobrenome = scanner.nextLine();

        Pessoa pessoa = new Pessoa(nome, sobrenome);
        listaPessoas.add(pessoa);

        System.out.println("Pessoa cadastrada com sucesso!");
    }

    private static void listarPessoas() {
        System.out.println("LISTA DE PESSOAS CADASTRADAS");
        for (Pessoa pessoa : listaPessoas) {
            System.out.println(pessoa.getNome() + " " + pessoa.getSobrenome());
        }
    }

    private static void excluirPessoa() {
        System.out.println("EXCLUSÃO DE PESSOA");
        System.out.print("Digite o índice da pessoa a ser excluída: ");
        int indice = scanner.nextInt();

        if (indice >= 0 && indice < listaPessoas.size()) {
            Pessoa pessoaRemovida = listaPessoas.remove(indice);
            System.out.println("Pessoa removida: " + pessoaRemovida.getNome() + " " + pessoaRemovida.getSobrenome());
        } else {
            System.out.println("Índice inválido. Nenhuma pessoa removida.");
        }
    }
}
