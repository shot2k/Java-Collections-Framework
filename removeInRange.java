public void removeInRange (List<Integer> list, int element, int start, int end) {
	for (int i = start; i < list.size(); i++) {
		if (i < end) {
			if (list.get(i) == element) {
				list.remove(i);
				end--;
				i--;
			}
		}
	}
}