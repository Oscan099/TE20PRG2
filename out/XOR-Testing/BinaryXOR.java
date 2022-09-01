import  java.util.Scanner;

public class BinaryXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int k = 2001;
        int c;

        c=m^k;
        System.out.println(m^k);
        System.out.println("Encrypt");

        System.out.println(Integer.toBinaryString(m));
        System.out.println(Integer.toBinaryString(k));
        System.out.println(Integer.toBinaryString(c));

        System.out.println(c^k);
        System.out.println("Decrypt");
    }

    }

