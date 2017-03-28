import java.io.File;
import java.io.*;
import java.util.Scanner;


public class CrearArchivo{
	
	public static void main(String args[]){
		String archivo = "Salida.txt";
		PrintWriter salida = null;
		Scanner teclado = new Scanner(System.in);

		try{
			FileOutputStream stream_salida = new FileOutputStream(archivo, true);
			salida = new PrintWriter(stream_salida);
			System.out.println("Teclea 3 lineas de texto");

			for(int i=0; i<3; i++){
				String linea = teclado.nextLine();
				salida.println(i + " " + linea);
			}

			salida.close();

		}catch(FileNotFoundException e){
			System.out.println("No se encontró el archivo " + archivo);
			System.exit(0);
		}


	}


}