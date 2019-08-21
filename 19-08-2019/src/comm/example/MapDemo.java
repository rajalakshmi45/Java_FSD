package comm.example;

import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
	
	
	private Map<String,String> map;
	
	public MapDemo() {
		super();
		map = new TreeMap();
	}
	
	public void createMap() {
		map.put("name","renu");
		map.put("address","trichy");
	}

}
