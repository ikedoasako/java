//複数データを分類

import java.util.*;

public class test11 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int count = scan .nextInt();

    //ループ処理
    for (int i = 0; i < count; i++) {
    //受け取った整数データを変数numberに代入し
      int number = scan.nextInt();

    //printlnで表示させる
      System.out.println(number);
    }
  }
}