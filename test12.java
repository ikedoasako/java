//受け取ったデータに合わせて表示するプログラム

import java.util.*;

public class test12 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int count = scan.nextInt();


    //ループ処理
    for (int i = 0; i < count; i++) {
      //繰り返し処理の中で、受け取った整数データを変数numberに代入しprintlnで表示させる
      int number = scan.nextInt();
      System.out.println(number);


      //変数numberが10だったら　変数”numberは10に等しい”と表示する
      if (number == 10) {
        System.out.println(number + "は10に等しい");

      //10と等しくなくて、10より大きかったら　変数”numberは10より大きい”と表示する
      } else if (number > 10) {
        System.out.println(number + "は10より大きい");

      //どちらの条件も成立しない場合　変数”numberは10未満”と表示する
      } else {
        System.out.println(number + "は10未満");
      }
    }
  }
}