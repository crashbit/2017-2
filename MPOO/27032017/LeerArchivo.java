import java.io.File;
import java.io.*;
import java.util.Scanner;

public class LeerArchivo{

	public static void main(String args[]){
		String nomArchivo = "Salida.txt";
		Scanner entrada = null;
		System.out.println("El archivo " + nomArchivo + " tiene los siguiente: ");

		try{
			entrada = new Scanner(new File(nomArchivo));
		}catch(FileNotFoundException e){
			System.out.println("No se encontró el archivo " + nomArchivo);
			System.exit(0);
		}

		while(entrada.hasNextLine()){
			String linea = entrada.nextLine();
			System.out.println(linea);
		}

		entrada.close();

	}
}