package holiday_es3;

public class Persona {
	
	double altezza;
	double massa;


	
	// Default
	// necessario perch� ho definito il costruttore con
	// due parametri che segue
	
	Persona(){
		
	}
	
	Persona(int altezza, int massa){
		this.altezza = altezza;	// univoke
		this.massa = massa;
	}
	
}
