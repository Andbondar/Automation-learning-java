import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by bondar on 3/30/2015.
 */
public class Operators {
    public static void main(String[] args) {
        int a=2, b=3;
        System.out.println("a = " + a + "; b = " + b);
        System.out.println(a+b);//a. Arithmetic
        System.out.println(a>b);//b. Relational

        int bitmask = 0x000F;
        int val = 0x2222;
        System.out.println(val & bitmask);//c. Bitwise

        if (a == b) System.out.println("a = b");//d. Logical
        else System.out.println("a != b");

        int c;
        c = 2*a - b;//e. Assignment
        System.out.println("c = 2*a - b = " + c);

        if ((a == 2) && (b == 2)) System.out.println("a = b = 2");//f. Conditional
        else if ((a == 2) || (b == 2)) System.out.println("a = 2 OR b = 2");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(reader instanceof BufferedReader);//g. Instanceof

        int prec = ++a * b--;//h. Precedence
        //first ++a (pre-increment)
        //second *
        //third b-- (post-increment)
        System.out.println("++a * b-- = " + prec);
        System.out.println("a = "+ a + "; b = " + b);
        System.out.println("(++a) * (b--) = "+ (++a * b--));
    }
}
