import java.util.Scanner;

import br.com.fiap.bo.DisciplinaBOStub;
import br.com.fiap.bo.DisciplinaBOStub.CalcularMedia;
import br.com.fiap.bo.DisciplinaBOStub.CalcularMediaResponse;

public class ConsoleView {

	public static void main(String[] args) {
		try {

			Scanner leitor = new Scanner(System.in);
			float nac = leitor.nextFloat();
			float ps = leitor.nextFloat();
			float am = leitor.nextFloat();

			DisciplinaBOStub stub = new DisciplinaBOStub();

			CalcularMedia valores = new CalcularMedia();
			valores.setAm(am);
			valores.setAm(nac);
			valores.setAm(ps);

			CalcularMediaResponse resp = stub.calcularMedia(valores);

			double media = resp.get_return();
			System.out.println("Media é :" + media);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
