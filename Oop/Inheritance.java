public class Inheritance {
    public static void main(String[] args) {
        // Fish shark=new Fish();
        // shark.eat();

        // Dog dobby=new Dog();
        // dobby.eat();
        // dobby.legs=4;
        // System.out.println(dobby.legs);

        Birds sparrow=new Birds();
        sparrow.eat();
    }
}

class Animal//Base class
{
    String color;
    void eat()
    {
        System.out.println("Eats");
    }

    void breathe()
    {
        System.out.println("Breathes");
    }
}

// class Mammals extends Animal//single inheritance
// {
//     int legs;
// }

// class Dog extends Mammals//multilevel inheritance
// {
//     String breed;
// }

// class Fish extends Animal//Derived class
// {
//     int fins;
//     void swim()
//     {
//         System.out.println("Swims");
//     }
// }

//Hierarchical Inheritance
class Mammals extends Animal//single inheritance
{
    void walk()
    {
        System.out.println("walks");
    }
}

class Fish extends Animal//single inheritance
{
    void swim()
    {
        System.out.println("Swims");
    }
}

class Birds extends Animal//single inheritance
{
    void fly()
    {
        System.out.println("Fly");
    }
}
