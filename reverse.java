public Map<String, Integer> reverse(Map<Integer, String> map) {
	Map<String, Integer> result = new HashMap<String, Integer>();
	for (int num : map.keySet()) {
		if (!result.containsKey(map.get(num))) {
			result.put(map.get(num), num);
		}
	}
	return result;
}