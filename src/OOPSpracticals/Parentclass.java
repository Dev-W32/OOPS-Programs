package OOPSpracticals;

private class Parentclass{
    public void Parentcl(){
        System.out.println("This is parent class");
    }
}

class Subclass extends Parentclass{
    public void Subcl(){
        System.out.println("This is child class");
    }
}

class MainClass{
    public static void main(String[] args){
        Parentclass m = new Parentclass();
        Subclass n = new Subclass();
        m.Parentcl();
        n.Subcl();
        n.Parentcl();
    }
}
