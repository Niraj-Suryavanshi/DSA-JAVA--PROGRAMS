public class GetSet
{
    public static void main(String args[])
    {
        // Pen p1=new Pen();
        // p1.setColor("Blue");
        // System.out.println(p1.getColor());
        // p1.setTip(5);
        // System.out.println(p1.getTip());

        Student s2=new Student();
        Student s1=new Student("Niraj",40);
        System.out.println(s1.getName());
        System.out.println(s1.getRoll());
        
    }
}



class Pen
{
    private String color;
    private int tip;

    String getColor()
    {
        return this.color;
    }

    int getTip()
    {
        return this.tip;
    }

    void setColor(String  newColor)
    {
        this.color=newColor;
    }

    void setTip(int newTip)
    {
        this.tip=newTip;
    }
}

class Student
{
    String name;
    int rollno;

   

    Student(String name,int rollno)
    {
        this.name=name;
        this.rollno=rollno;
        System.out.println("This is parameterized constructor !!");
    }

    int getRoll()
    {
        return this.rollno;
    }

    String getName()
    {
        return this.name;
    }

    Student()
    {
        System.out.println("This is Non-parameterized constructor !!");
    }
}

