package Autor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Autor {
	
	private Integer id;
	private String nome;
	private LocalDate dataNascimento;
	
	DateTimeFormatter df =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	
	public Autor(int id, String nome, LocalDate dataNascimento) {
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}
	
	


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public LocalDate getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	@Override
	public String toString() {
		return "Nome: " + nome + ", id:" + id + ", dataNascimento: " +dataNascimento.format(df) + ".";
		
	}
	
	
	

}
