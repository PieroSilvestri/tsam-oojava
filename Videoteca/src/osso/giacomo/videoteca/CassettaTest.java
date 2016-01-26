package osso.giacomo.videoteca;

import static org.junit.Assert.*;

import org.junit.Test;

/*
 * private String titolo;
	private String nomeRegista;
	private String annoProduzione;
	private String[] attoriPrincipali;
	
	private int numeroGiorni;
 */


public class CassettaTest {

	@Test
	public void testCalocolaNoleggio() {
		Cassetta c = new Cassetta();
		c.setTitolo("Zohan");
		c.setNomeRegista("Pino");
		c.setAnnoProduzione("2000");
	
		c.setNumeroGiorni(10);
		
		assertEquals(19,c.calcolaNoleggio());
		
	}

}
