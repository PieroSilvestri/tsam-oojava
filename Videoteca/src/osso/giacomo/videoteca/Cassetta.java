package osso.giacomo.videoteca;

public class Cassetta extends Film {

	public int calcolaNoleggio(){
		
				
		if(getNumeroGiorni()==1 ){
			return 100;
		}else{
			return 100 *(1 + (getNumeroGiorni()-1) *2);
		}
	
	}
	
}
