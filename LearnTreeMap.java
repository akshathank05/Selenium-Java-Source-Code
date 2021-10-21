package LearnCollections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class LearnTreeMap {

	public static void main(String[] args) {
		Map<Integer,String> map = new TreeMap<Integer,String>();
		map.put(100, "Rahul");
		map.put(101, "Rachit");
		map.put(102, "Nirossan");
		map.put(104, "Prudhvi");
		map.put(105, "Akshatha");

		 Set<Integer> keySet = ((TreeMap<Integer, String>) map).descendingKeySet();
		 for (Integer key : keySet) {
	          
	            System.out.println(key + " = "
	                               + map.get(key));
	        }
	
	}

}
