//ブロックの書き方

//波括弧を省略した書き方

public class practice3_3 {
  public static void main(String[] args) {
    boolean tenki = true; /*ここでfalseかtrueを代入*/
    if (tenki == true) { /*内容が2行のため波括弧は省略不可能*/
      System.out.println("洗濯をします");
      System.out.println("散歩に行きます");
    } else /*1行しかないので波括弧は省略可能*/
      System.out.println("DVDを見ます");
  }
}