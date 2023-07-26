public class Polymorphism {
    public static void main(String[] args) {
        // Calculator s=new Calculator();
        // s.sum(100,200);
        // s.sum((float)100.1, (float)11.2);
        // s.sum(1, 2,8);

        Animal a=new Animal();
        a.eat();
    }
}

//Overriding
class Animal
{
    void eat()
    {
        System.out.println("Eats anything");
    }
}

class Deer extends Animal
{
    void eat()
    {
        System.out.println("Eats grass");
    }
}



//Overloading

// class Calculator
// {
//     void sum(int a,int b)
//     {
//         System.out.println(a+b);
//     }

//     void sum(float a,float b)
//     {
//         System.out.println(a+b);
//     }

//     void sum(int a,int b,int c)
//     {
//         System.out.println(a+b+c);
//     }
// }
