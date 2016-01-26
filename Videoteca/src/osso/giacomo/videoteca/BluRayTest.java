package osso.giacomo.videoteca;

import static org.junit.Assert.*;

import org.junit.Test;

public class BluRayTest {

	@Test
	public void testCalocolaNoleggio() {
		BluRay c = new BluRay();
		c.setTitolo("Zohan");
		c.setNomeRegista("Pino");
		c.setAnnoProduzione("2000");
	
		c.setNumeroGiorni(10);
		
		assertEquals(18,c.calcolaNoleggio());
		
	}

}
