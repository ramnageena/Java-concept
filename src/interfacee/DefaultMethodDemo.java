package interfacee;

interface  A{
    default  void m1(){
        System.out.println("Default method");
    }
    void m2();
}
public class DefaultMethodDemo implements  A  {
    @Override
    public void m2() {
        System.out.println("This is abstract method");
    }
    public static void main(String[] args) {

       A df= new DefaultMethodDemo();
        df.m1();
        df.m2();
    }


}
