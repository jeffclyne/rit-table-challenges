/**
 * Created by jclyne1 on 2/25/16.
 */
public class StringSteps {

    /**
     * Return the minimum number of character insertions, deletions, or changes to turn one word
     * into the other.
     * For example, to turn puzzle into problem:
     *
     * puzzle
     * przzle (change u to r)
     * prozle (change z to o)
     * proble (change z to b)
     * problem (add an m)
     *
     * @param str1
     * @param str2
     * @return
     */
    public static int stringSteps(String str1, String str2) {
        return 0;
    }
    public void main(String args) {
        System.out.println(stringSteps("string", "steps")); //4
        System.out.println(stringSteps("intuit", "inuit")); //1
        System.out.println(stringSteps("puzzle", "problem")); //4
        System.out.println(stringSteps("co-op", "intern")); //6
    }
}
