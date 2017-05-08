import java.io.*;
import java.net.*;

public class ClienteHilo extends Thread{
	Socket cliente;
	InputStreamReader isr;
	PrintWriter salida;
	BufferedReader entrada;
	String cadena;
	ClienteHilo ch[];

	public ClienteHilo(Socket c, ClienteHilo[] t){
		this.cliente = c;
		this.ch = t;
	}

	public void run(){
		String nickname;
		try{
			isr = new InputStreamReader(cliente.getInputStream());
			salida = new PrintWriter(cliente.getOutputStream(), true);
			entrada = new BufferedReader(isr);

			salida.println("Bienvenido...");
			salida.println("Tu nickname: ");
			nickname = entrada.readLine();
			System.out.println("Se acaba de conectar: " + nickname);
			for(int i=0; i<ch.length;i++){
				if(ch[i]!=null && ch[i]!=this){
					ch[i].salida.println("Acaba de entrar: " + nickname);
				}
			}

			while(true){
				cadena = entrada.readLine();
				if(cadena.startsWith("/salir")) break;
				System.out.println(nickname + " dijo: " + cadena); 
				for(int i=0; i<ch.length;i++){
					if(ch[i]!=null && ch[i]!=this){
						ch[i].salida.println(nickname + " dijo: " + cadena);
					}
				}
			}

			for(int i=0; i<ch.length;i++){
				if(ch[i]!=null && ch[i]!=this){
					ch[i].salida.println("Acaba de irse " + nickname);
				}
			}

			isr.close();
			salida.close();
			cliente.close();
		}catch(IOException e){

		}
	}

}