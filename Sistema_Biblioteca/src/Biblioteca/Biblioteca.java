package Biblioteca;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import java.util.Scanner;

import Autor.Autor;
import Cliente.Cliente;
import Livro.Livro;

public class Biblioteca {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		ArrayList<Livro> livros = new ArrayList<>();
		ArrayList<Livro> emprestimo = new ArrayList<>();
		ArrayList<Cliente> clientes = new ArrayList<>();
		
		//DATETIMEFORMAT
		DateTimeFormatter df =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		//LOCALDATE PRA INSERIR A DATA NO AUTOR
		LocalDate date =  LocalDate.parse("20/08/2004",df);
		
		Autor a1 = new Autor(123123,"Pedro",date);
		Autor a2 = new Autor(123124,"Jose",date);
		Livro l1= new Livro(2131231,a1,"HarryPotter"); 
		Livro l2= new Livro(2131235,a2,"Mente milionaria"); 
		
		
		livros.add(l1);
		livros.add(l2);
		
		System.out.println();
		int op = 0;	
			do {
			
			System.out.printf("Digite uma opcao :\n1(Sair do sistema) \n2(Pegar livro emprestado) \n3(Listar livros) \n4(listar clientes)");
			op = sc.nextInt();
			sc.nextLine();
			switch (op) {
			case 2: {
				
				Cliente cliente = null;
				
				System.out.println("E cliente ?");
				String op_cliente = sc.nextLine();
				if(op_cliente.equals("sim")) {
				System.out.println("Digite o numero de cadastro :");
				int cadastro = sc.nextInt();
				
				for (Cliente c : clientes) {
		            if (c.getCadastro() == cadastro) {
		                cliente = c;
		                break;
		            }
		        }
				
				
				}else {
					System.out.println("Digite seu nome :");
					String nome = sc.nextLine();
					System.out.println("Digite email : ");
					String email = sc.nextLine();
					System.out.println("Digite o numero do cadastro :");
					int cadastro = sc.nextInt();
					 cliente  = new Cliente(nome,email,cadastro);
				}
				
				for(Livro livro: livros) {
					System.out.println("Livros disponiveis: ");
					if(livro.getDisponivel()== true) {
					System.out.print(l1);
					}
				}
				System.out.println();
				System.out.println("Digite o numero da posicao livro: ");
				int livro = sc.nextInt();
				sc.nextLine();
				
				for(Livro livro2 : livros) {
					if(livro2.getId().equals(livro) && livro2.getDisponivel()==true) {
					System.out.println("Livro "+livro2.getTitulo()+" emprestado");
					livro2.emprestar();
					livro2.setCliente(cliente);
					emprestimo.add(livro2);
					clientes.add(cliente);
					
					}
				}
				System.out.println();
				break;
			}
			
			
			case 3:
				System.out.println("Livros disponiveis: ");
				for(Livro livro: livros) {
					if(livro.getDisponivel()== true) {
					System.out.print(livro);
					}
					for(Livro livro_emprestado: emprestimo) {
						System.out.println("Livros emprestados: ");
						System.out.print(livro_emprestado);
						}
					System.out.println();
					break;
				}
				
			case 4: 
				
				for(Cliente c : clientes) {
					System.out.println(c);
				}
				
			default:
				
			}
	}while(op!=1);
			
			System.out.println("-------------------Saindo do sistema-------------------");
	}

}
