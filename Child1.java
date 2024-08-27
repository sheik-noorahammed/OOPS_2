public class Child1 extends Child {
    
    // Method in the Child1 class
    public void child1Method() {
        System.out.println("Method from Child1 class");
    }
    
    // Another method in the Child1 class
    public void print() {
        System.out.println("Print method in Child1 class");
    }

    // Main method to test the inheritance
    public static void main(String[] args) {
        // Create an instance of Child1
        Child1 child1 = new Child1();
        
        // Call methods from Parent class
        child1.parentMethod();
        child1.display();
        
        // Call methods from Child class
        child1.childMethod();
        child1.show();
        
        // Call methods from Child1 class
        child1.child1Method();
        child1.print();
    }
}