package YouDoIt;

public class DemoBlock {
    public static void main(String[] args){
        System.out.println("Demo Block Scope");
        int x = 5678;
        System.out.println("In this block x is " + x);
        {
            int y = 7865;
            System.out.println("In this block x is " + x);
            System.out.println("In this block y is " + y);
        }
        {
            int y = 9876;
            System.out.println("In this block x is " + x);
            System.out.println("In this block y is " + y);
            demoMethod();
            System.out.println("After method x is " + x);
            System.out.println("After method block y is " + y);
        }
        System.out.println("At the end x is " + x);
    }
    public static void demoMethod(){
        int x = 1234;
        int y = 4321;
        System.out.println("After method x is " + x);
        System.out.println("After method block y is " + y);
    }
}
