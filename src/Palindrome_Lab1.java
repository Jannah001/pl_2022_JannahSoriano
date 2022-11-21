import java.util.Scanner;

public class Palindrome_Lab1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = scanner.nextLine();

        int j, s;
        j = 0;
        s = str.length() - 1;

        while (j < s) {
            while (str.charAt(j) == ' '){
                j++;
            }
            if(str.equalsIgnoreCase(String.valueOf(j)) == str.equalsIgnoreCase(String.valueOf(s)) ){
                j++;
                s--;
            }
            else {
                break;
            }
        }
        //checking whether palindrome or not
        if (j <= s) {
            System.out.println(str + " is a palindrome ");
        } else {
            System.out.println(str + " is NOT a palindrome");
        }
    }
}











