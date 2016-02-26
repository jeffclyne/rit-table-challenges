/**
 * Created by jclyne1 on 2/25/16.
 */
public class BrokenRecord {

    /**
     * Write an algorithm that determines if there is a sequence of words in the input that's
     * repeated.
     *
     *
     * @param str A sequence of words
     * @return True if there's a repetition of words (in order), false otherwise
     */
    public static boolean isABrokenRecord(String str) {
        return false;
    }

    public static void main(String args[]) {
        System.out.println(BrokenRecord.isABrokenRecord("Is a broken record. Is a broken record.")); //True
        System.out.println(BrokenRecord.isABrokenRecord("Isn't a broken record")); //False
        System.out.println(BrokenRecord.isABrokenRecord("Might be be a broken record")); //True
        System.out.println(BrokenRecord.isABrokenRecord("Mirror image words image mirror")); //False
    }
}
