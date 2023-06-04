/**
 * 
 */
package com.alonso.sockets.multiple;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author Jalonso98
 *
 */
public class ClientSocket {
	
	public static final String EXIT = "EXIT";
	
	public static String readMessage() throws IOException {
		System.out.printf("\n->");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
	}
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		try(Socket socket = new Socket("localhost",8090);
				DataOutputStream dos = new DataOutputStream(socket.getOutputStream())){
			String msg = null;
			do {
				msg = readMessage();
				dos.writeUTF(msg);
			}while(!EXIT.equals(msg));
		}
	}

}
