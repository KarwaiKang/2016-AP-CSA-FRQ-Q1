public class RandomLetterChooser extends RandomStringChooser {
    /**
     * Constructs a random letter chooser using the given string {@code str}.
     * Precondition: {@code str} contains only letters.
     *
     * @param str the string to make a random letter chooser out of.
     */
    public RandomLetterChooser(String str) {
        super(getSingleLetters(str));
    }

    /**
     * Each of these string consists of a single letter for {@code str}. Element {@code k}
     * of the returned array contains the single letter at position {@code k} of {@code str}/
     * For example, {@code getSingleLetters("cat")} returns the
     * array {@code { "c", "a", "t"}}.
     *
     * @param str a string to get singler letter string from.
     * @return an array of single letter strings.
     */
    public static String[] getSingleLetters(String str) {
        String[] strArr = new String[str.length()];
        for (int i = 0; i < str.length(); i++)
            strArr[i] = str.substring(i, i + 1);
        return strArr;
    }
}
