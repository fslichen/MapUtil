package evolution.util;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class UpdateCountTest {
	@Test
	public void testUpdateCount4SingleKeyCase() {
		Map<String, Integer> map = new HashMap<>();
		MapUtil.updateCount("apple", map);
		MapUtil.updateCount("pear", map);
		MapUtil.updateCount("apple", map);
		System.out.println(map);
	}
	
	@Test
	public void testUpdateCount4DoubleMapCase() {
		Map<String, Integer> map0 = new HashMap<>();
		map0.put("apple", 3);
		map0.put("pear", 4);
		Map<String, Integer> map1 = new HashMap<>();
		map1.put("apple", 5);
		map1.put("pear", 2);
		Map<String, Integer> result = MapUtil.updateCount(map0, map1);
		System.out.println(result);
	}
}
