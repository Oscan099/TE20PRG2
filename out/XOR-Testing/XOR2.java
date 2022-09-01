import java.io.*;

class XORtest2 {


    static String  xoring(String a, String b, int n){
        String ans = "";

        for (int i = 0; i < n; i++)
        {

            if (a.charAt(i) == b.charAt(i))
                ans += "0";
            else
                ans += "1";
        }
        return ans;
    }


    public static void main (String[] args)
    {
        String a = "1010";
        String b = "1101";
        int n = a.length();
        String c = xoring(a, b, n);
        System.out.println(c);
    }
}