public class Abstraction {
    public static void main(String[] args) {
        horseS s=new horseS();
        s.walk();
        s.eat();
        System.out.println(s.color);
        s.changeColor();
        System.out.println(s.color);

    }
}

abstract class Animal{

    String color;
    Animal()
    {
        color="Brown";
    }

    void eat()
    {
        System.out.println("Animals eat..");
    }

    abstract void walk();

}

 class horseS extends Animal{
     void walk()
     {
        System.out.println("Horse can walk...");
     }

     void changeColor()
     {
        color="red";
     }
}
