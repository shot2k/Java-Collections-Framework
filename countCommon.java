public int countCommon(List<Integer> list1, List<Integer> list2) {
	Set<Integer> common = new HashSet<Integer>();
	Set<Integer> set1 = new HashSet<Integer>(list1);
	Set<Integer> set2 = new HashSet<Integer>(list2);
	for (int num : set1) {
		if (set2.contains(num)) {
			common.add(num);
		}
	}
	return common.size();
}