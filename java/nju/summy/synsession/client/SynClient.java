package nju.summy.synsession.client;

import java.io.*;
import java.net.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SynClient extends Thread {
	private DataOutputStream toServer;
	private DataInputStream fromServer;
	
	public SynClient(){
//		System.out.println("m");
	}

	public void run() {
//		System.out.println("m");
		try {
			Socket socket = new Socket("localhost",8000);
			fromServer = new DataInputStream(socket.getInputStream());
			toServer = new DataOutputStream(socket.getOutputStream());
			toServer.writeUTF("hello");
			toServer.flush();
		}
		catch(IOException ex) {
			System.err.println(ex);
		}
	}
	
	//to do
	private class SessionChangedListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				toServer.writeBytes("hello");
				toServer.flush();
			}
			catch (IOException ex) {
				System.err.println(ex);
			}
		}		
	}
	
}

