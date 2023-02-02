/**
 * class: ITEC 2140
 * date:01/26/23
 * aurthur:Joshua Wilson
 * descrpition: This program is to determine how many tricycles are in the bike shop
 */
public class Cycle {

    public static void main (String[] args) {
        double bicycles = 10;
        double wheels_in_Shop = 47; // we are setting the values of the problem
        double tricycles;
        /**
         * We know that there are 47 wheels total and 10 bicycles
         * we need to first find out how many wheels are from the 10 bicycles
         * Bicycles have only 2 wheels on them each so we start by multiplying the 10 by 2
         */
       double bicycle_Wheels = bicycles * 2;
       System.out.print("Out of the 47 wheels 20 of them are from the bicycles. ");
       /**
        * the remaining amount of wheels should be 27 and those are what is left from the tricycles
        based off the name we can assume that tricycle means that each of them has 3 wheels
        we can divide the 27 wheels to solve the amount of tricycles
        */
       double tricycles_Wheels = wheels_in_Shop - bicycle_Wheels;
       tricycles = tricycles_Wheels / 3;
       System.out.print("The amount of tricycles in the shop are  " + tricycles);
    }
}
