package single;

public class Single_four {
    private static class SingletonClassGetInstance {
        public static final Single_four sfour = new Single_four();
    }
    private Single_four(){}
    public static Single_four getInstance()
    {
        return SingletonClassGetInstance.sfour;
    }
}
