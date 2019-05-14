package figurinhasAlbum;

public class Album {

	private Figurinha[] figurinhas;
	private int[] repetidas;
	private int tamanho, quantRepetidas, quantFigurinhasEmAlbum;
	private float precoAlbum, precoFigurinha;

	// ***************************************************************
	// ***************************************************************
	//                  Apenas Poluicao Visual
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
	//                o codigo comeca aqui!!
	// ***************************************************************
	// ***************************************************************

	public Album(int tamanho) {
		this.tamanho = tamanho;
		esvaziarAlbum();
	}
	// ***************************************************************

	public void esvaziarAlbum() {
		// System.out.println("esvaziou!");
		this.figurinhas = new Figurinha[this.tamanho + 1]; // desprezando o zero
		this.repetidas = new int[this.tamanho + 1];
		quantRepetidas = 0;
		quantFigurinhasEmAlbum = 0;
	}
	// ***************************************************************

	public void acrescentarFigurinha(Figurinha[] pacotinho) {
		int figurinha=pacotinho.length;
		int[] pos = new int[figurinha];
		String[] url = new String[figurinha];
		
		//nao existe figurinha 0
		while(figurinha-- >= 1) {
			pos[figurinha]=pacotinho[figurinha].getPosicao();
			url[figurinha] = pacotinho[figurinha].getUrlDaImagem();
			
			if (figurinhas[pos[figurinha]] == null) {
				figurinhas[pos[figurinha]] = new Figurinha(pos[figurinha], url[figurinha]);
				// System.out.println("null "+pos);
				quantFigurinhasEmAlbum++;
			}		 else {
				// System.out.println("full " + pos);
				repetidas[pos[figurinha]]++;
				quantRepetidas++;

			}
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

		Album albumDaCopa = new Album(tamanho);
		Editora editoraAlbumDaCopa = new Editora(tamanho + 1);
		Figurinha[] pacotinho;

		for (int i = 0; i < nExperimentos; i++) {
			if (albumDaCopa.isCheio())
				System.out.println("encheu!");
			while (!albumDaCopa.isCheio()) {

				pacotinho = editoraAlbumDaCopa.fornecerFigurinhaAleatoria(6);

				albumDaCopa.acrescentarFigurinha(pacotinho);

			}
			// System.out.println("qr: " + albumDaCopa.getQuantRepetidas());
			totalFigurinhasCompradas += tamanho + albumDaCopa.getQuantRepetidas();
			albumDaCopa.esvaziarAlbum();
		}

		float mediaFigurinhasCompradas = totalFigurinhasCompradas / (float) nExperimentos;
		System.out.println(String.format("foram compradas %.2f figurinhas em media\n", mediaFigurinhasCompradas));
	}

	// ***************************************************************
	public static void main(String[] args) {
		simularPreenchimentoDoAlbum();

	}
}
