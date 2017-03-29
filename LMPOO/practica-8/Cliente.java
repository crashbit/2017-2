import java.net.*;
import java.io.*;

public class Cliente{

	public static void main(String args[]){
		Socket cliente;
		InputStreamReader entrada;
		PrintWriter salida;
		BufferedReader flujo;
		String cadena;

		try{
			cliente = new Socket("www.unam.mx", 80);
			entrada = new InputStreamReader(cliente.getInputStream());
			salida = new PrintWriter(cliente.getOutputStream(), true);
			flujo = new BufferedReader(entrada);

			salida.println("get /");
			while((cadena = flujo.readLine())!=null){
				System.out.println(cadena);
			}

			cliente.close();

		}catch(UnknownHostException var){
			System.out.println("Algo sucedio... :(");
		}catch(IOException var){
			System.out.println("Algo sucedio... I/O :(");
		}


	}

}