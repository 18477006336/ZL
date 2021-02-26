import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class App04 {
    public static void main(String[] args) {
        Map map=new HashMap();
        map.put(101,"zhangsan");
        map.put(102,"lisi");
        map.put(103,"wangwu");
        map.put(103,"liwei");

        //Map的key是一个Set结构（无序不可重复）

        //System.out.println(map.get(103));//根据key拿到value

        /*
        既然Map的get方法需要一个key，所以遍历Map可以先拿到所有的key
         */
        Set set=map.keySet();//得到所有的key

        Iterator iter=set.iterator();
        while(iter.hasNext()){
            System.out.println(map.get(iter.next()));
        }
    }
}
