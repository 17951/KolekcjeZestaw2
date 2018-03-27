import java.util.HashMap;
import java.util.Map;

//Odwrócenie kluczy i wartoœci
//Napisz program, który z kolekcji HashMap<Integer,Integer> stworzy now¹ mapê, gdzie klucze i wartoœci s¹ zamienione miejscami.

public class OdwrocenieMapy {

	public static void main(String[] args) {

		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 3);
		map.put(3, 9);
		map.put(2, 4);
		map.put(41, 14);
		map.put(6, 36);
		map.put(5, 25);
		System.out.println(map);
		Map<Integer, Integer> map1 = new HashMap<>();

		for (Integer k : map.keySet()) {
				map1.put(map.get(k), k);
		}
		
		System.out.println(map1);
	}

}
