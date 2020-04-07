package algos;

public class StringReverse {
    static String withRecur(String str) {
        if (str.length() == 0) {
            return "";
        }

        return withRecur(str.substring(1)) + str.charAt(0);
    }

    static String withTailRecur(String str) {
        return withTailRecur(str, "");
    }

    private static String withTailRecur(String str, String reversed) {
        if (str.length() == 0) {
            return reversed;
        }

        return withTailRecur(str.substring(1), str.charAt(0) + reversed);
    }

    static String withStringBuilder(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    static String withLoop(String str) {
        var result = "";
        for (int i = str.length() - 1 ; i >= 0; i--) {
            result = result + str.charAt(i);
        }

        return result;
    }
}
