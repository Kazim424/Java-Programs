class  Addition{
    int a;
    int b;
//Constructor
    Addition(int x, int y){
        System.out.println("This is constructor");
        a = x;
        b = y;
    }
// Sum
 int Sum(){
    return a + b;
 }
 int Subtration(){
    return a - b;
 }
 int Multiplication(){
    return a * b;
 }
 int Divide(){
    return a / b;
 }
}

public class constructor{   
public static void main(String[] args) {
    Addition obj1 = new  Addition(5,2);
   int result = obj1.Sum();
   System.out.println("The addition of two number is : "+result );
   System.out.println( obj1.Subtration());
   System.out.println( obj1.Multiplication());
   System.out.println(obj1.Divide());
}
}