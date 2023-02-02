/**
 * class: ITEC 2140
 * date:01/27/23
 * aurthur:Joshua Wilson
 * descrpition: This program is to calculate the amount of bags needed to fit the amount of chocolate
 */
public class Chocolate {
    public static void main (String[] args) {

        double total_Bags = 9;
        /**
         * the problem states that each bag holds 2 bars already
         * we need to find the amount of chocolate by multiplying
        */
       double total_Bars = total_Bags * 2;
       System.out.print("There are " + total_Bars + " chocolate bars total");
       // The problem states that each bag holds 3 bars we need to divide the total bars by the capacity of each bag
      int bag_Capacity = 3;
        double bags_Needed = total_Bars / bag_Capacity;
        System.out.print(". The total amount of bags the bars would all fit in would be " + bags_Needed);
    }
}
