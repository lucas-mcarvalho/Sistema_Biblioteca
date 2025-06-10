package Autor;

public class Autor {
	
	private Integer id;
	private String nome;
	private String dataNascimento;
	
	
	public Autor(int id, String nome, String dataNascimento) {
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


	public String getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	@Override
	public String toString() {
		return "Autor id=" + id + ",nome:" + nome + ",dataNascimento=" +dataNascimento + ".";
	}
	
	
	

}
