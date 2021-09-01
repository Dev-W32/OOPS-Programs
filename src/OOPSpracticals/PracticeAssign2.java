package OOPSpracticals;

 class ParentClass
{
     void Parent()
    {
        System.out.println("This is a Parent Class");
    }
}
class ChildClass extends ParentClass
{
    public void Child()
    {
        System.out.println("This is a child class");
    }
    void InformationOne()
    {
        System.out.println("This is a class as well");
    }
}
public class PracticeAssign2 {
    public static void main(String[] args) {
        ParentClass p = new ParentClass();
        ChildClass c = new ChildClass();
        p.Parent();
        c.Child();
        c.Parent();
        c.InformationOne();
        // if method informationOne is declared as private then it gives error
    }

}
