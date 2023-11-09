package com.ncamc.medium;
import java.util.*;

/**
 * wordBreak方法接受一个字符串和一个单词字典作为参数，并返回一个布尔值，表示是否可以将字符串分割成字典中的单词。
 *
 *
 */
public class WordBreak {
    public static boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        String s = "leetcode";
        List<String> wordDict = Arrays.asList("leet", "leetcode","a");

        boolean result = wordBreak(s, wordDict);
        System.out.println(result);
    }
}
