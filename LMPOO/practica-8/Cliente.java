import java.net.*;
import java.io.*;

public class Cliente{

	public static void main(String args[]){
		Socket cliente;
		InputStream entrada;
		DataInputStream flujo;

		try{
			cliente = new Socket("www.unam.mx", 80);
			entrada = cliente.getInputStream();
			flujo = new DataInputStream(entrada);
			System.out.println(flujo.readUTF());
			cliente.close();

		}catch(UnknownHostException var){
			System.out.println("Algo sucedio... :(");
		}catch(IOException var){
			System.out.println("Algo sucedio... I/O :(");
		}


	}

}