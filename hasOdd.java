public boolean hasOdd(Set<Integer> set) {
	for (int num : set) {
		if (num % 2 != 0) {
			return true;
		}
	}
	return false;
}