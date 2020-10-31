package hilos;

public class Productor extends Thread {
	private Tuberia tuberia;
	private String alfabeto = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";

	public Productor(Tuberia t) {
		this.tuberia = t;
	}

	public void run() {
		char c;
		for (int i = 0; i < 10; i++) {
			c = alfabeto.charAt((int) (Math.random() * 26));
			tuberia.lanzar(c);
			System.out.println("Lanzado " + c + " a la tuberia");
			try {
				sleep((int) (Math.random() * 100));
			} catch (InterruptedException e) {
				
			}
		}
	}

}
