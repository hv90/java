
public class Edificacao implements Posicionavel {
	private String nome;
	private float areaConstruida;
	private Posicao pos;
	
	public Edificacao(Posicao pos){
		this.pos = pos;
	}
	
	public Posicao getPosicao(){
		return pos;
	}
}
