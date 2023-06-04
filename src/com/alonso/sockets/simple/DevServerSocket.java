/**
 * 
 */
package com.alonso.sockets.simple;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Jalonso98
 *
 */
public class DevServerSocket {

	public static final String EXIT = "EXIT";

	public static void main(String[] args) throws IOException {
		
		try (ServerSocket serverSocket = new ServerSocket(8090)) {
			
			System.out.println("Listening requests....");
			Socket client = serverSocket.accept();
			System.out.printf("Client %s connected\n", client.getInetAddress().getHostName());

			DataInputStream dis = new DataInputStream(client.getInputStream());
			String msg = null;

			do {
				msg = dis.readUTF();
				System.out.printf("%s says: %s\n", client.getInetAddress().getHostName(), msg);
			} while (!EXIT.equals(msg));

			System.out.println("Connection closed...\n");
			client.close();
			dis.close();
		}

	}

}
