package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.println("===SISTEMA BIBLIOTECÁRIO INICIADO===");

		while (true) {
			System.out.println("\n--- MENU PRINCIPAL ---");
			System.out.println("1 - Livros");
			System.out.println("2 - Usuários");
			System.out.println("3 - Empréstimos");
			System.out.println("4 - Relatórios");
			System.out.println("0 - Sair");
			System.out.print("Escolha uma opção: ");
			int opcao = scanner.nextInt();

			switch (opcao) {
			case 0:
				System.out.println("Encerrando sistema bibliotecário. Até logo!");
				scanner.close();
				return;

			case 1:
				System.out.println("Entrando no menu de livros... (Em construção) ");
				break;

			case 2:
				System.out.println("Entrando no menu de usuários... (Em construção) ");
				break;

			case 3:
				System.out.println("Entrando no menu de empréstimos... (Em construção) ");
				break;

			case 4:
				System.out.println("Entrando no menu de relatórios... (Em construção) ");
				break;

			default:
				System.out.println("Opção inválida! Tente novamente.");
				break;

			}
		}
	}

}
