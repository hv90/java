import java.util.ArrayList;
public class Principal {

	public static void main(String[] args) {
		ArrayList<String> texto = new ArrayList<String>();
		texto.add("Essa frase tem cinco palavras. Aqui estão mais cinco palavras. ");
		texto.add( "Agora ouça. Eu vario o tamanho da frase e " + "crio música. Música. A escrita canta. "
                + "Tem um ritmo agradável, melodia, harmonia. " + "Eu uso períodos curtos. E eu uso frases de "
                + "duração média." );

		
		ArrayList<String> stopWord = new ArrayList<String>();
		stopWord.add("da");
		
		AvaliadorDeTextos avt = new AvaliadorDeTextos(texto, stopWord);
		
		System.out.printf("%d",
				avt.getNumeroDePalavrasDistintas());

	}

}
