package entities;


import entities.enums.Categoria;

public class Livro {
	private String titulo;
	private String autor;
	private Categoria categoria;
	private Integer anoPublicacao;
	private Integer quantidadeEmEstoque;
	
	public Livro(String titulo, String autor, Categoria categoria, Integer anoPublicacao, Integer quantidadeEmEstoque) {
		this.titulo = titulo;
		this.autor = autor;
		this.categoria = categoria;
		this.anoPublicacao = anoPublicacao;
		this.quantidadeEmEstoque = quantidadeEmEstoque;
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
	public Integer getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(Integer anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	public Integer getQuantidadeEmEstoque() {
		return quantidadeEmEstoque;
	}
	public void setQuantidadeEmEstoque(Integer quantidadeEmEstoque) {
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}
	
	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", categoria=" + categoria + ", anoPublicacao="
				+ anoPublicacao + ", quantidadeEmEstoque=" + quantidadeEmEstoque + "]";
	}
	
	
	
}
