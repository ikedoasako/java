//3-2章

//天気による行動の変化をjavaで表す

public class practice3_1 {
  public static void main(String[] args) {
    boolean tenki = true;
    if (tenki == true) {
      System.out.println("洗濯をします");
      System.out.println("散歩に行きます");
    } else {
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