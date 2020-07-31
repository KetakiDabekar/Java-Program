import java.net.*;
import java.util.*;
import java.io.*;

class Server{

	public static void main(String arg[])throws Exception{
		ServerSocket ss= new ServerSocket(7777);
		Socket s = ss.accept();
		
		Date d = new Date();	
			
		DataOutputStream dos= new DataOutputStream(s.getOutputStream());
		
		dos.writeBytes(d.toString());
		ss.close();
		s.close();	
	
	}





} 
