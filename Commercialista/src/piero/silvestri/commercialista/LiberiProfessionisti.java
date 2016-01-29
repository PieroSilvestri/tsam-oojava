package piero.silvestri.commercialista;

public class LiberiProfessionisti extends Clienti{

	private String pIva;
	private int nFatture;
	
	public String getpIva() {
		return pIva;
	}

	public void setpIva(String pIva) {
		this.pIva = pIva;
	}

	public int getnFatture() {
		return nFatture;
	}

	public void setnFatture(int nFatture) {
		this.nFatture = nFatture;
	}
	
	public int parcella(int nFatture){
		
		return 5000 + nFatture*50;
		
	}
	
}
