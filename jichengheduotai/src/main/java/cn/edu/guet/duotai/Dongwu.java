package cn.edu.guet.duotai;
/*
*叫：back,是一种行为，在动物里面不能具体化，如果具体化则所有的动物都会有统一的叫声，不符合实际
* 为什么不能具体化？因为不同的动物有不同的叫声，“叫”这种行为在动物中必须是抽象的（因为不确定是哪种动物）
* 方法如何写成抽象的？
* 1、把方法体去掉，即把public class Dongwu  {里面的【{void back(){System.out.println("wang");}}】去掉
* 2、做成抽象的,即加入abstract
*
 */
public abstract class Dongwu  {
    abstract void back();
}
