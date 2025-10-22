package com.m2j.codelab.algorithms.strings;
//https://leetcode.com/problems/first-unique-character-in-a-string/
public class FirstUniqChar {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));

        String s2 = "loveleetcode";
        System.out.println(firstUniqChar(s2));

        String s3 = "aabb";
        System.out.println(firstUniqChar(s3));
    }

    private static int firstUniqChar(String str) {

        int i = 0;

        int[] count = new int[26];
        char[] ca = str.toCharArray();
        for (char c : ca) {
            count[c - 'a']++;
        }

        for(char c : ca) {
            if(count[c - 'a'] == 1) {
                return i;
            }
            i++;
        }

        return -1;
    }
}
