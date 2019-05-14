package figurinhasAlbum;

public class Figurinha {
	private int posicao;
	private String urlDaImagem;
	private int frequenciaRelativa = 10;
	
	//************************************************
	public Figurinha(int posicao, String urlDaImagem) {
		this.posicao = posicao;
		this.urlDaImagem = urlDaImagem;
	}

	//************************************************
	public int getPosicao() {
		return posicao;
	}
	//************************************************
	public String getUrlDaImagem() {
		return urlDaImagem;
	}
	//************************************************
	public int getFrequenciaRelativa() {
		return frequenciaRelativa;
	}
	//************************************************
	public void setFrequenciaRelativa(int frequenciaRelativa) {
		if(frequenciaRelativa>0 && frequenciaRelativa<=20) {
			this.frequenciaRelativa = frequenciaRelativa;
		}
	}
	
	
}
