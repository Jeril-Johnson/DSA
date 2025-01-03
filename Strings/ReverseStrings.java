import java.util.*;

public class ReverseStrings {

    static String Reverse1(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    static String Reverse2(String str) {
        int l = 0, r = str.length();
        char[]arr=str.toCharArray();
        char temp;
        while (l < r) {
            temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to reverse:");
        String str = sc.nextLine();
        // String revStr=new StringBuilder(str).reverse().toString();
        System.out.println("Reverse 1 " + Reverse1(str));
        System.out.println("Reverse 2 " + Reverse1(str));
        sc.close();
    }
}