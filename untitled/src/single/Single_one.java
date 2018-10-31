package single;

/**
 * 饿汉式 类加载前创建一个静态实例，构造器私有，外部无法再创造实例
 */
public class Single_one {
    private static Single_one sone=new Single_one();
    private Single_one(){}
    public static Single_one getInstance(){
        return sone;
    }
}
