package single;

/**
 * 双重检查锁式
 */
public class Single_three {
    private volatile static Single_three sthree;
    private Single_three(){}
    public static Single_three getInstance()
    {
        if(sthree==null)
        {
            synchronized (Single_three.class)
            {
                if(sthree==null)
                {
                    sthree=new Single_three();
                }
            }
        }
        return sthree;
    }
}
