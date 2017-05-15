package com.lei.alu;

public class Test3 {

	 // 最长回文子序列
    static int[][] c;
    static int[][] b;

    public static void main(String args[]) {
        char[] s = "chara".toCharArray();
        c = new int[s.length][s.length];
        b = new int[s.length][s.length];
        for (int i = 0; i < s.length; i++)
            c[i][i] = 1;
        findLPS(s, 0, s.length - 1);
        System.out.println(c[0][s.length - 1]);
        printLPS(s, 0, s.length - 1);
    }

    public static void printLPS(char[] s, int p, int q) {
        if (p == q)
            System.out.print(s[p]);
        else {
            if (b[p][q] == 2) {
                if (p + 1 == q) {
                    System.out.print(s[p] +""+ s[p]);
                } else {
                    System.out.print(s[p]);
                    printLPS(s, p + 1, q - 1);
                    System.out.print(s[p]);
                }
            } else if (b[p][q] == 1) {
                printLPS(s, p + 1, q);
            } else
                printLPS(s, p, q - 1);
        }
    }

    public static int findLPS(char[] s, int p, int q) {
        if (p == q)
            return 1;
        if (c[p][q] > 1)
            return c[p][q];
        if (s[p] == s[q]) {
            if (p + 1 == q)
                c[p][q] = 2;
            else
                c[p][q] = findLPS(s, p + 1, q - 1) + 2;
            b[p][q] = 2;
        } else {
            int m1 = findLPS(s, p + 1, q);
            int m2 = findLPS(s, p, q - 1);
            if (m1 > m2) {
                c[p][q] = m1;
                b[p][q] = 1;
            } else {
                c[p][q] = m2;
                b[p][q] = 3;
            }
        }
        return c[p][q];
    }
}
