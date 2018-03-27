import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Sp�aszczenie mapy
//a. Z wszystkich kluczy i warto�ci kolekcji HashMap<Integer,Integer> utw�rz kolekcj� ArrayList<Integer>. 
//b. Z wszystkich kluczy i warto�ci kolekcji HashMap<Integer,HashMap<Integer,Integer>> utw�rz kolekcj� ArrayList<Integer>. 
//Np dla mapy [[3,[[5,2],[7,9]], [7,[[4,4],[2,11]]] wynikiem b�dzie [3,5,2,7,9,7,4,4,2,11] (niekoniecznie w takiej kolejno�ci).

public class SplaszczenieMapy {
	public static void main(String[] args) {

		Map<Integer, Integer> map = new HashMap<>();
		map.put(3, 9);
		map.put(2, 4);
		map.put(4, 16);
		map.put(6, 36);
		map.put(5, 25);

		List<Integer> list = new ArrayList<>();

		for (Integer k : map.keySet()) {
			list.add(k);
			list.add(map.get(k));
		}

		//lepiej zrobic:
		list.addAll(map.keySet());
		list.addAll(map.values());
		System.out.println(list);
		

		
	}
}
