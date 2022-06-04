package com;

class Printer implements Runnable {
	Storage st;
	public Printer(Storage st) {
		this.st = st;
	}

	@Override
	public void run() {
		synchronized (st) {
			for (int i = 0; i < 10; i++) {
				while (st.isPrinted()) { 
					try {
						st.wait();
					} catch (Exception e) {
					}
				}
				System.out.println(Thread.currentThread().getName() + " " + st.getValue());
				st.setPrinted(true);
				st.notify();
			}
		}
	}
}
