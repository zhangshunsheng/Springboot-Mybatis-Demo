import java.util.Arrays;

/**
 * 不可变类的实现
 * 五项原则：
 * 1. 类添加final修饰符，保证类不被继承。
 * 2. 保证所有成员变量必须私有，并且加上final修饰
 * 3. 不提供改变成员变量的方法，包括setter
 * 4.通过构造器初始化所有成员，进行深拷贝(deep copy)
 * 5. 在getter方法中，不要直接返回对象本身，而是克隆对象，并返回对象的拷贝
 */
public final class Number {
    private final int val;
    private final char charval[];

    public Number(int val,char charval[]) {
        this.val=val;
        this.charval=Arrays.copyOf(charval,charval.length);
    }

    public String  ntoString(){
        return "val="+this.val+"\r\ncharval="+this.charval;
    }
}
