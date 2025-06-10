package Livro;

import Autor.Autor;

public class Livro {
	
	private Integer id;
	private String titulo;
	private Autor autor;
	private Boolean disponivel = true;
	private String dataAtualizacao;
	private String dataCadastro;
	
	
	public Livro(Integer id, Autor autor,String titulo, String dataAtualizacao,String dataCadastro) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.dataAtualizacao = dataAtualizacao;
		this.dataCadastro = dataCadastro;
	}


	
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public Autor getAutor() {
		return autor;
	}


	public void setAutor(Autor autor) {
		this.autor = autor;
	}


	public Boolean getDisponivel() {
		return disponivel;
	}


	public void setDisponivel(Boolean disponivel) {
		this.disponivel = disponivel;
	}


	public String getDataAtualizacao() {
		return dataAtualizacao;
	}


	public void setDataAtualizacao(String dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}


	public String getDataCadastro() {
		return dataCadastro;
	}


	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public void emprestar() {
		this.disponivel = false;
	}


	@Override
	public String toString() {
		return "Livro : id: " + id + ",titulo: "+titulo+ ",autor:" + autor + ", disponivel:" + disponivel
				+ ", dataAtualizacao: " + dataAtualizacao + ", dataCadastro:" + dataCadastro + "";
	}
	
	
	

}
