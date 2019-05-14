package figurinhasAlbum;

import java.util.Random;

public class Editora2 {
	int totalDeFigurinhas;
	Figurinha[] figurinhas;
	public Editora2(int totalDeFigurinhas) {
		this.totalDeFigurinhas = totalDeFigurinhas;
		this.figurinhas = new Figurinha[totalDeFigurinhas];
		
		for(int i =0; i<totalDeFigurinhas;i++) {
			figurinhas[i]=new Figurinha(i,"");			
		}		
	}
	
	public Figurinha fornecerFigurinhaAleatoria() {
		// TODO Auto-generated method stub
		Random novaFigurinha = new Random();
		return figurinhas[novaFigurinha.nextInt(totalDeFigurinhas-1)+1];
		
	}

}
