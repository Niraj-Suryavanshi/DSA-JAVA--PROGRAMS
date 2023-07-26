public class StaticKeyword {
    public static void main(String[] args) {
       Student s1=new  Student();
       Student s2=new  Student();
       s1.schooName="GPN";
       System.out.println(s2.schooName);
    }

}

class Student
{
    String name;
    int roll;

    static String schooName;

    void SetName(String name)
    {
        this.name=name;
    }

    String getName()
    {
        return this.name;
    }
}
