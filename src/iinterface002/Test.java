package iinterface002;

import com.sun.jdi.connect.Transport;

public class Test {
    public static void main(String[] args) {
        Car c = new Car();
        MovingCompany mc = new MovingCompany();
        transport(c);
        transport(mc);
        transport a = new Car();
        transport(a);
        transport.show3();
        a.show2();
        mc.show2();
        mc.show7();
        System.out.println(transport.a);




    }
    public static void transport(transport a){
        a.show();
    }
}
