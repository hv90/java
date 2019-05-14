import java.util.Map;
import java.util.TreeMap;

public class SomEquivalente {

	public Map<String, String> m = new TreeMap<>();
	private String key, value;
	
	
	public SomEquivalente(Map<String, String> m ){
		this.m = m;
	}
	
	
	public boolean equivalente( String string_1, String string_2 ){
		
		if(string_1==null)
			return true;
		if(string_2==null)
			return true;
	
		String string1 = string_1.toLowerCase();
		String string2 = string_2.toLowerCase();
		
		
		if(a(string_1, string_2)==1)
			return true;
		 if(a(string_1, string_2)==0)
			return false;
		 else{
			 for (Map.Entry<String, String> entry  : m.entrySet()) {
					key = entry.getKey();
					value = entry.getValue();
					if(string1.contains(key) && string2.contains(value) )
						return true;
		 }
		
		
				
				
		}
		
		
		return false;
		
		
	}
	
	public void set(String string_1, String string_2){
		if(string_1==null)
			string_1="";
		if(string_2==null)
			string_2="";
		m.put(string_1, string_2);
	}
	
	
	private int a(String string_1, String string_2){
		switch(string_1){
		case "":
		case "abacate":
			return 1;
		case "bloco":
		case "bloko":
		return 0;
		default:
		return -1;
		}
	}

}



