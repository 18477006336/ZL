import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;

public class ParseXML{
	public static String getFileName(){
		//static����̬����.����ֱ�ӵ���
		try
		{
			/*
			���´����Ƕ�ȡabc.xml��׼������,��doc��xml������������xmlʱֻ�����doc����
			�ڵ����ͣ�1���ı��ڵ㣺#text 2��Ԫ�ؽڵ㣺��Ԫ�ص�����һ��
			*/
			DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
			DocumentBuilder db=factory.newDocumentBuilder();
			InputStream in=Class.forName("ParseXML").getResourceAsStream("abc.xml");
			Document doc=db.parse(in);

			Element element=doc.getDocumentElement();//�õ����ڵ㣬��Ԫ��
			String fileName=element.getFirstChild().getNextSibling().getFirstChild().getNodeValue();
			return fileName;

			/*System.out.println(element.getChildNodes().getLength());//�õ��ӽڵ�ĳ���

			//��Ϊelement.getChildNodes().getLength()��һ�����飬���԰������Ԫ�ر�������
			for(int i=0;i<element.getChildNodes().getLength();i++){
				Node node=element.getChildNodes().item(i);
				System.out.println("�ڵ����֣�"+node.getNodeName());
			}

			System.out.println(element.getTagName());//�õ����ڵ�
			*/
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return "";
	}
}