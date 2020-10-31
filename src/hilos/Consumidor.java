package hilos;

public class Consumidor extends Thread {
	private Tuberia tuberia;

	public Consumidor(Tuberia tuberia) {
		this.tuberia = tuberia;
	}

	public void run() {
		char c;
		for (int i = 0; i < 10; i++) {
			c = tuberia.recoger();
			System.out.println("Recogido el caracter " + c);
			try {
				sleep((int) (Math.random() * 2000));
			} catch (InterruptedException e) {
			}
		}
	}

}
