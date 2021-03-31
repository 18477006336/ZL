import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class APP05 {
    public static void main(String[] args) {
        String files[]= {"D:\\少年.mp3","D:\\大海.mp3"};
        //第一次循环把【少年】写入合并
        //第二次循环把【大海】写入合并
        for (int i=0;i<files.length;i++){
            FileOutputStream fow=null;
            try {
                FileInputStream fis=new FileInputStream(files[i]);
                fow=new FileOutputStream("E:\\合并.mp3");
                byte buff[]=new byte[1024];
                int a=0;
                while ((a=fis.read(buff))!=-1){
                    fow.write(buff,0,a);
                }
                fis.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {
                try {
                    fow.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
