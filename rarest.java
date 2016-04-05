public int rarest(Map<String, Integer> map) {
	if (map.isEmpty()) {
		throw new IllegalArgumentException();
	}
	Map<Integer, Integer> ages = new TreeMap<Integer, Integer>();
	for (int age : map.values()) {
		if (!ages.containsKey(age)) {
			ages.put(age, 0);
		}
		ages.put(age, ages.get(age) + 1);
	}
	int min = Integer.MAX_VALUE;
	int rare = 0;
	for (int age : ages.keySet()) {
		if (ages.get(age) < min) {
			min = ages.get(age);
			rare = age; 
		}
	}
	return rare;
}