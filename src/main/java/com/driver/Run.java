package com.driver;

public class Run implements Runnable {
	private String name;

	public Run(String string) {
		this.name = string;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 10; i++) {
			System.out.println(this.name + "" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
