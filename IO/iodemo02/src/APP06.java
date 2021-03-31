import com.sun.xml.internal.bind.util.Which;

import java.io.*;

/*
1、创建mp3.list文件
（1）显示出某个目录下的所有mp3文件
（2）把名字写入mp3.list（使用IO流）
FileWriter fw=new FileWriter("D:\\KSWJJ\\Answer\\mp3.list");
2、读取mp3.list文件
（1）先用字符流读取
（2）再用字节流读取
 */
public class APP06 {

    public static void main(String[] args) throws IOException {
        File file = new File("D:\\KSWJJ\\Answer");//当前路径
        CreateListFiles(file);

        FileReader fr = new FileReader("D:\\KSWJJ\\Answer\\mp3.list");//用字符流
        BufferedReader br = new BufferedReader(fr);//按行读取
        String mp3Name = "";
        FileOutputStream fos = new FileOutputStream("E:\\合并.mp3");//把读取的内容输出到合并.mp3
        while ((mp3Name = br.readLine()) != null) {//第一次循环读取mp3.list内容，并输入到mp3Name
            FileInputStream fis = new FileInputStream(mp3Name);//用字节流
            byte buff[] = new byte[1024];
            int a = 0;
            while ((a = fis.read(buff)) != -1) {//用字节流读取mp3Name内容
                fos.write(buff, 0, a);//把内容写入E:\\合并.mp3
            }
            fis.close();
        }
        fos.close();
    }

    static void CreateListFiles(File file) throws IOException {
        FileWriter fw = new FileWriter("D:\\KSWJJ\\Answer\\mp3.list");
        File files[] = file.listFiles();//方法调用
        for (int i = 0; i < files.length; i++) {
            if (files[i].getName().endsWith(".mp3")) {//获取mp3文件名字
                String mp3 = files[i].getName();
                fw.write("mp3");//把读取的文件名写入mp3.list
                fw.write("\r");//回车和换行，为了不让目录都挤在一行
                fw.write("\n");
            }
        }
        fw.close();
    }
}


