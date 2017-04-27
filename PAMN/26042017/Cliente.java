import java.io.*;
import java.net.*;

public class Cliente{

	public static void main(String args[]) throws UnknownHostException, IOException{
		Socket cliente;
		InputStreamReader isr;
		PrintWriter salida;
		BufferedReader entrada;
		String cadena;

		cliente = new Socket("www.unam.mx", 80);
		isr = new InputStreamReader(cliente.getInputStream());
		salida = new PrintWriter(cliente.getOutputStream(), true);
		entrada = new BufferedReader(isr);

		salida.println("get /");
		while((cadena = entrada.readLine())!=null)
			System.out.println(cadena);

		isr.close();
		salida.close();
		cliente.close();
	}
}