package cadastroExec;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cadastro.Cadastro;

public class CadastroExec {

	public static void main(String[] args) {
		List<Cadastro> lista = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		String aux;
		int num = 0;
			
		while(num != 945985) {
		
		System.out.println("============Informe uma opção=================");
		System.out.println("");
		System.out.println("Novo Cadastro (1)");
		System.out.println("Listar Nomes Cadastrados (2)");
		System.out.println("Remover Nomes Cadastrados (3)");
		System.out.println("Sair (4)");
		System.out.println();
		System.out.println("==============================================");
		
		aux = sc.nextLine();
		opcao = Integer.parseInt(aux);
		
		
		
		if(opcao == 1) {
			
			Cadastro cadastro = new Cadastro();
			
			System.out.println("================Novo Cadastro==================");
			
			System.out.println("Informe o seu nome: ");
			cadastro.setNome(sc.nextLine());
			
			System.out.println("Informe o seu sobrenome: ");
			cadastro.setSobrenome(sc.nextLine());
			
			System.out.println("===============================================");
			
			lista.add(cadastro);
		}
		
		else if (opcao == 2) {
			System.out.println();
			System.out.println("================Lista de Nomes=================");
			for(Cadastro cadastro : lista) {
				System.out.println(cadastro.getListar());
				
			}
			System.out.println("===============================================");
		}
			
		
		else if (opcao == 3 ) {
			int num2 = 0;
			int remove;
			
			System.out.println("==================Remover Nome=================");
			for(Cadastro cadastro : lista) {
				System.out.println("(" + num2 + ")" + " " + cadastro.getListar());
				num2++;
			}
			System.out.println("Informe o número do nome que você quer remover: ");
			aux = sc.nextLine();
			remove = Integer.parseInt(aux);
			
			lista.remove(remove);
		
		
		}
		else if (opcao == 4) {
			System.exit(0);
		}
		
	}
}
}
