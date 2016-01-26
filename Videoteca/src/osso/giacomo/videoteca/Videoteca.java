package osso.giacomo.videoteca;

public class Videoteca {

	private Cliente[] clienti;
	
	
	public Cliente[] getClienti() {
		return clienti;
	}


	public void setClienti(Cliente[] clienti) {
		this.clienti = clienti;
	}


	public int calcolaNoleggioTot(){
		int tot = 0 ;
		for(Cliente cli:clienti){
			tot += cli.calcolaNoleggio();
		}
		return (int) Math.round(tot);
	}

}
