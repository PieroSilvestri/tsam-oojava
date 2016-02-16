package main;

/**
 * Classe rappresentante un Dipendente.
 * L'univocit� di un dipendente � data dal suo CF.
 *
 */
public abstract class Dipendente {
	
	private String cf;
	private int anzianita;
	private int pagaBase;
	
	public abstract double calcolaStipendio();

	/**
	 * Il codice fiscale identifica univocamente un Dipendente
	 * @return CF
	 */
	public String getCF() {
		return cf;
	}

	/**
	 * Il codice fiscale identifica univocamente un Dipendente
	 * @param cf codice fiscale
	 */
	public void setCF(String cf) {
		this.cf = cf;
	}

	public int getAnzianita() {
		return anzianita;
	}

	public void setAnzianita(int anzianita) {
		this.anzianita = anzianita;
	}

	public int getPagaBase() {
		return pagaBase;
	}

	public void setPagaBase(int pagaBase) {
		this.pagaBase = pagaBase;
	}
	
	
	
	public int hashCode(){
		return this.cf.hashCode();
	}
	
	@Override
	public boolean equals(Object obj){
		if(!(obj instanceof Dipendente))
			return false;
		Dipendente d = (Dipendente)obj;
		return this.cf.equals(d.getCF());
	}
	
}
