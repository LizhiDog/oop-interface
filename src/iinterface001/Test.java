package iinterface001;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog();
        f.setName("小青");
        f.setAge(1);
        System.out.println(f.getName()+", "+f.getAge());
        f.eat();
        f.swim();
    }
}
