public int countUnique(List<Integer> list) {
	if(list.isEmpty()) {
		return 0;
	} else {
		Set<Integer> unique = new HashSet<Integer>();
		for (int num : list) {
			unique.add(num);
		}
		return unique.size();
	}
}