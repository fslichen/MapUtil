package evolution.util;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class UpdateCountTest {
	@Test
	public void testUpdateCount4SingleKeyCase() {
		Map<String, Double> map = new HashMap<>();
		MapUtil.updateCount("apple", map);
		MapUtil.updateCount("pear", map);
		MapUtil.updateCount("apple", map);
		System.out.println(map);
	}
	
	@Test
	public void testUpdateCount4DoubleMapCase() {
		Map<String, Double> map0 = new HashMap<>();
		map0.put("apple", 3d);
		map0.put("pear", 4d);
		Map<String, Double> map1 = new HashMap<>();
		map1.put("apple", 5d);
		map1.put("pear", 2d);
		Map<String, Double> result = MapUtil.updateCount(map0, map1);
		System.out.println(result);
	}
}
