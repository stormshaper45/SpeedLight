/**
 * class: ITEC 2140
 * date:01/26/23
 * aurthur:Joshua Wilson
 * description:This program is used to determine the distance of a lightning strike based off the sound timing and delay in seeing it
 */
public class SpeedLight {
    public static void main (String[] args) {
        System.out.print("This program will calculate the distance of a lightning strike based on the sound of the sound if the strike and the actual thunder ");
        int speed;
        int Seconds_to_Thunder;
        String The_problem;
        The_problem = "The problem says that the speed of the sound is 340 meters per second and that we hear it after 5 seconds upon seeing it";
        int important_value = 340;
        int important_value2 = 2;
        System.out.print(The_problem + ", The two important things to pull are " + important_value + " and " + important_value2);  // we are now plugging in the variables to get the distance
    speed = 340;  // plugging in the values
    Seconds_to_Thunder = 5; //plugging i

        int Distance = speed * Seconds_to_Thunder;
        System.out.print(" According to the data given the distance the strike would be is " + Distance);
    }
}
