import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class App02 {
    public static void main(String[] args) {
        Set set=new HashSet();

        set.add(111);
        set.add(111);
        set.add("abcd");
        set.add(true);
        set.add('c');
        set.add(33.88d);//double
        set.add(22.2f);//float

        
        //迭代器进行遍历

        Iterator iter=set.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        System.out.println(set.size());//有几个元素？无序不可重复
    }
}
