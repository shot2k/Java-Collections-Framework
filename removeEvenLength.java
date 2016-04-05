public void removeEvenLength(Set<String> set) {
	Iterator<String> s = set.iterator();
	while (s.hasNext()) {
		if (s.next().length() % 2 == 0) {
			s.remove();
		}
	}
}