package Revisao;


public class Palindromo {


	public static boolean ehPalindromo(String ex){
		int tam = ex.length();
		StringBuffer resultado = new StringBuffer(tam);



		// Voc� precisa verificar se existem espa�os e deslocar os devidos �ndices se a posi��o atual
		// for um espa�o em branco, pra que compare apenas as letras da frase, pois o m�todo de verificar pal�ndromo
		// parou de funcionar quando troquei "subino" para "subi no"
	
	//*******************************************************************
	int i=0, j=0;
	while(i<tam) {		
		switch(ex.charAt(i)) {
			case ' ':
				++i;
			default:
				resultado.insert(j++, ex.charAt(i++));
		}		
	}
	//********************************************************************
	i=j=0;
	tam=resultado.length();
	while(i<tam) {
		if(resultado.charAt(i++) != resultado.charAt(tam-1-j++)){
			System.out.println(i+"    nao ok "+resultado.toString());
			return false;
		}
	}
	//*******************************************************************
		return true;
		
		

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ex1 = "arara";
		String ex2 = "socorram me subi no onibus em marroco";

		System.out.println(ehPalindromo(ex2));




	}


}
