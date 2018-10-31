package single;

public class Single_two_2 {
    private static Single_two_2 stwo2;

    private Single_two_2(){}

    private static synchronized Single_two_2 getInstance() {
        if(stwo2==null)
        {
            stwo2=new Single_two_2();
        }
        return stwo2;
    }
}
