//3章-2

//トイレの空きを待つ繰り返し処理

public class practice3_2 {
  public static void main(String[] args) {
    boolean doorClose = false; /*ここでtrueかfalseを代入*/
    while (doorClose == true) {
      /*(doorClose == true)の部分は「ドアが閉まっている間は」*/
      System.out.println("ノックする");
      System.out.println("1分待つ");
    }
  }
}

/*
7行目がtrueの場合、このプログラムを実行すると無限ループになる
"ノックする"と"1分待つ"のメッセージの繰り返しが続く

whileという命令を使えば繰り返し制御を行うことができる
（whileは『〜の間は』という意味の英単語）
whileの後ろの（）内には「ドアが閉まっている」などの繰り返しを続ける条件を書く
繰り返しの条件が成立している限、何度でも直後のブロック{}の中身だけが繰り返し実行される
*/

/*
7行目がfalseの場合、何も表示されない
*/