import java.net.*;
import java.io.*;


class Server{
public static void main(String args[])throws Exception{
ServerSocket ss=new ServerSocket(7777);
Socket s=ss.accept();

OutputStream obj=s.getOutputStream();
PrintStream ps=new PrintStream(obj);

java.util.Date date=new java.util.Date();
ps.println(date.toString());

ps.close();
ss.close();
s.close(); 
}
}
