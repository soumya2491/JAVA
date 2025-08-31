public class Outer {

    String outerName = "OuterClass";

    
    class Inner {
        void greetInner() {
            System.out.println("Hello from Inner, accessing outer: " + outerName);
        }
    }

    
    static class StaticInner {
        void greetStaticInner() {
            System.out.println("Hello from StaticInner, cannot access outerName directly");
        }

        static void staticMethod() {
            System.out.println("Hello from static method inside StaticInner");
        }
    }

    public static void main(String[] args) {
        
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.greetInner();

        
        Outer.StaticInner staticInner = new Outer.StaticInner();
        staticInner.greetStaticInner();

        Outer.StaticInner.staticMethod();
    }
}
