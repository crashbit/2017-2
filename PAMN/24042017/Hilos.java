public class Hilos extends Thread implements Interfaces{

	public void run(){
		int i;
		for(i=0;i<10;i++){
			System.out.println("Hilo: " + i);
		}

	}

	public static void main(String args[]){

		Hilos uno = new Hilos();
		Hilos dos = new Hilos();
		Hilos tres = new Hilos();

		uno.start();
		System.out.println("---------------------");
		dos.start();
		System.out.println("---------------------");
		tres.start();

	}

}