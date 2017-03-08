package evolution.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapUtil {
	public static Map<String, Double> updateCount(Map<String, Double> partialCounts, Map<String, Double> counts) {
		if (partialCounts == null) {
			return counts;
		}
		counts = counts == null ? new HashMap<>() : counts;
		for (Entry<String, Double> entry : partialCounts.entrySet()) {
			String key = entry.getKey();
			Double value = entry.getValue();
			if (counts.containsKey(key)) {
				counts.put(key, counts.get(key) + value);
			} else {
				counts.put(key, value);
			}
		}
		return counts;
	}
	
	public static Map<String, Double> updateCount(String key, Map<String, Double> counts) {
		counts = counts == null ? new HashMap<>() : counts;
		if (counts.containsKey(key)) {
			counts.put(key, counts.get(key) + 1d);
		} else {
			counts.put(key, 1d);
		}
		return counts;
	}
}
