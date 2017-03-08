package evolution.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapUtil {
	public static Map<String, Double> updateCount(Map<String, Double> partialSummary, Map<String, Double> summary) {
		if (partialSummary == null) {
			return summary;
		}
		summary = summary == null ? new HashMap<>() : summary;
		for (Entry<String, Double> entry : partialSummary.entrySet()) {
			String key = entry.getKey();
			Double value = entry.getValue();
			if (summary.containsKey(key)) {
				summary.put(key, summary.get(key) + value);
			} else {
				summary.put(key, value);
			}
		}
		return summary;
	}
	
	public static Map<String, Double> updateCount(String key, Map<String, Double> summary) {
		if (summary.containsKey(key)) {
			summary.put(key, summary.get(key) + 1d);
		} else {
			summary.put(key, 1d);
		}
		return summary;
	}
}
