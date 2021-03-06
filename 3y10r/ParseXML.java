import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;

public class ParseXML{
	public static String getFileName(){
		//static：静态，加.可以直接调用
		try
		{
			/*
			以下代码是读取abc.xml的准备工作,把doc与xml关联起来，用xml时只需调用doc即可
			节点类型：1、文本节点：#text 2、元素节点：和元素的名称一样
			*/
			DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
			DocumentBuilder db=factory.newDocumentBuilder();
			InputStream in=Class.forName("ParseXML").getResourceAsStream("abc.xml");
			Document doc=db.parse(in);

			Element element=doc.getDocumentElement();//得到根节点，根元素
			String fileName=element.getFirstChild().getNextSibling().getFirstChild().getNodeValue();
			return fileName;

			/*System.out.println(element.getChildNodes().getLength());//得到子节点的长度

			//因为element.getChildNodes().getLength()是一个数组，可以把里面的元素遍历出来
			for(int i=0;i<element.getChildNodes().getLength();i++){
				Node node=element.getChildNodes().item(i);
				System.out.println("节点名字："+node.getNodeName());
			}

			System.out.println(element.getTagName());//得到跟节点
			*/
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return "";
	}
}