package entities;

import entities.enums.Categoria;

public class Livro {
	private String titulo;
	private String autor;
	private Categoria categoria;
	
	public Livro(String titulo, String autor, Categoria categoria) {
		this.titulo = titulo;
		this.autor = autor;
		this.categoria = categoria;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
	
	

}
