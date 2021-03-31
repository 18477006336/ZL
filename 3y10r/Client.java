
import java.io.*;
import java.net.*;

//自动升级：服务器给客户端发送文件
/*
锻炼逻辑和思路
*/

public class Client{
	public static void main(String args[]){
		//端口：提供软件的自动升级服务
		try
		{
			Socket socket=new Socket("localhost",8888);
			/*
			读取服务器端发的消息
			使用输入流，然后DataOutputStream进行包装
			*/
			InputStream is=socket.getInputStream();
			DataInputStream dis=new DataInputStream(is);
			String fileName=dis.readUTF();
			System.out.println("文件名："+fileName);
			//如何在本机创建文件？
			FileOutputStream fos=new FileOutputStream("E:\\"+fileName);

			byte buff[]=new byte[8192];
			int a=0;
			while((a=dis.read(buff))!=-1){
				fos.write(buff,0,a);
			}
			fos.flush();
			dis.close();
			fos.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}