package iinterface002.a01;

public interface Inter {
    public abstract void show();
    public static void show2(){
        System.out.println("I am show2");
        show4();
        //System.out.println("记录日志");
    }
    public static void show3(){
        System.out.println("I am show3");
        show4();
    }
    private static void show4(){
        System.out.println("记录日志");
    }

}
