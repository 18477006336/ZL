
import java.io.*;
import java.net.*;

//�Զ����������������ͻ��˷����ļ�
/*
�����߼���˼·
*/

public class Client{
	public static void main(String args[]){
		//�˿ڣ��ṩ������Զ���������
		try
		{
			Socket socket=new Socket("localhost",8888);
			/*
			��ȡ�������˷�����Ϣ
			ʹ����������Ȼ��DataOutputStream���а�װ
			*/
			InputStream is=socket.getInputStream();
			DataInputStream dis=new DataInputStream(is);
			String fileName=dis.readUTF();
			System.out.println("�ļ�����"+fileName);
			//����ڱ��������ļ���
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