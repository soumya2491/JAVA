public class nested {
    public class Innernested {
        void hello(){
            System.out.println("Hey there how are you ik everything don't be down chin up little boii!! you can do it");
        }
    }
    public static void main(String[] args) {
        nested nest = new nested();
        nested.Innernested hey = nest.new Innernested();
        hey.hello();
    }
}
