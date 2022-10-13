public class MethodOverloading {
    static void display() {
        System.out.println("12345");
    }
    void display(int a, String b) {
        System.out.println(a +" and "+ b);
    }
    void display(String c) {
        System.out.println(c);
    }
    void display(double d) {
        System.out.println(d);
    }
    public static void main (String[] agrs) {
        MethodOverloading obj = new MethodOverloading ();
        display();
        obj.display(123,"abc");
        obj.display("54abcd");
        obj.display(3.89);
    }
}
