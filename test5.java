//条件が一致したら処理を実行する

import java.util.*;
//標準入力から受け取った整数データを実行する
public class test5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(number);/*数字を入力するとそのまま表示される*/

//受け取ったデータが10だった場合Welcomeと表示させる
        if (number == 10) {
          /*==はnumberと10が一致していたらという意味*/
          /*=ではなく==を使うのは代入の=と区別するため*/
            System.out.println("Welcome");
            /*条件に一致した時の処理を（）内に書く*/
            /*条件が一致していなければ（）の中のコードを実行しない*/
            /*==を使うと数値が一致しているか判定する*/
        }
    }
}