/**
 * 
 */
package com.alonso.sockets.multiple;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

class WorkerSocket extends Thread{
	private Socket client;
	
	public static final String EXIT = "EXIT";

	public WorkerSocket(Socket client) {
		this.client = client;
	}

	@Override
	public void run() {
		try(DataInputStream dis = new DataInputStream(client.getInputStream())){
			String msg = null; 
			do {
				msg = dis.readUTF();
				System.out.printf("%s says: %s\n",client.getInetAddress().getHostName(),msg);
			}while(!EXIT.equals(msg));
		} catch (IOException e) {
			System.err.println("Error while connecting with client!\n" + e.getMessage());
		}
	}
	
}

/**
 * @author Jalonso98
 *
 */
public class ServerSocketMultiClient {
	public static void main(String[] args) throws IOException {
		try(ServerSocket serverSocket = new ServerSocket(8090)){
			while(true) {
				System.out.println("Listening on port 8090...");
				Socket client = serverSocket.accept();
				System.out.println("Client connected on " + client.getInetAddress().getHostAddress());
				new WorkerSocket(client).start();
			}
		}
	}
}
