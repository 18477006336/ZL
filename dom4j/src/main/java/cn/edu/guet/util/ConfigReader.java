package cn.edu.guet.util;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
//读取config.xml
public class ConfigReader {

    public static String getClassname() throws ClassNotFoundException {
        InputStream in=Class.forName("cn.edu.guet.util.ConfigReader").getResourceAsStream("/config.xml");
        //按住ctrl点击鼠标左键能跳到该文件
        SAXReader saxReader=new SAXReader();
        try {
            Document document=saxReader.read(in);
            //把document和config.xml做一个映射，通过in用document读取config.xml
            Element element=(Element) document.selectObject("/animals/animal");//config.xml路径
            return element.getStringValue();
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        return "";
    }
}
