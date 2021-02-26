import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App01 {
    public static void main(String[] args) {
        /*
        ArrayList和LinkedList的区别：
        ArrayList查找速度快（因为有下标），但是删除、添加速度慢
        LinkedList查找速度慢（因为是链表），但是删除、添加速度快
         */
        //接口可以看作完全的抽象类
        List list=new LinkedList();//多态：向上转型；ArrayList是List
        //添加数据
        list.add(111);
        list.add(111);
        list.add("abcd");
        list.add(true);
        list.add('c');
        list.add(33.88d);//double
        list.add(22.2f);//float
        //list.add(new Student());

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }//把添加的数据遍历出来

        //动物 dongwu=new Dog(0);//狗是动物
    }
}