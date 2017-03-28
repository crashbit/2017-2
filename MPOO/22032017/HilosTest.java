public class HilosTest extends Thread{
	
	private int contador = 10;
	public static int hilos = 0;

	public HilosTest(){
		super("HILO " + ++hilos);
	}

	public String toString(){
		return getName() + " : " + contador;
	}

	public void run(){
		while(contador > 0){
			System.out.println(this);
			contador--;
			try{
				sleep(1000);
			}catch(InterruptedException e){

			}


		}
	}

	public static void main(String args[]){
		int i;
		Thread hilo;

		for(i =0;i<5;i++){
			hilo = new HilosTest();
			hilo.start();
		}

	}
}