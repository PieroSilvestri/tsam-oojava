package holiday_es4;

public class Dipendente {

	String nome;
	String cognome;
	int anzianit�;
	Contratto contratto;
	//Salario in centesimi
	int salario = contratto.stipendioBase + ((contratto.stipendioBase/200) * anzianit�);
}
