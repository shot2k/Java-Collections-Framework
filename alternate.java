public List<Integer> alternate(List<Integer> list1, List<Integer> list2) {
	List<Integer> result = new ArrayList<Integer>();
	if (list1.size() <= list2.size()) {
		int remain = 0;
		for (int i = 0; i < list1.size(); i++) {
			result.add(list1.get(i));
			result.add(list2.get(i));
			remain++;
		}
		for (int i = remain; i < list2.size(); i++) {
			result.add(list2.get(i));
		}
	} else {
        int remain = 0;
		for (int i = 0; i < list2.size(); i++) {
			result.add(list1.get(i));
			result.add(list2.get(i));
            remain++;
		}
        for (int i = remain; i < list1.size(); i++) {
            result.add(list1.get(i));
        }
	}
	return result;
}