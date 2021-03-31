
import java.io.*;
import java.net.*;

//自动升级：服务器给客户端发送文件
/*
锻炼逻辑和思路
*/

public class Server{
	public static void main(String args[]){
		//端口：提供软件的自动升级服务
		try
		{
			ServerSocket ss=new ServerSocket(8888);//本机开辟8888端口对外提供服务
			while(true){
				Socket socket=ss.accept();//阻塞方法
				System.out.println("新用户进入......");
				/*
				启动线程给新进入的用户发送文件
				*/
				SendFileThread sendFileThread=new SendFileThread(socket);
				sendFileThread.start();
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
class SendFileThread extends Thread
{
	Socket socket;
	public SendFileThread(Socket socket){
		this.socket=socket;
	}
	public void run(){
		try
		{
			/*
			传文件，但是传文件之前先把文件名传过去
			*/
			
			File file=new File(ParseXML.getFileName());
			OutputStream os=socket.getOutputStream();
			DataOutputStream dos=new DataOutputStream(os);//os没有writeUTF功能，所以用DataOutputStream进行包装
			dos.writeUTF(file.getName());
			dos.flush();

			FileInputStream fis=new FileInputStream(file);
			//开始传文件：先读再写
			byte buff[]=new byte[8192];//Java默认缓冲区大小也是8192
			int a=0;
			while((a=fis.read(buff))!=-1){
				dos.write(buff,0,a);
			}
			dos.flush();
			dos.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
}