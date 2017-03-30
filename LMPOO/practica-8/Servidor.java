import java.net.*;
import java.io.*;

public class Servidor{

	public static void main(String args[])throws IOException{
		ServerSocket servidor;
		Socket usuario;

		InputStreamReader entrada;
		PrintWriter salida;
		BufferedReader flujo;
		String cadena;


		servidor = new ServerSocket(3000);
		usuario = servidor.accept();

		entrada = new InputStreamReader(usuario.getInputStream());
		salida = new PrintWriter(usuario.getOutputStream(), true);
		flujo = new BufferedReader(entrada);

		salida.println("Hola usuario... :) ");
		salida.println("Teclea tu passwdord: ");
		cadena = flujo.readLine();

		salida.println("Tecleaste: " + cadena);
		System.out.println("El usuario tecleo: " + cadena);

		usuario.close();
	}



}