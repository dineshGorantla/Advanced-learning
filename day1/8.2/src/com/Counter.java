package com;

class Counter implements Runnable {

	Storage st;

	public Counter(Storage store) {
		st = store;
	}
	@Override
	public void run() {
		synchronized (st) {
			for (int i = 0; i < 10; i++) {
				while (!st.isPrinted()) { 
					try {
						st.wait();
					} catch (Exception e) {
					}
				}
				st.setValue(i);
				st.setPrinted(false);
				st.notify();
			}
		}
	}
}
