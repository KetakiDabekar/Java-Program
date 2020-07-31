import java.net.*;
import java.io.*;


class A {

	public static void main(String arg[])throws Exception{
		
		ServerSocket ss = new ServerSocket(7777);
		Socket s= ss.accept();
		InputStream in =s.getInputStream();
		OutputStream out = s.getOutputStream();

		DataInputStream fromClient= new DataInputStream(in);
		
		DataOutputStream toClient = new DataOutputStream(out);
		String str="";
		while(true){
		str=fromClient.readUTF();
		if(str.equals("END")==true)
			break;		
		toClient.writeUTF(str.toUpperCase());		
		}	
	
	}


}
