//複数のデータを受け取る
//ループ処理で Scanner オブジェクトを使用し、標準入力から複数のデータを受け取る


//受け取った数字を表示させるプログラム
import java.util.*;

public class test9 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int count = scan.nextInt();
    System.out.println(count);

    //受け取った数字の数だけ表示を繰り返すプログラムにする
    for (int i = 0; i < count; i++) {
      System.out.println("Hello world");
    }
  }
}
/*forで繰り返し処理を実行
繰り返し条件（　i  < count）で変数countを指定している
変数で繰り返し回数を指定しているため、入力タブで受け取った回数だけ
ループ処理を実行する*/