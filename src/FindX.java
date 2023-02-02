/**
 * class: ITEC 2140
 * date:01/26/23
 * aurthur:Joshua Wilson
 * descrpition:this program is used to calculate the solution of x
 */
public class FindX {
    public static void main(String[] args) {

        double result;
        double total = 194;
        String The_Problem = "5 + 19 + X + 47 = " + total;   // displaying the issue
        System.out.print("The problem is looking to solve X from the equation " + The_Problem);
        double Excluding_X = 5 + 19 + 45; // This shows all the numbers except the variable X and the total
        result = total - Excluding_X; // we are now just plugging in the variables to solve the problems
        System.out.print(", Using the method i provided we can tell that " + "X = " + result);

    }
}
