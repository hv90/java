
import java.util.HashMap;
import java.util.Map;

public class Regiao {

	private Posicao topLeft;//longitude, y
	private Posicao bottomRight;//latitude, x
	Map<Posicao, Posicionavel> hashMapa = new HashMap<>();
	
	public Regiao(Posicao topLeft, Posicao bottomRight){
		this.topLeft = topLeft;
		this.bottomRight = bottomRight;
	}
	
	public void incluirItem(Posicionavel item){
		Posicao pos = item.getPosicao();
		
		if((pos.latitude>=0 && pos.latitude<=bottomRight.latitude)&&
				(pos.longitude>=0 && pos.longitude<=topLeft.longitude)&&
				hashMapa.containsKey(pos)==false){
			
			hashMapa.put(item.getPosicao(), item);
		}		
	}
	
	public Posicionavel retornarItem(Posicao pos){
		
		if(hashMapa.containsKey(pos)){
			return hashMapa.get(pos);
		}		
		return null;
	}
	
	
}
