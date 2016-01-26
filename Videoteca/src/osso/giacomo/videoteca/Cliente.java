package osso.giacomo.videoteca;

public class Cliente {

	private Film[] films;
	
	public int calcolaNoleggio(){
		int tot = 0;
		
		for(Film fil: films){
			
			tot += fil.calcolaNoleggio();
		}
		
		return tot;
	}

	public Film[] getFilms() {
		return films;
	}

	public void setFilms(Film[] films) {
		this.films = films;
	}
	
	
	
}
