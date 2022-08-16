package challenges.string;

public class TypedOutStrings {

    public static boolean typedOutString(final String F, final String S) {
        if (F == null && S == null) return true;
        int p1 = F.length() - 1, p2 = S.length() - 1;

        while (p1 >= 0 || p2 >= 0) {
            if ((p1 >= 0 && F.charAt(p1) == '#') || (p2 >= 0 && S.charAt(p2) == '#')) {

                if (p1 >= 0 && F.charAt(p1) == '#') {
                    int backward = 2;
                    while (backward > 0) {
                        p1--;
                        backward--;

                        if (p1 >= 0 && F.charAt(p1) == '#') {
                            backward += 2;
                        }
                    }
                }


                if (p2 >= 0 && S.charAt(p2) == '#') {
                    int backward = 2;
                    while (backward > 0) {
                        p2--;
                        backward--;

                        if (p2 >= 0 && S.charAt(p2) == '#') {
                            backward += 2;
                        }
                    }
                }
            } else {
                if (p1 < 0 || p2 < 0 || F.charAt(p1) != S.charAt(p2)) {
                    return false;
                } else {
                    p1--;
                    p2--;
                }
            }
        }

        return true;
    }
}
