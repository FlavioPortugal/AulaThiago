package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.dao.FarmaciaDAO;
import br.com.fiap.dao.impl.FarmaciaDAOImpl;
import br.com.fiap.entity.Farmacia;
import br.com.fiap.entity.TipoFarmacia;
import br.com.fiap.exception.CodigoInvalidoException;
import br.com.fiap.exception.CommitException;

public class Teste {

	public static void main(String[] args) throws CommitException, CodigoInvalidoException {

		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = fabrica.createEntityManager();
		FarmaciaDAO dao = new FarmaciaDAOImpl(em);

		Farmacia farmacia = new Farmacia("Drogasil", new GregorianCalendar(2010, Calendar.JANUARY, 15),
				TipoFarmacia.POPULAR, true);

		farmacia.setNome("Ultrafarma");

		try {
			dao.cadastrar(farmacia);
			dao.commit();
		} catch (CommitException e) {
			e.printStackTrace();
		}

		try {

			Farmacia busca = dao.buscar(3);
			System.out.println(busca);
			dao.deletar(busca.getCodigo());
			dao.commit();
		} catch (CodigoInvalidoException e) {
			e.printStackTrace();
		}
		catch (CommitException e) {
			e.printStackTrace();
		}

	}

}
