import java.net.*;
import java.io.*;


class Client{

	public static void main(String arg[])throws Exception{
		Socket s = new Socket("localhost",7777);
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream())); 
	
		System.out.println(br.readLine());			
		br.close();
		s.close();	
		
	}





} 
