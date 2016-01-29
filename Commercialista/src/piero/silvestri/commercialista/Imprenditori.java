package piero.silvestri.commercialista;

public class Imprenditori extends Clienti {

	private String pIva;		//Partita iva
	private String ragioneS;	//Ragione sociale
	private int nFatture;		//Numero fatture
	
	public String getpIva() {
		return pIva;
	}
	public void setpIva(String pIva) {
		this.pIva = pIva;
	}
	public String getRagioneS() {
		return ragioneS;
	}
	public void setRagioneS(String ragioneS) {
		this.ragioneS = ragioneS;
	}
	public int getnFatture() {
		return nFatture;
	}
	public void setnFatture(int nFatture) {
		this.nFatture = nFatture;
	}
	
	public int parcella(int nFatture){
		if(nFatture <=100){
			return 50000;
		}
		else{
			return 100 + parcella(nFatture - 1);
		}
	}

	
	
}
