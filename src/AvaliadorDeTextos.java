
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import javax.sound.midi.Synthesizer;
public class AvaliadorDeTextos {

	private ArrayList<String> texto = new ArrayList<String>();
	public AvaliadorDeTextos (ArrayList<String> texto, ArrayList<String> stopWord){
		this.texto = texto;
		replace(this.texto);
		concatenate(this.texto);
	}
	
	public static void replace(List<String> texto)
	{
	    ListIterator<String> iterator = texto.listIterator();
	    while (iterator.hasNext())
	    {
	        iterator.set(iterator.next().toLowerCase());
	    }
	}
	
	public static void concatenate(List<String> texto){
		String listString = texto.stream().map(Object::toString)
                .collect(Collectors.joining(", "));
	}

	public int getNumeroDeLinhas(){

		return texto.size();
	}
	
	public int getNumeroDePalavras(){
		int nPalavras = 0;
		for(int i=0;i<texto.size();i++){
			String palavras[] = texto.get( i ).split( "[. ,;!?\t-:]+" );
			List<String> itemList = (List<String>) Arrays.asList(palavras);
			nPalavras+=itemList.size();
			
		}
		return nPalavras;
	}
	
	public int getNumeroDePalavrasDistintas(){
		int nPalavras=0;
		for(int i=0;i<texto.size();i++){
			String palavras[] = texto.get( i ).split( "[. ,;!?\t-:]+" );
			Set<String> distintas = Arrays.asList(palavras).stream()
					.collect(Collectors.toSet()); 
			nPalavras += distintas.size();
			System.out.printf("%s%d\n",texto,nPalavras);
		}
		return nPalavras;
	}
	
	ArrayList<String> getPalavrasMaisFrequentes( int n ){
		
		return texto;
	}
	
	ArrayList<String> getStopWordsMaisFrequentes( int n ){
		
		return texto;
	}
	
	Map<String,Integer> getFrequenciaDePalavras(){
		
		return null;
	}
	

	Map<String,Integer> getFrequenciaDeStopWords(){
		
		return null;
	}
	
	
	
}
