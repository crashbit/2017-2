import java.io.*;
import java.net.*;

public class Servidor{

	public static void main(String args[])throws IOException{
		Socket cliente;
		InputStreamReader isr;
		PrintWriter salida;
		BufferedReader entrada;
		String cadena;

		ServerSocket servidor = new ServerSocket(9090);
		System.out.println("Server is UP");

		while(true){

			cliente = servidor.accept();

			isr = new InputStreamReader(cliente.getInputStream());
			salida = new PrintWriter(cliente.getOutputStream(), true);
			entrada = new BufferedReader(isr);

			salida.println("Quihubos...");
			salida.println("Bienvenido al servidor de CHAT-ZH4K4");

			salida.println("Teclea algo");
			cadena = entrada.readLine();
			System.out.println("El usuario tecleo: " + cadena);
			salida.println("Usted tecleo: "+ cadena);
			salida.println("...Adios...");

			isr.close();
			salida.close();
			cliente.close();
		}
	}

}