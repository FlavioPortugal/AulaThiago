package br.com.fiap.loja.bo;

import br.com.fiap.loja.to.Produto;

public class EstoqueBO {
		
	private void consultarProduto() {
		Produto produto = new Produto();
		switch (produto.getCodigo()) {
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
	}

	
}
