package interfacee;
interface C{
    default void m1(){
        System.out.println("this is m1() if C interface");
    }
}
interface D{
    default void m1(){
        System.out.println("this is m1() if D interface");
    }
}

public class DiamondProblem implements  C,D {

   public void m1(){
        D.super.m1();
    }

    public static void main(String[] args) {
        DiamondProblem dp= new DiamondProblem();
        dp.m1();
    }
}
