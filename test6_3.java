//受け取った整数データが100に等しい場合、その整数データを表示する
//受け取った整数データが、100 より大きい場合メッセージを表示する「100より大きい」
//受け取った整数データが、100 より小さい場合メッセージを表示する「100より小さい」

import java.util.*;

public class test6_3 {
  public static void main(String[] augs) {
    Scanner scan = new Scanner(System.in);
    int number = scan.nextInt();

    if (number == 100) {
      System.out.println(number);
    } else if (number > 100) {
      System.out.println("100より大きい");
    } else {
      System.out.println("100より小さい");
    }
  }
}