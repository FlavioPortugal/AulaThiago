package br.com.fiap.bo;

import java.util.Scanner;

import javax.xml.ws.RespectBinding;

import br.com.fiap.bo.DisciplinaBOStub.CalcularNotaExame;
import br.com.fiap.bo.DisciplinaBOStub.CalcularNotaExameResponse;

public class ConsoleView2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite a media:");
		float media = sc.nextFloat();
		
		try {
			DisciplinaBOStub stub = new DisciplinaBOStub();
			CalcularNotaExame cne = new CalcularNotaExame();
			cne.setMedia(media);
			CalcularNotaExameResponse cner = stub.calcularNotaExame(cne);
			
			double nota = cner.get_return();
			System.out.println("Nota para tirar no exame é: " + nota);
		} catch (Exception e) {
			// TODO: handle exception
		}
	

	}

}
