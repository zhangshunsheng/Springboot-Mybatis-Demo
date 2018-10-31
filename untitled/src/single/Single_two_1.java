package single;

/**
 * 懒汉式：类初始化时，不初始化这个对象（延时加载，懒加载）
 */
public class Single_two_1 {
    //方式一：非线程安全

    private static Single_two_1 stwo1;

    private Single_two_1(){}

    private static Single_two_1 getInstance() {
        if(stwo1==null)
        {
            stwo1=new Single_two_1();
        }
        return stwo1;
    }
}
