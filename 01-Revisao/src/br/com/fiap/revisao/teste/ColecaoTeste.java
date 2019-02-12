//80596

package br.com.fiap.revisao.teste;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ColecaoTeste {

	public static void main(String[] args) {
		//Lista
		List<String> lista = new ArrayList<String>();
		lista.add("Hello world");
		lista.add("Olá mundo");
		lista.add("Hallo Welt");
		
		//Recuperar uma posição específica
		System.out.println(lista.get(2));
		System.out.println(" ");
		//Percorrer a lista
		for (String item : lista) {
			System.out.println(item);
		}
		
		System.out.println("");
		System.out.println("SET");
		Set<String> set = new HashSet<String>();
		//Adicionar valores no set
		set.add("Lasanha");
		set.add("Lasanha");
		set.add("Pizza");
		
		//exibir os elementos do set
		for (String item2 : set) {
			System.out.println(item2);
		}
		
		System.out.println(" ");
		
		//MAP
		Map<String,String> mapa = new HashMap<>();
		
		mapa.put("Brasil", "Brasília");
		mapa.put("USA", "Washington DC");
		mapa.put("Canada", "Ottawa");
		mapa.put("Australia", "Camberra");
		
		System.out.println(mapa.get("USA"));
		
	}
	
}
