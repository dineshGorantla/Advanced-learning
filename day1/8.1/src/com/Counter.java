package com;

class Counter implements Runnable
{

	private int N;
	public Counter(int n) {
		N = n;
	}
	public int GetN() {
		return (N);
	}

	public void run()
	{
		for (int i= 1; i<= N; i++)
		{
			Storage storage = new Storage(i);
			Printer printer = new Printer(storage);
			Thread.yield();
			printer.run();
		}
	}
}
