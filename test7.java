//文字列の一致を判定
//equalsメソッド

import java.util.*;

public class test7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); /*標準入力から受け取った文字列*/
        String name = scan.next(); /*受け取った文字列を変数nameに代入し*/
        System.out.println("Hello " + name); /*”Hello”という文字列とnameを連結させて表示させる*/

        /*入力した文字がJavaと一致したらWelcomeと表示させる*/
        if (name.equals("Java")) {
          System.out.println("Welcome");

          /*else ifとelseを使って条件を追加*/
        } else if (name.equals("JAVA")) {
          System.out.println("こんにちは"); /*大文字のJAVAを入力したら「こんにちは」と表示させる*/
        } else {
          System.out.println("Goodbye"); /*それ以外の文字列の場合「Goodbye」と表示させる*/
        }
    }
}
