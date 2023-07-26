public class Interfaces {
    public static void main(String[] args) {
        Queen q=new Queen();
        q.moves();

        Animal a=new Animal();
        a.eat();
    }
}

interface chessPlayer
{
    void moves();
}

class Queen implements chessPlayer
{
    public void moves()
    {
        System.out.println("Up, Down, Left, Right, Diagonal (in all 4 dirns)");
    }
}

class Rook implements chessPlayer
{
    public void moves()
    {
        System.out.println("Up, Down, Left, Right");
    }
}

class King implements chessPlayer
{
    public void moves()
    {
        System.out.println("Up, Down, Left, Right, Diagonal (BY 1 step)");
    }
}

interface herbivore
{
    void eat();
}

interface carnivore
{
    void eat();
}

class Animal implements herbivore,carnivore
{
    public void eat()
    {
        System.out.println("Multiple Inheritance created");
    }
}