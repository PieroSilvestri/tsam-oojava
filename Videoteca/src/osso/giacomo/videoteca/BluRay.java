package osso.giacomo.videoteca;

public class BluRay extends Film {

	public int calcolaNoleggio(){
		int tot = 1;
		
		if(getNumeroGiorni()==1){
			return 1;
		}else{
			for(int i = 1; i <= getNumeroGiorni(); i++){
				tot = tot + 1 + (i)/(i*10);
			}
			return tot * 100;
			
		}
	}
	
}
