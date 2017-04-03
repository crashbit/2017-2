import java.util.*;
import java.io.*;
import java.net.*;

public class ClienteHilo extends Thread{

	private DataInputStream is = null;
	private PrintStream os = null;
	private Socket clienteSocket = null;
	private final ClienteHilo[] hilos;
	private int maxClientes;

	public ClienteHilo(ClienteHilo [] hilos, Socket clienteSocket){
		this.clienteSocket = clienteSocket;
		this.hilos = hilos;
		this.maxClientes = hilos.length;
	}

	public void run(){
		int maxClientes = this.maxClientes;
		ClienteHilo[] hilos = this.hilos;
		String nombre;

		try{
			is = new DataInputStream(clienteSocket.getInputStream());
			os = new PrintStream(clienteSocket.getOutputStream(), true);
			os.println("Hola :), teclea tu apodo:  ");
			nombre = is.readLine().trim();

			os.println("Bienvenido "+ nombre);

			for(int i=0; i< maxClientes; i++){
				if(hilos[i] != null && hilos[i] != this){
					hilos[i].os.println("Se ha conectado " + nombre);
				}
			}

			while(true){
				String mensaje = is.readLine();
				if(mensaje.startsWith("/salir")){
					break;
				}
				for(int i=0; i< maxClientes; i++){
					if(hilos[i] != null && hilos[i] != this){
						hilos[i].os.println(nombre + " dice> " + mensaje);
					}
				}
			}

			for(int i=0; i< maxClientes; i++){
				if(hilos[i] == this)
					hilos[i] = null;
			}

		is.close();
		os.close();
		clienteSocket.close();


		}catch(Exception var){
			System.out.println("Error en el cliente");
		}

	}



}