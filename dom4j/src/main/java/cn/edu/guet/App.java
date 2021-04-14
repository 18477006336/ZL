package cn.edu.guet;

import cn.edu.guet.ploy.Animal;
import cn.edu.guet.ploy.Dog;
import cn.edu.guet.util.ConfigReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //写死Animal animal=new Dog();
        String classname= ConfigReader.getClassname();
        //利用反射机制使用ClassName动态创建对象
        Animal animal=(Animal)Class.forName(classname).newInstance();
        animal.back();
    }
}
