public class OverloadExample {

    // Method with one integer parameter
    public void display(int number) {
        System.out.println("Integer: " + number);
    }
    
    // Overloaded method with two integer parameters
    public void display(int number1, int number2) {
        System.out.println("Integer1: " + number1 + ", Integer2: " + number2);
    }
    
    // Overloaded method with one double parameter
    public void display(double number) {
        System.out.println("Double: " + number);
    }
    
    // Overloaded method with one string parameter
    public void display(String text) {
        System.out.println("String: " + text);
    }

    public static void main(String[] args) {
        OverloadExample example = new OverloadExample();
        example.display(10);                 
        example.display(10, 20);            
        example.display(10.5);               
        example.display("Hello, World!");   
    }
}
