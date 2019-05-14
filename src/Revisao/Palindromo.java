package Revisao;


public class Palindromo {


	public static boolean ehPalindromo(String ex){
		int tam = ex.length();
		StringBuffer resultado = new StringBuffer(tam);



		// Você precisa verificar se existem espaços e deslocar os devidos índices se a posição atual
		// for um espaço em branco, pra que compare apenas as letras da frase, pois o método de verificar palíndromo
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
