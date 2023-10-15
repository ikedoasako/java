//3章-1

//天気による行動の変化をjavaで表す

public class practice3_1 {
  public static void main(String[] args) {
    boolean tenki = true;
    if (tenki == true) { /*もし変数tenkiがtrueだったら*/
      /*変数tenkiがtrueかどうかのチェックを行うには==（イコール記号2つ）を使う*/

      System.out.println("洗濯をします"); /*条件分岐が成立していれば()の直後にある{}ブロックの中身だけを実行する*/
      System.out.println("散歩に行きます");
    } else { /*そうでなければ*/
      /*条件分岐が成立していなければ、elseの後ろにある{}ブロックで囲まれた中身だけを実行する*/
      System.out.println("DVDを見ます");
    }
  }
}

/*
上記のコードの実行結果

7行目でtrueを代入した時
洗濯をします
散歩に行きます

7行目でfalseを代入した時
DVDを見ます
*/