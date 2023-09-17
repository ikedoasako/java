//同じ処理を繰り返す

public class test8 {
  public static void main(String[] augs) {
    String message = "Hello world";

    /*繰り返し処理（ループ処理）をするときにはforを使う*/
    for (int i = 0; i < 3; i++) {
      System.out.println(message);
    }
  }
}
//for (int I = 0; i < 3; i++) {
//()の中のi 0 i 5 i　のことを「カウンタ変数」と呼ぶ（繰り返しカウンタに使用）
//++（プラスプラス）は変数iの値を1増やすという演算子