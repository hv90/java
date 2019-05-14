
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float lat1X = 34.f;
		float lt1Y = 53.f;
		float lat2X = 25.f;
		float lt2Y = 90.f;
		float yAxisLimit = 100.f;
		float xAxisLimit = 80.f;
		
		Posicao pos1 = new Posicao(30.f, lt1Y);
		Posicao pos2 = new Posicao(lat2X, lt2Y);
		Posicao topLeft = new Posicao(0, yAxisLimit);
		Posicao bottomRight = new Posicao(xAxisLimit, 0);
		
		Edificacao ed1 = new Edificacao(pos1);
		Edificacao ed2 = new Edificacao(pos2);
		
		Regiao terreno = new Regiao(topLeft, bottomRight);
		
		terreno.incluirItem(ed1);
		System.out.println(terreno.retornarItem(pos1).toString());
		
		
	}

}
