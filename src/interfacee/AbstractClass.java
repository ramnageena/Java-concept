package interfacee;

/*
INCOMPLETE Class --  IT HAS BOTH ABSTRACT(without body) AND NON ABSTRACT METHOD(with body)
if we define any abstract method inside a class then we need to define class as a abstract
we can not call constructor with the help of new keywords ,
if you want to call constructor we can call that constructor from subclass  with the help of
super() keywords in case of constructor chaining.

this:    are used to called method and variable for same class.
this():  are used to called overloaded constructor of same class.

super :  are used to called super class methods and variable.
super(): are used to called super class overloaded constructor.

     */

public abstract class AbstractClass {

    String name;
    String city;
    int mo = 91496554;

    // non-abstract method
    public void display() {
        System.out.println("This is a non abstract methods" );
    }

    // abstract methods
    public abstract void show();

    AbstractClass(String name, String city) {
        this.name = name;
        this.city = city;
    }
}

class AbstractDemo extends AbstractClass {

    String gender;
    int mo = 55555;

    AbstractDemo(String gender) {
        this("Male", "Ram", "Chennai" );
    }

    AbstractDemo(String gender, String name, String city) {
        super(name, city);
        this.gender = gender;
    }

    @Override
    public void show() {
        System.out.println(super.mo);
        super.display();
        System.out.println(this.mo);
        System.out.println(" abstract method" );
        System.out.println("Name: " + name + " City: " + city + " Gender: " + gender);
    }

    public static void main(String[] args) {
        AbstractClass ac = new AbstractDemo("Male", "RAM", "Cheneai" );
        AbstractDemo ab= new AbstractDemo("Female");
        ac.display();
        ac.show();

    }
}
