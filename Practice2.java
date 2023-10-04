//練習問題1-3
/*
①true
②駆
③3.14
④314159265853979L
⑤ミナトの攻撃！敵に15ポイントのダメージを与えた。
・この5つの値を格納するのに適した型を考える
・「初期化」による宣言を行うソースコードを作成する
・変数名はJavaのルールに従ったものにすること
・2つ以上の型が考えられる場合はそのどちらでも良い
*/

public class Practice2 {
  public static void main(String[] args) {

    boolean result = true;
    char favoriteCharacter = '翔';
    double pi = 3.14;
    long number = 14159265853979L;

    String msg = "ミナトの攻撃！敵に15ポイントのダメージを与えた。";
    System.out.println(msg);
  }
}
/*
boolean＝真意値(trueかfalse) boolean isError; エラーか否か
boolean isError; isError = true; 意味：エラーである
boolean result; result = false; 意味：結果は失敗
trueのことを「真」
falseのことを「偽」
*/

/*
char型は全角・半角問わず「1文字」を代入できる型（'）
String型は文字列（0文字以上の文字の集まり）を代入できる型（"）
「文字」データを記述する場合は引用符（'）
「文字列」データを記述する場合は二重引用符（"）を使用する
*/

/*
doubleやfloatは「3.14」や「-15.2」といった少数部を含む数値を代入するための型
doubleの方がfloatより厳密な計算を行うことができる
少数を扱いたい場合にはdouble型を使用する
*/