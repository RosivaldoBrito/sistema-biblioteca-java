package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Livro;
import entities.enums.Categoria;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		List<Livro> acervo = new ArrayList<>();

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
				System.out.println("Entrando no menu de livros...");

				boolean subMenuLivros = true;
				while (subMenuLivros) {
					System.out.println("1 - Registrar livro");
					System.out.println("2 - Modificar livro");
					System.out.println("3 - Excluir livro");
					System.out.println("4 - Listar livros");
					System.out.println("5 - Procurar por título");
					System.out.println("6 - Procurar por autor");
					System.out.println("7 - Procurar por categoria");
					System.out.println("8 - Verificar disponibilidade");
					System.out.println("0 - Voltar ao Menu Principal");
					System.out.print("Escolha a ação: ");

					int opcaoLivros = scanner.nextInt();

					switch (opcaoLivros) {
					case 0:
						subMenuLivros = false;
						break;
					case 1:
						System.out.println("\n[ REGISTRAR NOVO LIVRO ]");
						scanner.nextLine();

						System.out.print("Título do livro: ");
						String titulo = scanner.nextLine();

						System.out.print("Autor: ");
						String autor = scanner.nextLine();

						System.out.println(
								"Categorias válidas: ROMANCE, FANTASIA, FICCAO, SUSPENSE, TERROR, DISTOPIA, AVENTURA");
						System.out.print("Digite a categoria: ");
						String catString = scanner.nextLine().toUpperCase();

						Categoria categoriaEnum = Categoria.valueOf(catString);

						acervo.add(new Livro(titulo, autor, categoriaEnum));
						System.out.println("Livro registrado com sucesso!");

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
	}
}
