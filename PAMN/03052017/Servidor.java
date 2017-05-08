import java.io.*;
import java.net.*;

public class Servidor{
	private static ClienteHilo[] ch = new ClienteHilo[10];
	private static Socket cliente;

	public static void main(String args[])throws IOException{
		int i=0;
		ServerSocket servidor = new ServerSocket(9292);
		System.out.println("Server is UP");

		while(true){
			cliente = servidor.accept();
			ch[i] = new ClienteHilo(cliente, ch);
			ch[i].start();
			i++;
			System.out.println("Usuario no. " + i);
		}
	}

}