/**
 * Created by jclyne1 on 2/16/16.
 */
public class WaterDepth {

    /**
     * Given the array of integers, each integer represents the height of the ground.
     * For example, if I have [0, 1, 0, 2, 1, 3, 0, 3] I have something that looks like this: 
     *           _   _
     *       _  | | |
     *   _  | |_| | |
     * _| |_|     |_|
     * 0 1 1 2 1 3 0 3
     * <p/>
     * Write an algorithm that calculates the square units of water that can be held in this structure.
     * A unit of water can be held if it has a wall on both sides. In the above example, the answer would be 5:
     *           _   _
     *       _  | |X|
     *   _  | |X| |X|
     * _| |X|     |X|
     *
     * @param elevationMap integer array representing the height of the ground at a given x coordinate.
     * @return the amount of water collected given the elevation map
     */
    public static int unitsOfWaterHeld(int[] elevationMap) {
        if (elevationMap.length < 3) return 0;

        int ans = 0;
        int l = 0, r = elevationMap.length - 1;

        // find the left and right edge which can hold water
        while (l < r && elevationMap[l] <= elevationMap[l + 1]) l++;
        while (l < r && elevationMap[r] <= elevationMap[r - 1]) r--;

        while (l < r) {
            int left = elevationMap[l];
            int right = elevationMap[r];
            if (left <= right) {
                // add volume until an edge larger than the left edge
                while (l < r && left >= elevationMap[++l]) {
                    ans += left - elevationMap[l];
                }
            } else {
                // add volume until an edge larger than the right edge
                while (l < r && elevationMap[--r] <= right) {
                    ans += right - elevationMap[r];
                }
            }
        }
        return ans;
    }
    
    //Another possible solution
    public static int unitsOfWaterHeld2(int[] elevationMap) {
        if (elevationMap.length < 3) return 0;

        int ans = 0;
        int l = 0, r = elevationMap.length - 1;
        int[] possibleDepths = new int[elevationMap.length];
        int currentDepth = 0;

        for (l = 0; l < elevationMap.length - 1; l++) {
            if (elevationMap[l] < currentDepth) {
                possibleDepths[l] = currentDepth - elevationMap[l];
            } else if (elevationMap[l] >= currentDepth) {
                currentDepth = elevationMap[l];
            }
        }

        currentDepth = 0;
        for (r = elevationMap.length-1; r >= 0; r--) {
            if (elevationMap[r] < currentDepth) {
                //We want to take the minimum of the right and the left
                if (currentDepth - elevationMap[r] < possibleDepths[r]) {
                    possibleDepths[r] = currentDepth - elevationMap[r];
                }
            } else if (elevationMap[l] >= currentDepth) {
                currentDepth = elevationMap[l];
            }
        }

        for (int i = 0; i < elevationMap.length; i ++) {
            ans += possibleDepths[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(unitsOfWaterHeld(new int[] { 3, 1, 0, 2, 1, 3, 0, 3 }));
    }
}
