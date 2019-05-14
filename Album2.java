package figurinhasAlbum;

public class Album2 {

	private Figurinha[] figurinhas;
	private int[] repetidas;
	private int tamanho, quantRepetidas, quantFigurinhasEmAlbum;
	private float precoAlbum, precoFigurinha;

	// ***************************************************************
	// ***************************************************************
	//                    Poluicao Visual
	// ***************************************************************
	// ***************************************************************

	public float getPrecoAlbum() {
		return precoAlbum;
	}
	// ***************************************************************

	public void setPrecoAlbum(float precoAlbum) {
		if (precoAlbum >= 0) {
			this.precoAlbum = precoAlbum;
		} else {
			System.out.println("Valor invalido!!!");
		}
	}
	// ***************************************************************

	public float getPrecoFigurinha() {
		return precoFigurinha;
	}
	// ***************************************************************

	public void setPrecoFigurinha(float precoFigurinha) {
		this.precoFigurinha = precoFigurinha;
	}
	// ***************************************************************

	public int getQuantRepetidas() {
		return this.quantRepetidas;
	}
	// ***************************************************************

	public void trocarFigurinha(int figurinhaQueEntra, int repetidaQueSai) {
		if (descartarFigurinhaRepetida(repetidaQueSai)) {
			// acrescentarFigurinha(figurinhaQueEntra);
		} else {
			System.out.println("Impossivel fazer essa troca!");
		}
	}
	// ***************************************************************

	/**
	 * Descarta um figurinha repetida daquele album.
	 *
	 * @param figurinha
	 *            O numero da figurinha que eu quero descartar
	 * @return true, se a figurinha foi descartada com sucesso; false, caso
	 *         contrario (se a figurinha nao era repetida)
	 */
	public boolean descartarFigurinhaRepetida(int figurinha) {
		if (this.figurinhas[figurinha].getPosicao() == figurinha) {
			// this.figurinhas[figurinha]--;
			this.quantRepetidas--;
			return true;
		}

		System.out.println("A figurinha nao eh repetida!!");
		return false;
	}

	// ***************************************************************
	// ***************************************************************
	//                  o codigo comeca aqui!!
	// ***************************************************************
	// ***************************************************************

	public Album2(int tamanho) {
		this.tamanho = tamanho;
		esvaziarAlbum();
	}
	// ***************************************************************

	public void esvaziarAlbum() {
		//System.out.println("esvaziou!");
		this.figurinhas = new Figurinha[this.tamanho + 1]; // desprezando o zero
		this.repetidas = new int[this.tamanho + 1];
		quantRepetidas = 0;
		quantFigurinhasEmAlbum = 0;
	}
	// ***************************************************************

	public void acrescentarFigurinha(Figurinha figurinha) {
		int pos = figurinha.getPosicao();
		String url = figurinha.getUrlDaImagem();

		if (figurinhas[pos] == null) {
			figurinhas[pos] = new Figurinha(pos, url);
			// System.out.println("null "+pos);
			quantFigurinhasEmAlbum++;
		} else {
			// System.out.println("full " + pos);
			repetidas[pos]++;
			quantRepetidas++;

		}

	}

	// ***************************************************************
	public boolean isCheio() {
		return quantFigurinhasEmAlbum == this.tamanho;
	}

	// ***************************************************************

	public static void simularPreenchimentoDoAlbum() {

		int tamanho = 690;
		int nExperimentos = 10000;
		long totalFigurinhasCompradas = 0;

		Album2 albumDaCopa = new Album2(tamanho);
		Editora2 editoraAlbumDaCopa = new Editora2(tamanho + 1);
		Figurinha novaFigurinha;

		for (int i = 0; i < nExperimentos; i++) {
			if (albumDaCopa.isCheio())
				System.out.println("encheu!");
			while (!albumDaCopa.isCheio()) {

				novaFigurinha = editoraAlbumDaCopa.fornecerFigurinhaAleatoria();

				albumDaCopa.acrescentarFigurinha(novaFigurinha);

			}
			//System.out.println("qr: " + albumDaCopa.getQuantRepetidas());
			totalFigurinhasCompradas += tamanho + albumDaCopa.getQuantRepetidas();
			albumDaCopa.esvaziarAlbum();
		}

		
		

		float mediaFigurinhasCompradas = totalFigurinhasCompradas / (float) nExperimentos;
		System.out.println(String.format("foram compradas %.2f figurinhas em media\n", mediaFigurinhasCompradas));
	}

	// ***************************************************************
	public static void main(String[] args) {
		//simularPreenchimentoDoAlbum();

	}
}
