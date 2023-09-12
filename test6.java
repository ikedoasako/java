//条件に合わせて処理を変える

import java.util.*;

public class test6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(number);

        if (number == 10) {/*標準入力から受け取ったデータが10だった場合*/
            System.out.println("Welcome");/*Welcomeと表示させる*/
        /*さらに条件を追加*/
        } else if (number > 10) {
          System.out.println("Good morning");/*numberが10より小さかったらGood morningと表示させる*/
        } else {/*条件の追加1*/
          System.out.println("Goodbye");/*numberが10以外だった場合Goodbyeと表示させる*/
        }
    }
}
