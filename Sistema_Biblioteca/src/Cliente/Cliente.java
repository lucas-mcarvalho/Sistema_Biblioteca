package Cliente;

import java.util.ArrayList;

import Livro.Livro;

public class Cliente {
	
	private String name;
	private String email;
	private int cadastro;
	

	public Cliente(String name, String email,int cadastro) {
		this.name = name;
		this.email = email;
		this.cadastro = cadastro;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCadastro() {
		return cadastro;
	}

	public void setCadastro(int cadastro) {
		this.cadastro = cadastro;
	}

	@Override
	public String toString() {
		return "Name : " + name + ", Email: " + email + ", Cadastro: " + cadastro + " ";
	}

	
	
	
	

}
