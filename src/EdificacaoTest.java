import static org.junit.Assert.*;

import org.junit.Test;

public class EdificacaoTest {
	
	float lat1X = 34.f;
	float lont1Y = 53.f;
	float lat2X = 25.f;
	float lont2Y = -90.f;
	float yAxisLimit = 100.f;
	float xAxisLimit = 80.f;
	
	Posicao pos1 = new Posicao(lat1X, lont1Y);
	Posicao pos2 = new Posicao(lat2X, lont2Y);
	Posicao topLeft = new Posicao(0, yAxisLimit);
	Posicao bottomRight = new Posicao(xAxisLimit, 0);
	
	Edificacao ed1 = new Edificacao(pos1);
	Edificacao ed2 = new Edificacao(pos2);
	
	Regiao terreno = new Regiao(topLeft, bottomRight);
	
	
	public boolean incluirEdificacaoItem(Posicionavel item) {
		terreno.incluirItem(item);
		if(item.equals(terreno.retornarItem(item.getPosicao()))) {
			return true;
		}
		return false;
	}

	@Test
	public void testaIncluirDentroDaRegiao() {	
		assertTrue("O Posicionavel nao foi incluido por estar fora da regiao", incluirEdificacaoItem(ed2));
	}
	
	@Test
	public void testaIncluirForaDaRegiao() {
		assertFalse("O Posicionavel foi incluido por estar dentro da regiao", incluirEdificacaoItem(ed1));
	}
	
	
	@Test
	public void testaIncluirEmRegiaoOcupada() {
		terreno.incluirItem(ed1);
		Edificacao ed3 = new Edificacao(pos1);
		assertTrue("O Posicionavel nao foi incluido por estar em regiao ja ocupada", incluirEdificacaoItem(ed3));
	}
	

}
