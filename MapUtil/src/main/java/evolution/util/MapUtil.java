package evolution.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapUtil {
	public static Map<String, Integer> updateCount(Map<String, Integer> partialSummary, Map<String, Integer> summary) {
		summary = summary == null ? new HashMap<>() : summary;
		for (Entry<String, Integer> entry : partialSummary.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			if (summary.containsKey(key)) {
				summary.put(key, summary.get(key) + value);
			} else {
				summary.put(key, value);
			}
		}
		return summary;
	}
}
