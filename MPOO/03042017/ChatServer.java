import java.util.*;
import java.io.*;
import java.net.*;

public class ChatServer{

	static Socket cliente;
	static ClienteHilo ch[] = new ClienteHilo[10];

	public static void main(String args[]){
		int i=0;

		try{
			ServerSocket servidor = new ServerSocket(8080);
			System.out.println("Servidor listo");

			while(i<10){
				cliente = servidor.accept();
				ClienteHilo c = new ClienteHilo(ch, cliente);
				ch[i] = c;
				ch[i].start();
				i++;
				System.out.println("Conectado " + i + " usuarios");
			}
		}catch(Exception var){
			System.out.println("Erroooor");
		}

	}

}