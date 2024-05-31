package method;

public class Calculation {

    int a = 10;//non-static
    int x = 15;  //non-static
    int y = 20; //non-static
    static int b = 20;

    public static void sum() {
        System.out.println("Method of sum");
    }

    //non-static method can call static as well non-static
    public void a() {
        sum();  //calling static method
        System.out.println("Non-static method()");
    }
    // types
     void add(){
         System.out.println(x+y);
       }
       void add(int a,int b){
           System.out.println(a+b);
       }

       int add1(){
        return x+y;
       }
       int add(int a,int b,int c){
        return a+b+c;
       }

    public static void main(String[] args) {
        sum();
        Calculation c = new Calculation();
        System.out.println("printing object "+c);
        System.out.println(c.a);
        System.out.println(b);
        c.a();
        System.out.println("########## Methods types ##########");
        c.add();
        c.add(10,20);
        System.out.println(c.add1());
        int add = c.add(10, 20, 30);
        System.out.println(add);


    }
}

// calling static variable and method in other class
class B{
    public static void main(String[] args) {
        Calculation.sum();
        System.out.println( Calculation.b);


    }
}

/*   OUTPUT
Method of sum
printing object method.Calculation@6acbcfc0
10
20
Method of sum
Non-static method()
########## Methods types ##########
35
30
35
60
 */