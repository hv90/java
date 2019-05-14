import java.util.Map;
import java.util.TreeMap;

public class Principal {

    public static void main( String[] args ) {
        Map<String, String> m = new TreeMap<>();

        m.put( "ch", "x" );
        m.put( "�", "s" );

        SomEquivalente porSom = new SomEquivalente( m );
        porSom.set(null, null);
        
        System.out.println( porSom.equivalente( "bloco", "br�co" ) );
        System.out.println( porSom.equivalente( "chuchu", "chuxu" ) );

    }

}