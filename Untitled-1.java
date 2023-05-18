import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt(), d=sc.nextInt();
        if((a*2+b)>(c*2+d))
        System.out.println("Alexa");
        else if((c*2+d)>(a*2+b))
        System.out.println("Bob");
        else System.out.println("Tie");
    }
}