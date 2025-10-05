package com.m2j.codelab.util;

public final class StringUtils {

    private StringUtils() {
    }

    public static String deleteWhitespace(final String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        int sz = str.length();
        char[] chs = new char[sz];
        int count = 0;

        for (int i = 0; i < sz; i++) {
            char ch = str.charAt(i);
            if (!Character.isWhitespace(ch)) {
                chs[count++] = ch;
            }
        }
        return (count == sz) ? str : new String(chs, 0, count);
    }
}
