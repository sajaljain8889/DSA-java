public class IntegerToRoman {
    public static void main(String argu[]) {
        int num = 18;
        String ans = integerToRoman(num);
    }

    private static String integerToRoman(int num) {
        String s = "";
        s = lessThan3(num);
        s = equalstofour(num);
        s = moreThan4andlessthan10(num);
        s = lessthan49Andmorethan10(num);
        String g = fiftyToninnin9(num);
        s = hundredTo499(num);
        s = a500to1000(num);

        return null;
    }

    private static String fiftyToninnin9(int num) {
        return null;
    }

    private static String hundredTo499(int num) {
        return null;
    }

    private static String a500to1000(int num) {
        return null;
    }

    private static String lessthan49Andmorethan1(int num) {
        return null;
    }

    private static String moreThan4andlessthan10(int num) {
        return null;
    }

    private static int lessthan10(int num) {
        return 0;
    }

    private static String equalstofour(int num) {
        return null;
    }

    private static String lessThan3(int num) {
        return null;
    }

}
