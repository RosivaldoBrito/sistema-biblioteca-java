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
						String categoriaString = scanner.nextLine().toUpperCase();

						Categoria categoriaEnum = Categoria.valueOf(categoriaString);
						
						System.out.print("Ano de publicação yyyy:");
						int anoPublicacao = scanner.nextInt();
						
						System.out.print("Quantidade em estoque: ");
						int quantidadeEmEstoque = scanner.nextInt();
						
						acervo.add(new Livro(titulo, autor, categoriaEnum, anoPublicacao, quantidadeEmEstoque));
						System.out.println();
						System.out.println("Livro registrado com sucesso!");

						break;
					case 2:
						  System.out.println("\n[ MODIFICAR LIVRO ]");
						    scanner.nextLine(); 
						    
						    System.out.print("Digite o título do livro que deseja modificar: ");
						    String tituloBusca = scanner.nextLine();
						    
						    Livro livroEncontrado = buscarLivroPorTitulo(tituloBusca, acervo);
						    
						    if (livroEncontrado == null) {
						        System.out.println(" Erro: Livro não encontrado no acervo.");
						        System.out.println();
						    } else {
						        System.out.println("Livro encontrado: " + livroEncontrado.getTitulo());
						        
						        System.out.print("Digite o NOVO autor (ou aperte Enter para manter): ");
						        String novoAutor = scanner.nextLine();
						        
						        System.out.print("Digite a NOVA quantidade em estoque: ");
						        int novaQuantidade = scanner.nextInt();
						        
						       
						        livroEncontrado.setAutor(novoAutor);
						        livroEncontrado.setQuantidadeEmEstoque(novaQuantidade);
						        
						        System.out.println(" Livro atualizado com sucesso!");
						    }
						    break;
						
					default:
						System.out.println("Opção inválida! Tente novamente.");
						break;
						
					}
				}

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
	public static Livro buscarLivroPorTitulo(String tituloProcurado, List<Livro> lista) {
		for(Livro livro: lista) {
			if(livro.getTitulo().equalsIgnoreCase(tituloProcurado)) {
				return livro;
			}
		}
		return null;
	}

}
