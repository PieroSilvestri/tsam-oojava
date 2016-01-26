package osso.giacomo.videoteca;

import static org.junit.Assert.*;

import org.junit.Test;

public class DvdTest {

	@Test
	public void testCalocolaNoleggio() {
		Dvd c = new Dvd();
		c.setTitolo("Zohan");
		c.setNomeRegista("Pino");
		c.setAnnoProduzione("2000");
	
		c.setNumeroGiorni(10);
		
		assertEquals(19,c.calcolaNoleggio());
		
	}
}
