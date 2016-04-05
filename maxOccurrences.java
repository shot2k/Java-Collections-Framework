public int maxOccurrences(List<Integer> list) {
	if (list.size() == 0) {
		return 0;
	} else {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int num : list) {
			if (!map.containsKey(num)) {
				map.put(num, 0);
			}
			map.put(num, map.get(num) + 1);
		}
		int max = 1;
		for (int num : map.values()) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}
}