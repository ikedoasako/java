import java.util.*;

public class test10 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int count = scan.nextInt(); /*入力タブから繰り返し回数を受け取り、変数countに代入する*/
    System.out.println(count);

    //表示するメッセージを毎回変える
    //メッセージ内容を変えるために、繰り返し処理の中で表示するデータを受け取る
    for (int i = 0; i < count; i++) {
      /*forで指定回数だけ処理を繰り返す*/
      String name = scan.next();
      /*繰り返し処理の中で、さらに入力タブから文字列を受け取り、それを変数nameに代入する*/
      System.out.println("Hello " + name);
      /*Hello と変数 nameを連結して printlnで表示させる*/

    }
  }
}