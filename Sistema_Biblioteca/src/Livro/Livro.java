package Livro;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import Autor.Autor;
import Cliente.Cliente;

public class Livro {
	
	private Integer id;
	private String titulo;
	private Autor autor;
	private Boolean disponivel = true;
	private LocalDateTime dataAtualizacao;
	private LocalDateTime dataCadastro;
	private Cliente cliente;
	
	private static DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	
	
	public Livro(Integer id, Autor autor,String titulo, LocalDateTime dataAtualizacao,LocalDateTime dataCadastro) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.dataAtualizacao = dataAtualizacao.now();
		this.dataCadastro = dataCadastro.now();
	}

	
	public Livro(Integer id, Autor autor,String titulo) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.dataAtualizacao = dataAtualizacao.now();
		this.dataCadastro = dataCadastro.now();
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


	public LocalDateTime getDataAtualizacao() {
		return dataAtualizacao;
	}


	public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}


	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}


	public void setDataCadastro(LocalDateTime dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	
	
	
	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public static DateTimeFormatter getDf() {
		return df;
	}


	public static void setDf(DateTimeFormatter df) {
		Livro.df = df;
	}


	public void emprestar() {
		this.disponivel = false;
	}


	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Livro :").append("\n");
		sb.append("id: ").append(id).append(" ,Titulo: ").append(titulo).append("\n");
		sb.append("Autor: ").append(autor).append("\n");
		sb.append("Disponivel: ").append(disponivel).append("  ,Data da ultima atualizacao: ").append(dataAtualizacao.format(df))
		.append(", data do Cadastro : ").append(dataCadastro.format(df));
		if(getCliente()!=null) {
		sb.append("Livro emprestado para o cliente : ").append(getCliente());
		}
		return sb.toString();
	}
	
	
	

}
