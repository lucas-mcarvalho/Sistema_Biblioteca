package Cliente;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente {
	
	private String name;
	private String email;
	private int cadastro;
	private LocalDate date_of_birth;
	
	private static DateTimeFormatter dtm = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	

	public Cliente(String name, String email,int cadastro,LocalDate date) {
		this.name = name;
		this.email = email;
		this.cadastro = cadastro;
		this.date_of_birth = date;
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
	
	public LocalDate getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(LocalDate date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	@Override
	public String toString() {
		return "Name : " + name + ", Email: " + email + ", Cadastro: " + cadastro + " Data de nascimento: "+dtm.format(date_of_birth);
	}

	
	
	
	

}
