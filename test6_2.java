//確認問題
//整数データを1つ受け取る
//受け取ったデータが100より大きければ、そのデータを表示する
//100より小さければ「100以下です」と表示させる

import java .util.*;


public class test6_2 {
  public static void main(String[] augs) {
    Scanner scan = new Scanner(System.in);
    int number = scan.nextInt();

    if (number > 100) {/*変数numbeが100より大きかったらr*/
    System.out.println(number);/*それを表示させる*/
    } else {/*変数numberが100より大きくなかったら*/
      System.out.println("100以下です");/*（）内のメッセージを表示させる*/
    }

  }
}