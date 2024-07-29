package iinterface002;

public class MovingCompany extends transportAdapter{
    @Override
    public void show() {
        System.out.println("搬家公司");
    }

    @Override
    public void show7() {
        System.out.println("重写");
    }
}
