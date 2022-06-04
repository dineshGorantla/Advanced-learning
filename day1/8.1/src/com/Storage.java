package com;

class Storage {
	private int x;
	public Storage(int X) {
		x = X;
	}
	public int GetX() {
		return (x);
	}
	public Storage(Storage s) {
		this.x = s.GetX();
	}
}

