package osso.giacomo.videoteca;

public class Dvd extends Film {
	
public int calcolaNoleggio(){
	
	if(getNumeroGiorni() > 2){
		return 100 * ((getNumeroGiorni()-2)*2+3);
	}else{
		return  100 * (getNumeroGiorni()*150);
	}

}
		
	
}
