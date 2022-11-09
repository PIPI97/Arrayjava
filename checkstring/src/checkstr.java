import com.sun.jdi.CharType;
import com.sun.jdi.CharValue;

import java.util.Objects;
import java.util.Scanner;

public class checkstr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str = sc.nextLine();
        System.out.println("character :");
        char ch = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        if (count != 0) {
            System.out.println("find " + count + " characters '" +ch +"' in string: '" + str+"'");
        } else {
            System.out.println("Character '"+ ch +"' dont found in string '" + str+"'");

        }
    }
}


