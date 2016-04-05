public Map<String, Integer> intersect(Map<String, Integer> map1, Map<String, Integer> map2) {
	Map<String, Integer> same = new HashMap<String, Integer>();
	for (String s : map1.keySet()) {
		if (map2.containsKey(s)) {
			if (map2.get(s) == map1.get(s)) {
				same.put(s, map1.get(s));
			}
		}
	}
	return same;
}