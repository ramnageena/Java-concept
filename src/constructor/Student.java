package constructor;

//constructor are used to initialization the object

// default Costructor
public class Student {
    int id;
    String name;
    String city;

    /*
    if we are declaring any constructor then JVM will create default constructor ,
     default constructor will look like below code:

    Student(){
        id=id;
        name=name;
        city=city;
    }

     */
    public static void main(String[] args) {
        Student s= new Student();
        System.out.println(s.id);
        System.out.println(s.name);
        System.out.println(s.city);
    }
}
/* OUTPUT
0
null
null

 */