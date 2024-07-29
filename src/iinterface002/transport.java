package iinterface002;

public interface transport {
    public static final int a = 10;
    public abstract void show();
    public default void show2(){
        System.out.println("接口中的默认方法");
    }
    public static void show3(){
        System.out.println("show3");
    }
    private void show4(){

    }
    private static void show5(){

    }
    public abstract void show6();
    public abstract void show7();
    public abstract void show8();
    public abstract void show9();
    public abstract void show10();
}
