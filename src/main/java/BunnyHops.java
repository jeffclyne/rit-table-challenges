/**
 * Created by jclyne1 on 2/25/16.
 */
public class BunnyHops {

    /**
     * A bunny is standing in front of a line of puddles. He can jump over 1, 2, or 3 puddles at a time.
     * Write an algorithm to calculate the number different ways the bunny can jump over n puddles.
     *
     * @param n The number of puddles
     * @return The number of ways the bunny can jump over the puddles
     */
    public static int howManyWays(int n) {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(howManyWays(5)); //13
        System.out.println(howManyWays(10)); //274
        System.out.println(howManyWays(20)); //121415
        //This one's tough. Comment it out if your algorithm is taking too long
        System.out.println(howManyWays(100)); //2082876103
    }
}
