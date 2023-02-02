/**
 * class: ITEC 2140
 * date:01/27/23
 * aurthur:Joshua Wilson
 * descrpition: This program is to determine how many more stamps does Jean have then Susan
 */
public class Stamps {
    public static void main(String[] args) {
        int Jean_Stamps = 40;   // These are setting the amount of the stamps
        int Susan_Stamps = 8;
        // the best way to figure out the differences in the stamps is to subtract the greatest number by the smallest
        int Differences = Jean_Stamps - Susan_Stamps;
        System.out.print(" The differences in stamps between Jean ans Susan is " + Differences + " stamps");
    }
}
