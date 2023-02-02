/**
 * class: ITEC 2140
 * date:01/26/23
 * aurthur:Joshua Wilson
 * description: This program is to determine how many males go to the school
 */
public class MaleStudent {
    public static void main (String[] args) {
        String The_issue = "The school has 389 total students and out of that 175 are female " + "and we are solving to find how many are male";
        // the line above is just to restate the issue to build to the answer
        System.out.print(The_issue);
        double Total_Students = 389;  //we are listing out the values to make sure we keep track of them
        double Female_Students = 175;
        /**
         * the problem is simple if the 175 of the students are female that means whatever are left are women
         * this just means that the formula to us is subtraction
         */
        double Male_Students;
        Male_Students = Total_Students - Female_Students;
        System.out.print(" According to my calculations the amount of male students that go to the school are " + Male_Students);


    }
}
