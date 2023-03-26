import java.util.Scanner;
//class
class Algebra{
    //Constructor
    Algebra(){
        System.out.println("This is constructor");
    }
    //Method
      int  sum(int a ,int b){
int ans= a + b;
return ans;
    }
}

public class addTwo{
    public static void main(String[] args) {
        Algebra obj1 =new Algebra();
        // addTwo obj2 =new addTwo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two number:");
        int x =sc.nextInt();
        int y =sc.nextInt();
        System.out.print("Sum of two number is : " );
        int ans=obj1.sum(x , y);
        System.out.println(ans);
    }
}