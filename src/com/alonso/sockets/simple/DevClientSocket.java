package com.alonso.sockets.simple;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author Jalonso98
 *
 */
public class DevClientSocket {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		try(Socket socket = new Socket("localhost",8090);
				DataOutputStream dos = new DataOutputStream(socket.getOutputStream())){
			dos.writeUTF("Hi! I'm a socket client :)");
			dos.writeUTF("Bye!");
			dos.writeUTF("EXIT");
			dos.close();
		}
		finally {
			System.out.println("Client has finished!");
		}
	}	

}
