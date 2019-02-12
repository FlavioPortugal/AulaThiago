package br.com.fiap.loja;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class TerminalConsulta {

	public static void main(String[] args) {

		int codigo = 0;
		String adicionar;
		Scanner leitor = new Scanner(System.in);
		
		do{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("FIAP STORE " + sdf.format(Calendar.getInstance().getTime()));
		System.out.print("Código: ");
		codigo = leitor.nextInt();	

			switch (codigo) {
			case 401:				
				System.out.println("Código: " + codigo + " Camiseta Branca");			
				break;
			case 402:				
				System.out.println("Código: " + codigo + " Camiseta Azul");				
				break;
			case 403:				
				System.out.println("Código: " + codigo + " Camiseta rosa");				
				break;
			default:			
				System.out.println("Código: " + codigo + " Produto não encontrado");			
				
				break;
			}
			System.out.println("Sair? s/n");			
		}while(leitor.next().equalsIgnoreCase("N"));
			
		
		leitor.close();

	}

}
