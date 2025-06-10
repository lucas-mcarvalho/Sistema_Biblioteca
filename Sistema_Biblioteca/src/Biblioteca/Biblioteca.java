package Biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Autor.Autor;
import Livro.Livro;

public class Biblioteca {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		ArrayList<Livro> livros = new ArrayList<>();
		ArrayList<Livro> emprestimo = new ArrayList<Livro>();
		
		Autor a1 = new Autor(123123,"Pedro","15/09/2000");
		Livro l1= new Livro(2131231,a1,"HarryPotter","20/12/2003","10/2025/2025"); 
		
		
		livros.add(l1);
		
		System.out.println();
		int op = 0;	
			do {
			
			System.out.println("Digite uma opcao : 1(Sair do sistema) , 2(Pegar livro emprestado),3(Listar livros)");
			op = sc.nextInt();
			sc.nextLine();
			switch (op) {
			case 2: {
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
				System.out.println("Digite seu nome :");
				String name = sc.nextLine();
			

				for(Livro livro2 : livros) {
					if(livro2.getId().equals(livro) && livro2.getDisponivel()==true) {
					System.out.println("Livro "+livro2.getTitulo()+" emprestado");
					livro2.emprestar();
					emprestimo.add(livro2);
					}
				}
				System.out.println();
				break;
			}
			
			
			case 3:
				for(Livro livro: livros) {
					System.out.println("Livros disponiveis: ");
					if(livro.getDisponivel()== true) {
					System.out.print(l1);
					}
					for(Livro livro_emprestado: emprestimo) {
						System.out.println("Livros emprestados: ");
						System.out.print(livro_emprestado);
						}
					System.out.println();
				}
				
			default:
				
			}
	}while(op!=1);
			
			System.out.println("-------------------Saindo do sistema-------------------");
	}

}
