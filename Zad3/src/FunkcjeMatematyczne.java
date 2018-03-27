import java.util.HashMap;
import java.util.Map;

//Interpretujemy map� typu HashMap<Integer,Integer> jako funkcj� (w sensie matematycznym). Je�li f(x)=y, to w mapie b�dzie para [x,y].
//a. Napisz statyczn� metod�, kt�ra dla podanych dw�ch funkcji zwr�ci ich z�o�enie (now� map�). 
//b. Napisz statyczn� metod� zwracaj�c� funkcj� odwrotn� do podanej jako parametr; je�li funkcja odwrotna nie istnieje, wyrzucony zostaje wyj�tek BrakOdwrotnej.

public class FunkcjeMatematyczne {

	public static Map<Integer, Integer> zlozenie(Map<Integer, Integer> mapa1, Map<Integer, Integer> mapa2) {
		Map<Integer, Integer> result = new HashMap<Integer, Integer>();
		for (Integer k : mapa1.keySet()) {
			Integer w = mapa1.get(k);
			if (mapa2.containsKey(w)) {
				result.put(k, mapa2.get(w));
			}

		}

		return result;
	}

	public static void main(String[] args) {
		Map<Integer, Integer> f = new HashMap<Integer, Integer>();
		Map<Integer, Integer> g = new HashMap<Integer, Integer>();
		f.put(1, 1250);
		f.put(2, 1260);
		f.put(3, 1270);
		f.put(4, 1280);

		g.put(1250, 88);
		g.put(1260, 89);
		g.put(1270, 90);
		g.put(1280, 91);

		Map<Integer, Integer> wynik = new HashMap<Integer, Integer>();
		wynik = zlozenie(f, g);
		System.out.println(wynik);

	}
}
