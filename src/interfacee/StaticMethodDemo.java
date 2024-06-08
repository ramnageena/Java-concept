package interfacee;

interface  B{
    static  void m1(){
        System.out.println("Static method");
    }
}
public class StaticMethodDemo implements B{
    public static void main(String[] args) {
        B.m1();
    }
}
