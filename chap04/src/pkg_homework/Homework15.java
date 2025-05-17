package pkg_homework;

import java.util.Scanner;

public class Homework15 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        while (true) {
            
            System.out.print("문자열 : ");
            String s = sc.nextLine();
            
            System.out.print("문자 : ");
            char c = sc.nextLine().charAt(0);

            int cnt = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c) cnt++;
            }

            System.out.println("포함된 개수 : " + cnt);

            System.out.print("다시 입력하시겠습니까? : ");
            String decider = sc.nextLine();


            if (!(decider.equals("Y") || decider.equals("y") || decider.equals("N") || decider.equals("n"))) {
                while (true) {
                    System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
                    System.out.print("다시 입력하시겠습니까? : ");
                    decider = sc.nextLine();
                    if (decider.equals("Y") || decider.equals("y") || decider.equals("N") || decider.equals("n")) break;
                }
            }

            if (decider.equals("N") || decider.equals("n")) break;

        }

        sc.close();

    }
}
