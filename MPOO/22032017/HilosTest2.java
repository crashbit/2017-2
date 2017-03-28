public class HilosTest2 extends Thread{
	
	private int contador = 10;
	public static int hilos = 0;
	int tiempo;

	public HilosTest2(int t){
		super("HILO " + ++hilos);
		tiempo = t;
	}

	public String toString(){
		return getName() + " : " + contador;
	}

	public void run(){
		while(contador > 0){
			System.out.println(this);
			contador--;
			try{
				sleep(tiempo);
			}catch(InterruptedException e){

			}
		}
	}

	public static void main(String args[]){
		int i;
		Thread hilo;

		hilo = new HilosTest2(500);
		

	}
}