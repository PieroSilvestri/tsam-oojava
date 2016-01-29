package piero.silvestri.commercialista;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dipendenti d1 = new Dipendenti();
		d1.setNome("Piero");
		d1.setCognome("Silvestri");
		d1.setCF("SLVPRI");
		
		System.out.println("Dipendente: " + d1.getNome() + " " + d1.getCognome() + "\nParcella: " + d1.parcella()/100 + " euro.");
		
		LiberiProfessionisti lp1 = new LiberiProfessionisti();
		lp1.setNome("Franco");
		lp1.setCognome("Pivot");
		lp1.setCF("FRNPVT");
		lp1.setnFatture(100);
		lp1.setpIva("000123");
		System.out.println("\nLibero professionista: " + lp1.getNome() + " " + lp1.getCognome() + "\nParcella: " + lp1.parcella(lp1.getnFatture())/100 + " euro.");

		Imprenditori imp1 = new Imprenditori();
		imp1.setNome("Giulio");
		imp1.setCognome("Cesare");
		imp1.setCF("GILCSR");
		imp1.setnFatture(200);
		imp1.setpIva("0002345");
		imp1.setRagioneS("Lavoro");
		System.out.println("\nImprenditore: " + imp1.getNome() + " " + imp1.getCognome() + "\nParcella: " + imp1.parcella(imp1.getnFatture())/100 + " euro.");

		
		
	}

}
