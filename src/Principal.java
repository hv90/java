import java.util.ArrayList;
public class Principal {

	public static void main(String[] args) {
		ArrayList<String> texto = new ArrayList<String>();
		texto.add("Essa frase tem cinco palavras. Aqui est�o mais cinco palavras. ");
		texto.add( "Agora ou�a. Eu vario o tamanho da frase e " + "crio m�sica. M�sica. A escrita canta. "
                + "Tem um ritmo agrad�vel, melodia, harmonia. " + "Eu uso per�odos curtos. E eu uso frases de "
                + "dura��o m�dia." );

		
		ArrayList<String> stopWord = new ArrayList<String>();
		stopWord.add("da");
		
		AvaliadorDeTextos avt = new AvaliadorDeTextos(texto, stopWord);
		
		System.out.printf("%d",
				avt.getNumeroDePalavrasDistintas());

	}

}
