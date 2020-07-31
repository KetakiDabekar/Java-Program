import java.io.*;
import java.net.*;
class Client{
	public static void main(String argv[]) throws Exception{
		Socket s= new Socket("localhost",7777);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		InputStream in =s.getInputStream();
		OutputStream out = s.getOutputStream();

		DataInputStream fromServer= new DataInputStream(in);
		DataOutputStream toServer = new DataOutputStream(out);
		String str="";
		while(true){
			System.out.print("$");
			str=br.readLine();
			toServer.writeUTF(str);
			if(str.equals("END")==true)break;
			System.out.println(fromServer.readUTF());			
		}	
	}
}

