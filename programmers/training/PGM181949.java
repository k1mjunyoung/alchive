package training;

import java.util.Scanner;

public class PGM181949 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < a.length(); i++) {
          char c = a.charAt(i);
          if (Character.isUpperCase(c)) {
            c = Character.toLowerCase(c);
          } else if (Character.isLowerCase(c)) {
            c = Character.toUpperCase(c);
          } 
          sb.append(c);
        }

        System.out.println(sb);
    }
  
}
