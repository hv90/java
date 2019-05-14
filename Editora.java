package figurinhasAlbum;

import java.util.Random;

public class Editora {
	private int totalDeFigurinhas;
	private Figurinha[] figurinhas;
	
	//************************************************
	public Editora(int totalDeFigurinhas) {
		this.totalDeFigurinhas = totalDeFigurinhas;
		this.figurinhas = new Figurinha[totalDeFigurinhas];
		
		for(int i=0;i<totalDeFigurinhas;i++) {
			figurinhas[i] = new Figurinha(i," ");
		}
		
	}
	
	public Figurinha[] fornecerFigurinhaAleatoria(int numDeFigurinhas) {
		Random novaFigurinha = new Random();
		Figurinha[] novoPacotinho = new Figurinha[numDeFigurinhas+1];
		
		while( numDeFigurinhas >= 0) {
			novoPacotinho[numDeFigurinhas]=figurinhas[novaFigurinha.nextInt(totalDeFigurinhas-1)+1];
			numDeFigurinhas--;
		}
		
		return novoPacotinho;
	}
}
