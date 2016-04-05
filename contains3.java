public boolean contains3(List<String> list) {
	Map<String, Integer> map = new HashMap<String, Integer>();
	for (String s : list) {
		if (!map.containsKey(s)) {
			map.put(s, 0);
		}
		map.put(s, map.get(s) + 1);
	}
	for (String s : map.keySet()) {
		if (map.get(s) >= 3) {
			return true;
		}
	}
	return false;
}